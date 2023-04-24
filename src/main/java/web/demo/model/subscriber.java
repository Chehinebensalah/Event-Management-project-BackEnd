package web.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Subscriber")
public class subscriber {
    @Id
    String mail ;
    String username ;

    public subscriber(String mail, String username) {
        this.mail = mail;
        this.username = username;
    }
    public subscriber(){
        super();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
