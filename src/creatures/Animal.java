package creatures;

import com.company.Human;
import com.company.Salleable;

public abstract class Animal implements Salleable, Feedable {

    private final String species;
    private Double weight;
    private String name;

    public Animal(String species_, String name_) {

        this.name = name_;
        this.species = species_;
        if(this.species == "Husky"){
            this.weight = 40.0;
        }
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public void feed(double foodWeight) {
        if (weight <= 0)
        {
            System.out.println("Sorry, your animal is dead, you cant feed it anymore");
        } else {
            weight += foodWeight;
            System.out.println("my weight is now " + weight);
        }
    }

    @Override
    public void feed() {
        if (weight <= 0)
        {
            System.out.println("Sorry, your animal is dead, you cant feed it anymore");
        } else {
            weight += 0.1;
            System.out.println("my weight is now " + weight);
        }
    }

    void takeForAWalk() {
        this.weight -= 5.0;

        if (this.weight <= 5.0) {
            System.out.println("Your pet is dead...");
        }
    }

    public String toString() {
        return species + " " + name + " " + weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet == this) {
            if (seller.cash >= price) {
                buyer.cash -= price;
                buyer.pet = seller.pet;
                seller.pet = null;
                seller.cash += price;
                System.out.println("Transaction success.");
            } else {
                System.out.println("Not enough money.");
            }
        } else {
            System.out.println("Seller doesnt have this pet");
        }
    }
}

