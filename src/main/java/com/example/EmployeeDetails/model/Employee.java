package com.example.EmployeeDetails.model;

import jakarta.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empid;
    @Column
    private String emp_name;
    @Column
    private String emp_salary;
    @Column
    private String emp_age;

    public Employee(Long empid, String emp_name, String emp_salary, String emp_age) {
        this.empid = empid;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
        this.emp_age = emp_age;
    }

    public Employee() {
    }
    public Long getEmployeeId() {
        return empid;
    }

    public void setEmployeeId(Long employeeId) {
        this.empid = employeeId;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(String emp_salary) {
        this.emp_salary = emp_salary;
    }

    public String getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(String emp_age) {
        this.emp_age = emp_age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + empid +
                ", emp_name='" + emp_name + '\'' +
                ", emp_salary='" + emp_salary + '\'' +
                ", emp_age=" + emp_age +
                '}';
    }
}
