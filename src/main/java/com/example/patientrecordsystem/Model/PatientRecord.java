package com.example.patientrecordsystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientRecord {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String address;
    private Integer age;

//    public PatientRecord(Long id, String name, String address, Integer age) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
