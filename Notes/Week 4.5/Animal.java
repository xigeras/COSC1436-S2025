public class Animal {
    public int age;
    public double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
        System.out.println("Animal constructor called.");
    }
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public final void displayWeight() {
        System.out.println("Weight: " + weight);
    }
}