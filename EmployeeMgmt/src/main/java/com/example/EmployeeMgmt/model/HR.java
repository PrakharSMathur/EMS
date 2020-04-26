package com.example.EmployeeMgmt.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Transient;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "HR")
public class HR {
    public static final String SEQUENCE_NAME = "HR_Sequence";
    @Id
    String id;
    int user_type;
    String name;
    String password;
    String phone;
    String email;
    String location;
    String security_clearance;

    public HR() {

    }

    public HR(String id, int user_type, String name, String password, String phone, String email, String location, String security_clearance) {
        super();
        this.id = id;
        this.user_type = user_type;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.location = location;
        this.security_clearance = security_clearance;
    }

    public HR(int generateLeaveSequence, int i, String deol, String root, String s, String s1, String southindia) {
    }

    @Override
    public String toString() {
        return "HR [hrId=" + id + ", user_type=" + user_type + ", name=" + name + ", password=" + password + ", phone="
                + phone + ", email=" + email + ", location=" + location + ", security_clearance=" + security_clearance + "]";
    }

    public String getSecurity_clearance() {
        return security_clearance;
    }

    public void setSecurity_clearance(String security_clearance) {
        this.security_clearance = security_clearance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    /*
    JSON request format
    {
   		"user_type":1,
  		"name":"",
  		"password":"",
  		"phone":"",
  		"email":"",
  		"location":"",
  		"security_clearance":""
	}
     */
}
