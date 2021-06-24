package com.multicode.expenses.utilities;

import com.multicode.expenses.domain.Employee;
import com.multicode.expenses.domain.Employees;

public class EmployeeUtilities {

    public double totalOfAllClaims(Employees employees) {
        double total = 0;
        for (Employee employee : employees.getAll()) {
            if (employee != null) total += employee.getTotalOfExpenseClaims();
        }
        return total;
    }
 }
