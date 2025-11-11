interface Refuelable {
    void refuel();
}

class Vehicle {
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(model + " is charging with " + batteryCapacity + " kWh battery.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelCapacity; // in liters

    public PetrolVehicle(String model, int maxSpeed, double fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with " + fuelCapacity + " liters of petrol.");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 220, 75);
        PetrolVehicle pv = new PetrolVehicle("Honda Civic", 180, 45);

        System.out.println("=== Electric Vehicle ===");
        ev.displayDetails();
        ev.charge();
        System.out.println();

        System.out.println("=== Petrol Vehicle ===");
        pv.displayDetails();
        pv.refuel();
    }
}
