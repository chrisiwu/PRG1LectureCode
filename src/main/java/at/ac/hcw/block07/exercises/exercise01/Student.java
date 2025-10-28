package at.ac.hcw.block07.exercises.exercise01;

/* create a class Student
   a student has a name,
     a student number (Matrikelnummer),
     and an array of grades (double).
   additionally, keep track of how many student
     objects have been created using a class variable
   implement a constructor that accepts name and
     student number and sets grades to an empty array
   implement getters and setters for each field
   write a method calculateAverage that returns
     the average of grades
   write a method printStudentCount that prints
     how many students where created.
   write a method compareStudentGrades that compares
     the average grade score of this object with
     another student's grades.
     - pass a Student object to the method and
         compare it with this object
     - the method returns 1 if this student has a
         higher average, 0 if they are the same
         and -1 if this student has a lower average
         than the provided object */
public class Student {
    private String name;
    private int studentNumber;
    private double[] grades;

    private static int studentCount;

    public Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.grades = new double[0];
        studentCount++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double[] getGrades() {
        return this.grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double calculateAverage() {
        if (grades.length == 0) {
            return 0.0;
        }

        double sum = 0.0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    public static void printStudentCount() {
        System.out.println("number of students created: " + studentCount);
    }

    public int compareStudentGrades(Student other) {
        double avgThis = this.calculateAverage();
        double avgOther = other.calculateAverage();

        if (avgThis > avgOther) {
            return 1;
        } else if (avgThis == avgOther) {
            return 0;
        } else {
            return -1;
        }
    }
}