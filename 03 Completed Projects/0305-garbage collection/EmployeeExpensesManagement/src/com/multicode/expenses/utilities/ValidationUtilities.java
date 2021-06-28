package com.multicode.expenses.utilities;

import com.multicode.expenses.exceptions.*;

public class ValidationUtilities {

    public int validateEmployeeID(String value) throws InvalidEmployeeIDException {
        try  {
            return Integer.parseInt(value);
        }
        catch (Exception e) {
            throw new InvalidEmployeeIDException();
        }
    }

    public void validateEmployeeName(String firstName, String surname) throws NameIsTooShortException {
        if(firstName.length() + surname.length() < 6) throw new NameIsTooShortException();
    }
}
