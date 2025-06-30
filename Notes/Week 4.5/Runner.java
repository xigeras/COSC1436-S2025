public class Runner {
    public static void main(String[] args) {
        Dog myDog = new Dog(3, 15.5, "Labrador");
        Cat myCat = new Cat(3, 16.2, "Persian");
        /*
        System.out.println("Age: " + myDog.age);
        System.out.println("Weight: " + myDog.weight);
        System.out.println("Breed: " + myDog.breed);
        */
        
        myDog.displayWeight();
        myCat.displayWeight();
    }
}