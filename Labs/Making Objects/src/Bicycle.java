public class Bicycle extends Vehicle {
    private boolean hasBell;

    // constructor 
    public Bicycle(int speed, double fuel, boolean hasBell) {
        super(speed, fuel);
        this.hasBell = hasBell;
    }

    @Override
    public void start() {
        System.out.println("Bicycle has started. Pedal onwards!");
    }

    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring ring!");
        } else {
            System.out.println("This bicycle does not have a bell.");
        }
    }

    //getter
    public boolean hasBell() {
        return hasBell;
    }

    // setter
    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}