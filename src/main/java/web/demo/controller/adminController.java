package web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.demo.model.*;
import web.demo.service.adminService;

import java.util.List;




@RestController
@CrossOrigin(origins = "*")
public class adminController {


    @Autowired
    private adminService adminservice;

    @PostMapping("/admin/add")
    public admin createAdmin(@RequestBody admin Admin){
        admin Admin1 = adminservice.createAdmin(Admin);
        return Admin1;
    }
    @GetMapping("/admin/getall")
    public List<admin> getAllAdmins(){
        return adminservice.getAdmins();
    }
    @PutMapping("/admin/update/{id}")
    public admin updateAdminbyid(@RequestBody admin Admin,@PathVariable("id") Integer id){
         return  adminservice.updateAdmin(Admin,id);
    }
    @DeleteMapping("/admin/delete/{id}")
    public String deleteadmin(@PathVariable("id") Integer id){
        adminservice.deleteAdmin(id);
        return "admin deleted successfully";
    }
    @GetMapping("/admin/getadminbyid/{id}")
    public admin getadminbyid(@PathVariable("id") Integer id){
        return adminservice.getAdminbyId(id);
    }



















    //login later
    @GetMapping("admin/{cin2}/{mail2}/{password2}")
    //@CrossOrigin(origins = "http://localhost:4200/")
    public int adminlogin(@PathVariable("cin2") Integer cin1,@PathVariable("mail2") String mail1,@PathVariable("password2") String password1){
        int flag= adminservice.loginValidation(cin1,mail1, password1);
        if(flag==0){
            return  0;
        }
        else{
            return flag;
        }
    };
}
