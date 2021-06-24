public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setFirstName("Sally");

        Employee employee2 = new Employee();
        employee2.setFirstName("Deborah");

        Employee employee3 = new Employee("Mr", "Philp", "Philipson");

        ExpenseClaim claim1 = new ExpenseClaim(1,3,"2021-03-17", 1630);
        ExpenseItem item1 = new ExpenseItem(172,1,"Hotel accomodation", "The Hilton, Paris", 200);


    }
}
