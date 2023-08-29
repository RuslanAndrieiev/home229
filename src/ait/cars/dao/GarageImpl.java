package ait.cars.dao;

import ait.cars.model.Car;

public class GarageImpl implements Garage {


    @Override
    public boolean addCar(Car car) {
        return false;
    }

    @Override
    public Car removeCar(String regNumber) {
        return null;
    }

    @Override
    public Car findCarByRagNumber(String regNumber) {
        return null;
    }

    @Override
    public Car[] findCarByModel(String model) {
        return new Car[0];
    }

    @Override
    public Car[] findCarByCompany(String company) {
        return new Car[0];
    }

    @Override
    public Car[] findCarByEngine(double min, double max) {
        return new Car[0];
    }

    @Override
    public Car[] findCarByColor(String color) {
        return new Car[0];
    }
}
