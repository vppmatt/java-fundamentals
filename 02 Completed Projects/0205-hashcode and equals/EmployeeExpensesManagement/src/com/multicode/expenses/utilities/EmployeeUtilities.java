package com.multicode.expenses.utilities;

import com.multicode.expenses.domain.*;

import java.math.*;

public class EmployeeUtilities {

    public BigDecimal totalOfAllClaims(Employees employees) {
        BigDecimal total = BigDecimal.ZERO;
        for (Employee employee : employees.getAll()) {
            if (employee != null) total = total.add(employee.getTotalOfExpenseClaims());
        }
        return total;
    }


 }
