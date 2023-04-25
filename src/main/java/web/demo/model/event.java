package web.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name="Event")

public class event {
    @Id
    Integer id_event;
    String name;
    String image_path ;
    String categorie;
    Date date_debut;
    Date date_fin;

    String description;
    Integer Byadmin;

    public event(Integer id_event, String name, String image_path, String categorie, Date date_debut, Date date_fin,String description, Integer byadmin) {
        this.id_event = id_event;
        this.name = name;
        this.image_path = image_path;
        this.categorie = categorie;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.Byadmin = byadmin;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public event(){
        super();
    }

    public Integer getId_event() {
        return id_event;
    }

    public void setId_event(Integer id_event) {
        this.id_event = id_event;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public Integer getByadmin() {
        return Byadmin;
    }

    public void setByadmin(Integer byadmin) {
        Byadmin = byadmin;
    }
}
