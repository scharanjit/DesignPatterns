package com.hibernate.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

    @Id
    private int s_id;

    private String name;

    private int age;

    @OneToOne(cascade= { CascadeType.REMOVE }) //it removes the subject too while we delete the student
    private Subject subj;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Subject getSubj() {
        return subj;
    }

    public void setSubj(Subject subj) {
        this.subj = subj;
    }

    @Override
    public String toString() {
        return "Student [s_id=" + s_id + ", name=" + name + ", age=" + age + ", subj=" + subj + "]";
    }
}