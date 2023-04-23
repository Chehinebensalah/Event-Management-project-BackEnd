package web.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.demo.dbutil.DBUtil;
import web.demo.model.*;
import web.demo.repo.adminRepository;
import web.demo.service.adminService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class adminServiceimpl implements adminService {


    Connection connection;
    @Autowired
    private adminRepository adminrepository;

    @Override
    public admin createAdmin(admin ad) {
        return adminrepository.save(ad);
    }

    @Override
    public List<admin> getAdmins() {
        return ((List<admin>) adminrepository.findAll());
    }

    @Override
    public admin getAdminbyId(Integer id) {
        return adminrepository.findById(id).get();
    }

    @Override
    public void deleteAdmin(Integer id) {
        adminrepository.deleteById(id);
    }

    @Override
    public admin updateAdmin(admin a, Integer id) {
        admin Admin = adminrepository.findById(id).get();
        Admin.setMail(a.getMail());
        Admin.setUsername(a.getUsername());
        Admin.setPassword(a.getPassword());
        return adminrepository.save(Admin);
    }


    //login part later
    //Connection connection;
    int flag=0;
    public adminServiceimpl() throws SQLException {
        connection= DBUtil.getConnection();
    }

    @Override
    public int loginValidation(Integer cin ,String mail, String password) {
        try {
            PreparedStatement statement= connection
                    .prepareStatement("select * from admin where cin='"+cin+"'");
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                if(rs.getString(2).equals(mail) && rs.getString(3).equals(password)){
                    flag=1;
                }else{
                    System.out.println("Invalid username or password");
                    flag=0;
                };
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
