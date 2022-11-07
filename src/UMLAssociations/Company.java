package UMLAssociations;

import java.util.ArrayList;

public class Company {
    public String name;
    public String Phone;
    public ArrayList<CompanyLocation> companyLocations;

    public Company(String name, String phone, ArrayList<CompanyLocation> companyLocations) {
        this.name = name;
        Phone = phone;
        this.companyLocations = companyLocations;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", companyLocations=" + companyLocations +
                '}';
    }
}
