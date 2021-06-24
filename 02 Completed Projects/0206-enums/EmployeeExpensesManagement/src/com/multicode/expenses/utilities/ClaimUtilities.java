package com.multicode.expenses.utilities;

import com.multicode.expenses.domain.*;

import java.time.*;

public class ClaimUtilities {

    public int howOldIsTheClaim(ExpenseClaim expenseClaim) {
        Period period = Period.between(expenseClaim.getDateOfClaim(), LocalDate.now());
        return period.getDays();
    }
}
