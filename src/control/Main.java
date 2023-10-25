package control;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public void init(RepairManager repairManager) {
        Mechanic mechanic1 = new Mechanic();
        mechanic1.name = "Pablo";
        mechanic1.surname = "Santana";
        Mechanic mechanic2 = new Mechanic();
        mechanic2.name = "Jorge";
        mechanic2.surname = "Luzardo";
        repairManager.addMechanic(mechanic1);
        repairManager.addMechanic(mechanic2);

        Customer customer1 = new Customer();
        customer1.name = "Alfredo";
        Phone phone1 = new Phone();
        phone1.number = "123456789";
        customer1.phone = phone1;
        Customer customer2 = new Customer();
        customer2.name = "Pedro";
        Phone phone2 = new Phone();
        phone2.number = "987654321";
        customer2.phone = phone2;

        Vehicle vehicle1 = new Vehicle();
        vehicle1.make = "Opel";
        vehicle1.model = "Corsa";
        vehicle1.plate = new Plate();
        vehicle1.plate.number = "1234BCD";
        vehicle1.customer = customer1;
        Vehicle vehicle2 = new Vehicle();
        vehicle2.make = "Toyota";
        vehicle2.model = "Prius";
        vehicle2.plate = new Plate();
        vehicle2.plate.number = "9876ZYX";
        vehicle2.customer = customer2;
        repairManager.addVehicle(vehicle1);
        repairManager.addVehicle(vehicle2);

        SparePart sparePart1 = new SparePart();
        sparePart1.name = "Neumático";
        sparePart1.price = 50;
        Item item1 = new Item();
        item1.quantity = 4;
        SparePart sparePart2 = new SparePart();
        sparePart2.name = "Bujías";
        sparePart2.price = 10;
        Item item2 = new Item();
        item2.quantity = 8;

        List<Item> stock = new ArrayList<>();
        stock.add(item1);
        stock.add(item2);
    }

    public static void main (String[] args) {
        RepairManager repairManager = new RepairManager();
        Main main = new Main();
        main.init(repairManager);

        Mechanic firstMechanic = repairManager.getMechanic();
        System.out.println("Mechanic 1: " + firstMechanic.name + " " + firstMechanic.surname);
        Vehicle secondVehicle = repairManager.getVehicle();
        System.out.println("Vehicle 2: " + secondVehicle.make + " " + secondVehicle.model + ", Plate: " + secondVehicle.plate.number + ", Customer: " + secondVehicle.customer.name);
        Repair repair = new Repair();
        repairManager.repair(secondVehicle, repair);
        Payment payment = new Payment();
        payment.amount = repair.price();
        repair.setPayment(payment);
        repairManager.deleteVehicle(firstVehicle);
        System.out.println("Número de vehículos: " + repairManager.getNumberOfVehicles());
        System.out.println("Información de la reparación: " + repair.getInfo());
    }
}
