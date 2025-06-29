public class Runner
{
    public static void main(String [] args)
    {
        Car myCar = new Car("Tesla Model S", 2023);
        Car toyota = new Car("Toyota Camry XLE", 1997);
        Person john = new Person("John");
        Person karl = new Person("Karl");

        john.setCar(myCar);
        myCar.setOwner(john);

        karl.setCar(toyota);
        toyota.setOwner(karl);
        System.out.println(myCar);
        System.out.println(toyota);
        System.out.println(john);
    }    
}