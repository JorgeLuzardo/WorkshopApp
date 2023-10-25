package model;

import java.util.List;
import java.util.ArrayList;

public class RepairManager {
    private List<Mechanic> mechanics;
    private List<Vehicle> vehicles;
    private List<Repair> repairs;

    public RepairManager() {
        this.mechanics = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.repairs = new ArrayList<>();
    }

    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Mechanic getMechanic() {
        return mechanics.get(0);
    }

    public Vehicle getVehicle() {
        return vehicles.get(0);
    }

    public void repair(Vehicle vehicle, Repair repair) {
        repairs.add(repair);
    }

    public int getNumberOfVehicles() {
        return vehicles.size();
    }

    public void deleteVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}
