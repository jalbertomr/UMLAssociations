package UMLAssociations;

public class Employee {
    private String name;
    private String position;
    private Integer age;
    private double salary;

    public Employee(String name, String position, Integer age, double salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
