public class Car {
    private int numberOfDoors;

    public Car(int speed, double fuel, int numberOfDoors) {
        super(speed, fuel);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    start() {
        System.out.println("The car is starting! Be aware of what's in front of you while driving.");
        super.start();
    }

    public void honk() {
        System.out.println("Beep! Beep!");
    }

    // getter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // setter
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
