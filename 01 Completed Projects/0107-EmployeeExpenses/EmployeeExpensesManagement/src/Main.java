public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setFirstName("Sally");

        Employee employee2 = new Employee();
        employee2.setFirstName("Deborah");

        System.out.println(employee1.getFirstName());
        System.out.println(employee2.getFirstName());

        employee1.setSurname("G");
        employee2.setSurname("Smith");

        employee2.setTitle("Mrs");

        System.out.println(employee2.getMailingName());

        Employee employee3 = new Employee("Mr", "Philp", "Philipson");
        System.out.println(employee3.getMailingName());
        System.out.println(employee3.getMailingName(true));
        System.out.println(employee3.getMailingName(false));
    }
}
