public class Cat extends Animal {
    String breed;

    public Cat(int age, double weight, String breed) {
        super(age, weight); // animal constructor called
        this.breed = breed;
        System.out.println("Cat constructor called.");
    }
}