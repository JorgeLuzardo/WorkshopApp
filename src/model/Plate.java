package model;

public class Plate {
    private String number;

    public Plate(String number) {
        if (isValidPlateNumber(number)) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("Formato de matrícula inválido.");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isValid() {
        return isValidPlateNumber(number);
    }

    private boolean isValidPlateNumber(String number) {
        return number.length() == 7;
    }
}
