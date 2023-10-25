package control;

import java.util.Date;
import model.*;

public class Main {

    public void init(RepairManager repairManager) {
        Mechanic mechanic1 = new Mechanic("Pablo", "Santana");
        Mechanic mechanic2 = new Mechanic("Jorge", "Luzardo");
        repairManager.addMechanic(mechanic1);
        repairManager.addMechanic(mechanic2);

        Phone phone1 = new Phone("123456789");
        Phone phone2 = new Phone("987654321");

        Customer customer1 = new Customer("Miguel", phone1);
        Customer customer2 = new Customer("Antonio", phone2);

        Plate plate1 = new Plate("1234BCD");
        Plate plate2 = new Plate("9876ZYX");

        Vehicle vehicle1 = new Vehicle("Toyota", "Prius", plate1, customer1);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", plate2, customer2);

        repairManager.addVehicle(vehicle1);
        repairManager.addVehicle(vehicle2);
    }

    public static void main(String[] args) {
        RepairManager repairManager = new RepairManager();
        Main main = new Main();
        main.init(repairManager);

        Mechanic firstMechanic = repairManager.getMechanic();
        System.out.println("Mechanic 1: " + firstMechanic.getName() + " " + firstMechanic.getSurname());

        Vehicle secondVehicle = repairManager.getVehicle();
        System.out.println("Vehicle 2: " + secondVehicle.getMake() + " " + secondVehicle.getModel() + ", Plate: " + secondVehicle.getPlate().getNumber() + ", Customer: " + secondVehicle.getCustomer().getName());

        Date currentDate = new Date();
        Repair repair = new Repair(currentDate, "Description", 3, BreakdownTypes.MECHANICAL);
        repairManager.repair(secondVehicle, repair);

        Payment payment = new Payment(currentDate, repair.price());

        Vehicle firstVehicle = repairManager.getVehicle();
        repairManager.deleteVehicle(firstVehicle);

        System.out.println("Número de vehículos: " + repairManager.getNumberOfVehicles());
        System.out.println("Información de la reparación: " + repair.getInfo());
    }
}
