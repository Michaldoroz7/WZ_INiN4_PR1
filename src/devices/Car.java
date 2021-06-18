package devices;

import com.company.Human;
import com.company.Salleable;

public class Car extends Device implements Salleable {
        int horsepower;
        int doorsNumber;
        int price;

        public Car(String model,String producer, Integer yearOfProduction, int horsepower, int doorsNumber, int price ) {
        super(model, producer, yearOfProduction);

        this.doorsNumber = doorsNumber;
        this.horsepower = horsepower;
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return horsepower + doorsNumber + " " + price;
    }

    @Override
    public void turnOn() {
        System.out.println("Im turning ON!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.car == this) {
            if (seller.cash >= price) {
                buyer.cash -= price;
                buyer.car = seller.car;
                seller.car = null;
                seller.cash += price;
                System.out.println("Transaction success.");
            } else {
                System.out.println("Not enough money.");
            }
        } else {
            System.out.println("Seller doesnt have this car");
        }
    }
}
