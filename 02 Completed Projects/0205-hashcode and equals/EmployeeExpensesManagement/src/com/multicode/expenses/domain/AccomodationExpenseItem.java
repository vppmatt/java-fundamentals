package com.multicode.expenses.domain;

import java.math.*;
import java.util.*;

public class AccomodationExpenseItem extends ExpenseItem {
    String typeOfAccomodation;

    public AccomodationExpenseItem(int id, int claimId, String description, BigDecimal amount, String typeOfAccomodation) {
        super(id, claimId, description, amount);
        this.typeOfAccomodation = typeOfAccomodation;
    }

    public String getTypeOfAccomodation() {
        return typeOfAccomodation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccomodationExpenseItem that = (AccomodationExpenseItem) o;
        return Objects.equals(typeOfAccomodation, that.typeOfAccomodation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfAccomodation);
    }

    @Override
    public String toString() {
        return "AccomodationExpenseItem{" +
                "typeOfAccomodation='" + typeOfAccomodation + '\'' +
                "} " + super.toString();
    }
}
