package com.company;
import devices.Car;
import devices.Phone;

public class Human {

    private String firstName;
    private String lastName;
    private Animal pet;
    private Car car;
    private Phone phone;
    private Double salary;


    public Human(String firstName, String lastName, Animal pet, Car car, Phone phone) {
        this.car = car;
        this.pet = pet;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String toString() {
        return firstName + " " + lastName + " " + pet + " " + car + " " + salary;
    }

    public Double getSalary() {
        System.out.println("Now you checking your current salary and its: " + salary);
        return salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(this.salary > car.getPrice()) {
            System.out.println("You just bought new car!!");
            this.car = car;
        } else if (this.salary > (car.getPrice() / 12)) {
            System.out.println("Bank helped you with your car");
            this.car = car;
        } else {
            System.out.println("You dont have enough money, change work or something damn..");
        }

    }

    public void setSalary(Double salary) {

        if (salary < 0) {
            System.out.println("Why you want to set minus salary BRO");
        } else {
            System.out.println("Sent to accounting");
            System.out.println(".. You need to take annex to the contract for ms Hania");
            System.out.println("ZUS and US already know about your new salary :>");
            this.salary = salary;
        }
    }
}
