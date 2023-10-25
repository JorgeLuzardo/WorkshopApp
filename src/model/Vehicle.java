package model;

public class Vehicle {
    private String make;
    private String model;
    private Plate plate;
    private Customer customer;

    public Vehicle(String make, String model, Plate plate, Customer customer) {
        this.make = make;
        this.model = model;
        this.plate = plate;
        this.customer = customer;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
