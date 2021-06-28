package com.multicode.expenses.domain;

import com.multicode.expenses.domain.types.*;

import java.math.*;
import java.util.*;

public class AccomodationExpenseItem implements ExpenseItem {

    AccomodationType typeOfAccomodation;
    private int id;
    private int claimId;
    private String description;
    private BigDecimal amount;

    public void setTypeOfAccomodation(AccomodationType typeOfAccomodation) {
        this.typeOfAccomodation = typeOfAccomodation;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public AccomodationExpenseItem(int id, int claimId, String description, BigDecimal amount, AccomodationType typeOfAccomodation) {
        this.id = id;
        this.claimId = claimId;
        this.description = description;
        this.amount = amount;
        this.typeOfAccomodation = typeOfAccomodation;
    }

    public AccomodationType getTypeOfAccomodation() {
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
