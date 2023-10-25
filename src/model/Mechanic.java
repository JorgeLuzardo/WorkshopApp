package model;

public class Mechanic {
    private String name;
    private String surname;

    // Constructor
    public Mechanic(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
