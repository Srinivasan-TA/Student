package org.example;
class Student extends Main {
    private String name;
    private int gradeLevel;
    private double gpa;

    public Student(String name, int gradeLevel, double gpa) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    public void updateGPA(double newGPA) {
        gpa = newGPA;
    }

    public String getInfo() {
        return name + " is in grade " + gradeLevel + " and has a " + gpa + " GPA";
    }
}

class Main{
    public static void main(String[] args) {
        Student student = new Student("John Doe", 12, 3.5);
        System.out.println(student.getInfo());
        student.updateGPA(3.7);
        System.out.println(student.getInfo());
    }
}