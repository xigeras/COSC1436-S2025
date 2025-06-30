public class Runner {
    public static void main(String[] args) {
        Dog myDog = new Dog(3, 1.5, "Labrador");
        /*
        System.out.println("Age: " + myDog.age);
        System.out.println("Weight: " + myDog.weight);
        System.out.println("Breed: " + myDog.breed);
        */
        
        myDog.showDogDetails();
    }
}