package devices;

public class Car {
    private final String model;
    private final String producer;
    private int horsepower;
    private int doorsNumber;
    private int price;


    public Car(String model, String producer, int horsepower, int doorsNumber, int price) {
        this.doorsNumber = doorsNumber;
        this.model = model;
        this.horsepower = horsepower;
        this.producer = producer;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return model + " " + producer + " " + horsepower + " " + doorsNumber + " " + price;
    }
}
