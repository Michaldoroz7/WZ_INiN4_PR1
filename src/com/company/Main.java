package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Husky", "Doggo");
        Car nissan = new Car("Skyline", "Nissna", 2001, 200, 3, 30000);
        Phone iphone = new Phone("XR", "Apple", 2017, 2500, 6.1);

        Human michu = new Human("Michał", "Doroz", dog, nissan, iphone);






    }


}
