package com.multicode.expenses.domain;

import java.math.*;

public class AccomodationExpenseItem extends ExpenseItem {
    String typeOfAccomodation;

    public AccomodationExpenseItem(int id, int claimId, String description, BigDecimal amount, String typeOfAccomodation) {
        super(id, claimId, description, amount);
        this.typeOfAccomodation = typeOfAccomodation;
    }

    public String getTypeOfAccomodation() {
        return typeOfAccomodation;
    }
}
