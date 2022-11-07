package UMLAssociations;

import java.util.ArrayList;
import java.util.Arrays;

public class Composition {

    public static void main(String[] args) {
        // Folder ◄►----------- File
        // Folder is owner of File
        // Folder has own life cycle, File has not own life cycle, when folder dies files also dies
        // Folder "has a" collection of Files, File is "Part of" Folder

        ArrayList<File> files = new ArrayList<>( Arrays.asList(
                new File("fileA","content of file A"),
                new File("fileB", "content of file B"),
                new File("fileZ", "content of file Z")
        ));

        Folder folder = new Folder( files);

        System.out.println(folder);

        // CompanyLocation -----------◄► Company
        // Company is owner of CompanyLocations
        // companyLocation has not own life cycle, when Company is deleted then companyLocation
        // "Has a" and "Part of" relationship

        ArrayList<CompanyLocation> companyLocations = new ArrayList<>( Arrays.asList(
                new CompanyLocation("Mexico", "CDMX"),
                new CompanyLocation("Mexico", "Guadalajara"),
                new CompanyLocation("Mexico", "Monterrey")));

        Company myCompany = new Company("McDuck", "5578758748", companyLocations);

        System.out.println("Company: " + myCompany);

        // Vehicle ◄►------------- Parts
        // Parts has not own life cycle
        // Vehicle is owner of Parts
        // Parts has not own life cycle, when Vehicle is deleted then parts are deleted
        // Not exactly a natural real example because parts can exist without a vehicle

        Vehicle audi = new Vehicle("Audi", 2022, new ArrayList<>(Arrays.asList(
                new Part("AudiEngine"),
                new Part("AudiBody"))));

        System.out.println("Vehicle: " + audi);
    }


}
