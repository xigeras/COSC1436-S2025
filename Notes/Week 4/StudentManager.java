import java.util.ArrayList;
import java.util.Arrays;

public class StudentManager{
    public ArrayList<Student> students = new ArrayList<Student>();

    // Add a student to the list
    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(String name) {
        students.removeIf(student -> student.getName().equals(name));
    }

    public void bubbleSortByGrade() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if(students.get(j).getGrade() > students.get(j + 1).getGrade()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

    }

    public void insertionSortByGrade() {
        for(int i = 1; i<students.size(); i++){
            Student key = students.get(i);
            int j = i - 1;

            while (j >= 0 && students.get(j).getGrade() > key.getGrade()) {
                students.set(j + 1, students.get(j));
                j--;
            }
            students.set(j+1, key);
        }
    }

    public void displayStudents2DArray() {
        String [][] studentArray = new String[students.size()][3];

        for(int i = 0; i < students.size(); i++) {
            studentArray[i][0] = students.get(i).getName();
            studentArray[i][1] = String.valueOf(students.get(i).getGrade());
            studentArray[i][2] = students.get(i).getLevel().toString();
        }

        System.out.println(Arrays.deepToString(studentArray));
    }

    public void displayStudents(){
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }
}
