public class Employees {

    private Employee[] employees;
    private int nextPosition = 0;

    public Employees(int size) {
        employees = new Employee[size];
    }

//    //version 1 - using a loop
//    public void addEmployee(Employee newEmployee) {
//        for (int i = 0; i < employees.length; i++) {
//            if(employees[i] == null) {
//                employees[i] = newEmployee;
//                return;
//            }
//        }
//    }

    //version 2 - using a counter
    public void addEmployee(Employee newEmployee) {
        employees[nextPosition] = newEmployee;
        nextPosition++;
    }

    public void printEmployees() {
        for(Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getMailingName());
            }
        }
    }

    public Employee findBySurname(String surname) {
        for(Employee employee : employees) {
            if(employee != null && employee.getSurname().equals(surname)) {
                return employee;
            }
        }
        return null;
    }
}
