package UMLAssociations;

public class Person {
    String name;
    Integer age;
    Person connectWith;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person getConnectWith() {
        return connectWith;
    }

    public void setConnectWith(Person connectWith) {
        this.connectWith = connectWith;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", connectWith=" + connectWith +
                '}';
    }
}
