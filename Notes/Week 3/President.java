public class President {
    private String name;
    private String accomplishment;
    private int influenceLevel;
    
    public President(String name, String accomplishment, int influenceLevel)
    {
        this.name = name;
        this.accomplishment = accomplishment;
        this.influenceLevel = influenceLevel;
    }

    public String getName() {
        return name;
    }

    public int getInfluenceLevel() {
        return influenceLevel;
    }

    public String toString() {
        return         "Name: " + name + 
                "\n" + "Accomplishment: " + accomplishment +
                "\n" + "Influence Level: " + influenceLevel + "\n";
    }
}