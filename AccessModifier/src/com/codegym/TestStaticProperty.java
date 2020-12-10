package com.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv1");
        System.out.println(Car.numberOfCars);
        System.out.println(car1);
        Car car2 = new Car("Mazda 8","Skyactiv2");
        System.out.println(Car.numberOfCars);
        System.out.println(car2);
    }
}
