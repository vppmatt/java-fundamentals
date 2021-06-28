package com.multicode.expenses.domain;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    private List<Employee> employees;

    public Employees() {

        employees = new ArrayList<>();
    }

    public void addEmployee(Employee newEmployee) {
        employees.add(newEmployee);
    }

    public void printEmployees() {
        for(Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getMailingName());
            }
        }
    }

    public Employee findBySurname(String surname) {
        for(Employee employee : employees) {
            if(employee != null && employee.getSurname().equals(surname)) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getAll() {
        return this.employees;
    }
}
