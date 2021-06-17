package devices;

public abstract class Device {
    private String model;
    private String producer;
    private Integer yearOfProduction;

    public Device(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }


    public String toString(){
        return model + producer + yearOfProduction;
    }

    public abstract void turnOn();
}
