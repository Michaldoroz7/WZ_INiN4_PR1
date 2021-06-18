package devices;

import com.company.Human;
import com.company.Salleable;

public class Phone extends Device implements Salleable {
    double screenSize;
    int price;

    public Phone(String model, String producer, Integer yearOfProduction, int price, double screenSize) {
        super(model, producer, yearOfProduction);

        this.price = price;
        this.screenSize = screenSize;

    }

    @Override
    public void turnOn() {
        System.out.println("Im Turning ON!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == this) {
            if (seller.cash >= price) {
                buyer.cash -= price;
                buyer.phone = seller.phone;
                seller.phone = null;
                seller.cash += price;
                System.out.println("Transaction success.");
            } else {
                System.out.println("Not enough money.");
            }
        } else {
            System.out.println("Seller doesnt have this phone");
        }
    }
    }

