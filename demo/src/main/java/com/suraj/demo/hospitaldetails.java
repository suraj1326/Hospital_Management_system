package com.suraj.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hospinfo")
public class hospitaldetails {
 @Id
    private String p_id;
 private String p_name;
 private String p_address;
 private String p_disease;
public hospitaldetails() {
}
public hospitaldetails(String p_id, String p_name, String p_address, String p_disease) {
    this.p_id = p_id;
    this.p_name = p_name;
    this.p_address = p_address;
    this.p_disease = p_disease;
}
public String getP_id() {
    return p_id;
}
public void setP_id(String p_id) {
    this.p_id = p_id;
}
public String getP_name() {
    return p_name;
}
public void setP_name(String p_name) {
    this.p_name = p_name;
}
public String getP_address() {
    return p_address;
}
public void setP_address(String p_address) {
    this.p_address = p_address;
}
public String getP_disease() {
    return p_disease;
}
public void setP_disease(String p_disease) {
    this.p_disease = p_disease;
}

}
