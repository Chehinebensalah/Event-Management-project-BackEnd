package web.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;



@Entity
@Table(name="Admin")
public class admin {
    @Id
    Integer cin;
    String username;


    //@GeneratedValue
    String mail;
    String password;


    public admin(String username, String mail, String password, Integer cin) {
        super();
        this.username = username;
        this.mail = mail;
        this.password = password;
        this.cin=cin;
    }
    public admin(){
        super();
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCin() {
        return cin;
    }

    public void setCin(Integer cin) {
        this.cin = cin;
    }


}

