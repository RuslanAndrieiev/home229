package ait.cars.model;

public class Ford extends Car {
    private String company;
    private String name;

    public Ford(int regNumber, String model, String company, double engine, String color, String name, String company1) {
        super(String.valueOf(regNumber), model, company, engine, color);
        this.name = name;
        this.company = company1;
    }
}
