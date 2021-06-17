package devices;

public class Car extends Device{
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
}
