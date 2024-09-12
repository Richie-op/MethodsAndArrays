import javax.management.StringValueExp;

public class main2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {

        }
        String[] students = {"Richie","Karina", "Alex", "Jordan"};
        double[] grades = {3.0, 4.5,3.2, 3.5};

        getStudentsGrades(students);
        getStudentsGrades(grades);
    }



    public static void getStudentsGrades(String[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        }

    public static void getStudentsGrades(double[] grades) {
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }
    }
