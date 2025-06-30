public class Vehicle{
    protected int speed;
    private double fuel;

    // constructor
    public Vehicle(int speed, double fuel) 
    {
        this.speed = speed;
        this.fuel = fuel;
    }

    // start the vehicle
    public void start() {
        System.out.println("The vehicle has started.");
    }

    // stop the vehicle

    public void stop() {
        System.out.println("The vehicle has stopped.");
    }

    // final method to display fuel level
    public final void displayFuel() {
        System.out.println("Fuel level: " + fuel + " liters");
    }

    //getter for speed
    public int getSpeed() {
        return speed;
    }

    // setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // getter for fuel
    public double getFuel() {
        return fuel;
    }

    // setter for fuel
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}