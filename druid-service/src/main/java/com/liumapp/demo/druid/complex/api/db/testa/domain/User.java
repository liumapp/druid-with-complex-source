package com.liumapp.demo.druid.complex.api.db.testa.domain;

import java.util.Date;

public class User {
    private Long id;

    private String name;

    private Byte age;

    private String sex;

    private Date creatat;

    private Date updateat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getCreatat() {
        return creatat;
    }

    public void setCreatat(Date creatat) {
        this.creatat = creatat;
    }

    public Date getUpdateat() {
        return updateat;
    }

    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }
}