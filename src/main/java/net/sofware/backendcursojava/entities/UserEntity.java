package net.sofware.backendcursojava.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "users")
public class UserEntity implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String userid ;

    @Column(nullable = false, length = 50)
    private String firstName ;

    @Column(nullable = false, length = 50)
    private String lastName ;

    @Column(nullable = false, length = 255)
    private String email ;

    @Column(nullable = false)
    private String encryptedPasword ;



    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncryptedPasword() {
        return encryptedPasword;
    }

    public void setEncryptedPasword(String encryptedPasword) {
        this.encryptedPasword = encryptedPasword;
    }


}
