public class Student {
    public String name;
    private int grade;
    private StudentLevel level;

    public Student(String name, int grade, StudentLevel level) 
    {
        this.name = name;
        this.grade = grade;
        this.level = level;
    }

    public String getName()
    {
        return name;
    }

    public int getGrade()
    {
        return grade;
    }

    public StudentLevel getLevel()
    {
        return level;
    }

    public String toString(){
        return "Name: " + name + "\nGrade: " + grade + "\nLevel: " + level;
    }
}