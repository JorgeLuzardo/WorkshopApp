package model;

import java.util.Date;
public class Repair {
    private static int NEXT_ID = 0;
    private final int id;
    private Date date;
    private String description;
    private int effort;
    private BreakdownTypes breakdownType;

    public Repair(Date date, String description, int effort, BreakdownTypes breakdownType) {
        this.id = NEXT_ID++;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.breakdownType = breakdownType;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public BreakdownTypes getBreakdownType() {
        return breakdownType;
    }

    public void setBreakdownType(BreakdownTypes breakdownType) {
        this.breakdownType = breakdownType;
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Repair ID: ").append(this.id).append("\n");
        info.append("Date: ").append(this.date).append("\n");
        info.append("Description: ").append(this.description).append("\n");
        info.append("Effort: ").append(this.effort).append("\n");
        info.append("Breakdown Type: ").append(this.breakdownType).append("\n");
        return info.toString();
    }

    public int price() {
        int basePrice = 150;
        int totalPrice = basePrice + this.effort;
        return totalPrice;
    }
}
