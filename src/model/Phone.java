package model;

public class Phone {
    private String number;

    public Phone(String number) {
        if (isValidPhoneNumber(number)) {
            this.number = number;
        } else {
            this.number = "XXXX";
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isValid() {
        return isValidPhoneNumber(number);
    }

    private boolean isValidPhoneNumber (String number) {
        return number.length() == 9;
    }
}
