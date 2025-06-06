public class Car 
{
    //attributes
    private String model;
    private int year;
    private Person owner;

    public Car(String model, int modelYear)
    {
        this.model = model;
        year = modelYear;
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }
    /**
     * This is the overwritten toString method
     */
    @Override
    public String toString()
    {
        return "Car Model: " + model + ", Year: " + year + 
                "\nThis car is owned by " + owner.getName();
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int modelYear)
    {
        year = modelYear;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
}