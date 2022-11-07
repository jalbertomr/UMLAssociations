package UMLAssociations;

import java.util.ArrayList;

public class Department {
    public String name;
    public ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
