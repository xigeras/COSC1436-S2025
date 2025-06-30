public class Runner {
    public static void main(String[] args) {
        // create and  test car obj
        Car myCar = new Car(120, 50.5, 4);
        myCar.start();
        myCar.displayFuel();
        myCar.honk();

        System.out.println();

        // create and test bike obj
        Bike myBike = new Bike(30, 15.0, true);
        myBike.start();
        myBike.displayFuel();
        myBike.ringBell();

        System.out.println();
    }
}