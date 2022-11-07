package UMLAssociations;

import java.util.ArrayList;

public class Aggregation {

    public static void main(String[] args) {

        // Department <>------------ Employee
        // Both entities has his own life cycle
        // Departement is owner of Employee
        // "Has a" relationship

        Employee employeeA = new Employee("Hugo", "Security", 25, 1000);
        Employee employeeB = new Employee("Paco", "Developer", 25, 1000000);
        Employee employeeC = new Employee("Luis", "Sales", 25, 5000);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add( employeeA);
        employees.add( employeeB);
        employees.add( employeeC);

        Department departmentCentral = new Department("Central", employees);

        System.out.println("Department: " + departmentCentral);
    }

}
