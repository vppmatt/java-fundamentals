package com.multicode.expenses;

import com.multicode.expenses.domain.*;

import java.util.*;

public class EmployeeInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your employee ID");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter your title");
        String title = scanner.nextLine();

        System.out.println("Please enter your first name");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your surname");
        String surname = scanner.nextLine();

        System.out.println("Please enter your job title");
        String jobTitle = scanner.nextLine();

        System.out.println("Please enter your deparment");
        String department = scanner.nextLine();



        Employee employee = new Employee(id,title,firstName,surname,jobTitle,department, true);
        System.out.println(employee);

    }
}
