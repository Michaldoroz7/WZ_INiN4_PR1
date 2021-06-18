package com.company;

public class Animal implements Salleable {

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

    public void feed() {
        this.weight += 5.0;

        if (this.weight <= 5.0){
            System.out.println("How you want to feed your dead pet");
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

