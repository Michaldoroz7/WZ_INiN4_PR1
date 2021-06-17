package devices;

public class Phone extends Device{
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
}
