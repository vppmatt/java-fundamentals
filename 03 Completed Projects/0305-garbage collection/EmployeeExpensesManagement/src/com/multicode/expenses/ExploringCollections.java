package com.multicode.expenses;

import com.multicode.expenses.domain.Employee;
import com.multicode.expenses.domain.Employees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ExploringCollections {
    public static void main(String[] args) {

        List<Employee> listOfEmployees = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setFirstName("Sally");
        employee1.setSurname("Davis");

        System.out.println("adding employee 1");
        listOfEmployees.add(employee1);
        System.out.println("list is now of size");
        System.out.println(listOfEmployees.size());
        System.out.println("the item in position 0 is");

        Employee foundEmployee = listOfEmployees.get(0);
        System.out.println(foundEmployee);


        Employee employee2 = new Employee();
        employee2.setFirstName("Deborah");
        employee2.setSurname("Smith");

        System.out.println("adding employee 2");
        listOfEmployees.add(employee2);
        System.out.println("list is now of size");
        System.out.println(listOfEmployees.size());

        Employee employee3 = new Employee("Mr", "Philp", "Philipson");

        System.out.println("adding employee 3, 3 times");
        listOfEmployees.add(employee3);
        listOfEmployees.add(employee3);
        listOfEmployees.add(employee3);

        System.out.println("list is now of size");
        System.out.println(listOfEmployees.size());
        System.out.println("the full list is");
        System.out.println(listOfEmployees);

        System.out.println("removing employee in position 1");
        listOfEmployees.remove(1);
        //note we can also do
        //listOfEmployees.remove(employee2);

        System.out.println("the full list is");
        System.out.println(listOfEmployees);

        //Loop version 1
        for (int i = 0; i < listOfEmployees.size(); i++) {
            System.out.println(listOfEmployees.get(i));
        }

        //Loop version 2
        for (Employee employee : listOfEmployees) {
            System.out.println(employee);
        }



        //HASHSETS
        System.out.println("NOW WORKING WITH HASHSETS");

        HashSet<Employee> setOfEmployees = new HashSet<>();

        System.out.println("adding employee 1");
        setOfEmployees.add(employee1);
        System.out.println("set is now of size");
        System.out.println(setOfEmployees.size());

        System.out.println("adding employee 2");
        setOfEmployees.add(employee1);
        System.out.println("set is now of size");
        System.out.println(setOfEmployees.size());

        System.out.println("adding employee 3, 3 times");
        setOfEmployees.add(employee3);
        setOfEmployees.add(employee3);
        setOfEmployees.add(employee3);

        System.out.println("set is now of size");
        System.out.println(setOfEmployees.size());
        System.out.println("the full set is");
        System.out.println(setOfEmployees);

        System.out.println("removing employee in position 1");
        setOfEmployees.remove(employee2);

        System.out.println("the full set is");
        System.out.println(setOfEmployees);

        for (Employee employee : setOfEmployees) {
            System.out.println(employee);
        }

    }
}
