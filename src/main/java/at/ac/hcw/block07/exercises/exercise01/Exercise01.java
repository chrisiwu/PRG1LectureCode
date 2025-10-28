package at.ac.hcw.block07.exercises.exercise01;

/* create multiple student objects
   set their grades
   call functions from your Student class */

public class Exercise01 {
    public static void main(String[] args) {
        Student student1 = new Student("Christoph", 26041979);
        Student student2 = new Student("Student", 99999999);

        student1.setGrades(new double[]{1.0, 2.0, 3.0});
        System.out.println("average grade: " + student1.calculateAverage());

        student2.setGrades(new double[]{2.0, 2.0, 2.0});
        System.out.println("average grade: " + student2.calculateAverage());

        Student.printStudentCount();

        int comparison = student1.compareStudentGrades(student2);

        if (comparison == 1) {
            System.out.println("Student 1 has the higher average.");
        } else if (comparison == 0) {
            System.out.println("Both have the same average.");
        } else {
            System.out.println("Student 2 has the higher average.");
        }
    }
}