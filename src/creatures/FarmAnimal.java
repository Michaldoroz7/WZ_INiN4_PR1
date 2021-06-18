package creatures;

public class FarmAnimal extends Animal implements Edbile{


    public FarmAnimal(String species_, String name_) {
        super(species_, name_);
    }

    @Override
    public void beEaten() {

    }

    @Override
    public void feed(double foodWeight) {

    }
}
