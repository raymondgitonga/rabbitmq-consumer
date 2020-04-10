package com.tosh.rabbitmqconsumer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.tosh.rabbitmqconsumer.json.CustomLocalDateDeserializer;

import java.time.LocalDate;

public class Employee {

    @JsonProperty("employee_id")
    private String employeeId;
    private String name;
    @JsonProperty("birth_date")
    @JsonDeserialize(using = CustomLocalDateDeserializer.class)
    private LocalDate birthDate;

    public Employee() {
    }

    public Employee(String employeeId, String name, LocalDate birthDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
