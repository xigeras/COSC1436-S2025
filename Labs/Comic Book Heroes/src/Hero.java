public class Hero {
    public String name;
    public int powerLevel;
    public Affiliation affiliation;

    public Hero(String name, int powerLevel, Affiliation affiliation) 
    {
        this.name = name;
        this.level = powerLevel;
        this.affiliation = affiliation;
    }

    public String getName()
    {
        return name;
    }

    public int getLevel()
    {
        return level;
    }

    public Affiliation getAffiliation()
    {
        return affiliation;
    }

    public String toString()
    {
        return "Name: " + name + "\nPower Level: " + level + "\nAffiliation: " + affiliation;
    }
}