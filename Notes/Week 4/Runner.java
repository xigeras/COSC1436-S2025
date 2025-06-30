public class Runner {
    public static void main(String[] args){
        StudentManager manager = new StudentManager();
        
        manager.addStudent(new Student("Alice", 85, StudentLevel.FRESHMAN));
        manager.addStudent(new Student("Bob", 90, StudentLevel.SOPHOMORE));
        manager.addStudent(new Student("Charlie", 78, StudentLevel.JUNIOR));
        manager.addStudent(new Student("Diana", 92, StudentLevel.SENIOR));

        System.out.println("Original List:");
        manager.displayStudents();

        //Remove a student
        manager.removeStudent("Charlie");
        System.out.println("\nList After Removing Charlie:");
        manager.displayStudents();

        // Add a new student
        manager.addStudent(new Student("Eve", 88, StudentLevel.FRESHMAN));
        System.out.println("\nList After Add Eve:");
        manager.displayStudents();

    }
}