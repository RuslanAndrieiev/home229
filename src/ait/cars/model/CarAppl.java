package ait.cars.model;

public class CarAppl {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Ford(1234, "Akura", "Ford", 76, "Black", " ", " ");
        cars[1] = new Subaru(4567, "Speyder", "Subaru", 126, "Red", " ", " ");
        cars[2] = new Reno(7894, "Guga", "Reno", 98, "Red", " ", " ");
        cars[3] = new Bmw(2048, "Super", "Bmw", 100, "Red", " ", " ");
        printArray(cars);

    }

    private static void printArray(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);


        }
    }
}
