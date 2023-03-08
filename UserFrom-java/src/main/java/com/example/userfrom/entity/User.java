package com.example.userfrom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String firstname ;
    private String lastname ;
    private String adresse  ;
    private String tele ;
    private String birthday ;

    public User(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getBirthday() {
        return birthday;
    }

    public User(String firstname, String lastname, String adresse, String tele, String birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.adresse = adresse;
        this.tele = tele;
        this.birthday = birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
