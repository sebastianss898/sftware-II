package net.sofware.backendcursojava.shared.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    private long id;
    private String userid;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String ecryptePassword;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEcryptePassword() {
        return ecryptePassword;
    }
    public void setEcryptePassword(String ecryptePassword) {
        this.ecryptePassword = ecryptePassword;
    }

    


}
