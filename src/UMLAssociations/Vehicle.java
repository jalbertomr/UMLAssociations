package UMLAssociations;

import java.util.ArrayList;

public class Vehicle {
    public String brand;
    public Integer model;
    public ArrayList<Part> parts;

    public Vehicle(String brand, Integer model, ArrayList<Part> parts) {
        this.brand = brand;
        this.model = model;
        this.parts = parts;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", parts=" + parts +
                '}';
    }
}
