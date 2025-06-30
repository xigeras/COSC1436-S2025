public class Person
{
    private String name;
    private Car car;
    

    /**
     * default constructor
     */
    public Person()
    {

    }
    /**
     * parameterized constructor
     * @param name = constructing a person with a name
     */
    public Person(String name)
    {
        this.name = name;
    }

    /**
     * This sets the car that the person has
     * @param car - the car that the person has
     */
    public void setCar(Car car)
    {
        this.car = car;
    }

    /**
     * This returns the person's name
     * @return - the person's name
     */
    public String getName()
    {
        return name;
    }

     /**
     * This is the overwritten toString method
     */
    @Override
    public String toString()
    {
        return name + " owns a " + car.getModel();
    }

}