package web.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.demo.model.*;

import java.util.List;

@Service
public interface adminService {
    public admin createAdmin(admin ad);

    public List<admin> getAdmins();

    public admin getAdminbyId(Integer id);
    public void deleteAdmin(Integer id);

    public admin updateAdmin(admin a , Integer id);
    public int loginValidation(String username,String password);
}
