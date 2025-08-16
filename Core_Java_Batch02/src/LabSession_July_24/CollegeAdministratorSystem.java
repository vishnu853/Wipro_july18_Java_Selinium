package LabSession_July_24;

abstract class Student
{
	
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    abstract void getGrade();
}

// Subclasses
class EngineeringStudent extends Student {
    int marks;

    public EngineeringStudent(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    @Override
    void getGrade() {
        String grade;
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println(name + " (Engineering): Grade " + grade);
    }
}

class MedicalStudent extends Student {
    int marks;

    public MedicalStudent(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    @Override
    void getGrade() {
        String grade;
        if (marks >= 85) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println(name + " (Medical): Grade " + grade);
    }
}

// Test class
public class CollegeAdministratorSystem {
    public static void main(String[] args) {
        Student eng = new EngineeringStudent("Alice", 95,89);
        Student med = new MedicalStudent("Bob", 20,89);

        eng.getGrade();
        med.getGrade();
    }
}