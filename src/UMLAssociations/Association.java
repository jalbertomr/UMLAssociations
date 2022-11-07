package UMLAssociations;

import java.util.ArrayList;
import java.util.Arrays;

public class Association {
    public static void main(String[] args) {

        Person personA = new Person("Hugo", 7);
        Person personB = new Person( "Paco", 8);
        Person siamesA = new Person( "SiamesA", 5);
        Person siamesB = new Person("SiamesB", 5);

        // Association
        // Person ----------- Person    bidirectional association, both has his own life cycle.
        personA.setConnectWith( personB);
        personB.setConnectWith( personA);
        // Person <>------------<> Person      Not used  BiAggregation
        // siamesA ◄►-----------◄► siamesB     Not used  BiComposition

        // Flight ----------- Plane     bidirectional association, but is most an Aggregation in "use" but an Opposite Composition in Life
        // Flight <>--------- Plane     Flight "uses-a" Plane, If the Flight dies the Plane Not, If the Plane die the Flight die
        // Flight <>-------◄► Plane     Flight "uses-a" Plane, Plane "has-a" Flight, Flight dies the plane Not, Plane dies then Flight dies.

        // Aggregation
        // PersonA <>-------- PersonB   This is an Aggregation, personA -- "has-a" | "uses-a" -- personB, both has his own life cycle.
        personA.setConnectWith( personB);

        // PersonA --------<> PersonB   This is an Aggregation, personB -- "has-a" | "uses-a" -- personA, both has his own life cycle.
        personB.setConnectWith( personA);

        // SiamesA ◄►-------- SiamesB  This is a Composition, SiamesA -- "has-a" | "uses-a" -- personB, SiamesA determines the both life cycles.
        siamesA.setConnectWith( siamesB);

        // SiamesA --------◄► SiamesB  This is a Composition,  SiamesB -- "has-a" | "uses-a" -- personA, SiamesB determines the both life cycles.
        siamesB.setConnectWith( siamesA);

        // SiamesA ◄►------◄► SiamesB  This is a Composition Not used.
        siamesA.setConnectWith( siamesB);
        siamesB.setConnectWith( siamesA);


        // Driver ----------- Vehicle
        // both has independent life cycle
        // Driver "Has a" or "Uses a" Vehicle

        ArrayList<Vehicle> vehiclePoolA = new ArrayList<>();
        vehiclePoolA.add( new Vehicle("Audi", 2022, new ArrayList<>(Arrays.asList( new Part("AudiEngine"), new Part("AudiChassis")))));
        vehiclePoolA.add( new Vehicle("Volce", 2022, new ArrayList<>(Arrays.asList( new Part("VolvoEngine"), new Part("VolvoChassis")))));

        Driver driver = new Driver();

        driver.rentVehicle(vehiclePoolA.get(0));
        driver.driveVehicle();
        driver.returnVehicle();
    }
}
