package UMLAssociations;


public class Driver {
    private String name;
    private Vehicle assignedVehicle;

    public void rentVehicle(Vehicle vehicle){
        this.assignedVehicle =  vehicle;
    }

    public void driveVehicle(){
        System.out.println("drive vehicle: " + this.assignedVehicle);
    }

    public void returnVehicle(){
        this.assignedVehicle = null;
    };
}
