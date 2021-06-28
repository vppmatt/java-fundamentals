package com.multicode.expenses;

import com.multicode.expenses.domain.*;
import com.multicode.expenses.exceptions.*;
import com.multicode.expenses.utilities.*;

import java.util.*;

public class EmployeeInput {

    public static void main(String[] args) throws NameIsTooShortException {

        Scanner scanner = new Scanner(System.in);
        ValidationUtilities validationUtilities = new ValidationUtilities();

        int id = 0;
        boolean gotAValidId = false;

        while(!gotAValidId) {

            try {
                System.out.println("Please enter your employee ID");
                String idString = scanner.nextLine();

                id = validationUtilities.validateEmployeeID(idString);
                gotAValidId = true;
            } catch (InvalidEmployeeIDException e) {
                System.out.println("That id is not valid - please try again");
            }
        }


        System.out.println("Please enter your title");
        String title = scanner.nextLine();

        System.out.println("Please enter your first name");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your surname");
        String surname = scanner.nextLine();

        validationUtilities.validateEmployeeName(firstName,surname);

        System.out.println("Please enter your job title");
        String jobTitle = scanner.nextLine();

        System.out.println("Please enter your department");
        String department = scanner.nextLine();



        Employee employee = new Employee(id,title,firstName,surname,jobTitle,department, true);
        System.out.println(employee);

    }
}
