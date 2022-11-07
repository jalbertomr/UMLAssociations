package UMLAssociations;

public class CompanyLocation {
    public String country;
    public String city;

    public CompanyLocation(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "CompanyLocation{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
