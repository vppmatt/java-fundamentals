public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setFirstName("Sally");
        employee1.setSurname("Davis");

        Employee employee2 = new Employee();
        employee2.setFirstName("Deborah");
        employee2.setSurname("Smith");

        Employee employee3 = new Employee("Mr", "Philp", "Philipson");

        Employees employees = new Employees(5);
        employees.addEmployee(employee1);
        employees.addEmployee(employee2);
        employees.addEmployee(employee3);

        employees.printEmployees();

        Employee smith = employees.findBySurname("Smith");
        System.out.println(smith.getMailingName());


        ExpenseClaim claim1 = new ExpenseClaim(1,3,"2021-03-17", 16.30);
        ExpenseClaim claim2 = new ExpenseClaim(2,3,"2021-06-19", 37.50);

        smith.addExpenseClaim(claim1);
        smith.addExpenseClaim(claim2);
        System.out.println(smith.getTotalOfExpenseClaims());
        ExpenseItem item1 = new ExpenseItem(172,1,"Hotel accomodation", "The Hilton, Paris", 200);


    }
}
