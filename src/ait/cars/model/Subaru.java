package ait.cars.model;

public class Subaru extends Car{
    private String name;
    private String company;

    public Subaru(int regNumber, String model, String company, double engine, String color, String name, String company1) {
        super(String.valueOf(regNumber), model, company, engine, color);
        this.name = name;
        this.company = company1;
    }
}
