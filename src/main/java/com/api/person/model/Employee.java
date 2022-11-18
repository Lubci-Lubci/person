package com.api.person.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "number")
    private int number;

    @Column(name = "active")
    private boolean active;

    @Column(name = "hire_date")
    private Date hireDate;

    public Employee() {
    }

    public Employee(int number, boolean active, Date hireDate) {
        this.number = number;
        this.active = active;
        this.hireDate = hireDate;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }


    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", number=" + number + ", active=" + active + ", hireDate=" + hireDate + '}';
    }
}
