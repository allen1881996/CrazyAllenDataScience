package com.allenhuang;

public class Student {

    // attribute
    private String studentName;
    private double midtermScore;
    private double finaltermScore;
    private int studentId;
    private int studentClass;
    public static String semester;
    public static int numberOfStudents = 0;

    // get method
    public String getName() {
        return studentName;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getMid() {
        return midtermScore;
    }

    public String Getsemester() {
        return semester;
    }
    /* 如果一个public的method就像coupling，要考虑hide this from outside，就可以private */
    public double getFinal() {
        return finaltermScore;
    }

    // set method
    public void Setsemester(String ses) {
        semester = ses;
    }

    public void setMid(final double midtScore) {
        if (midtScore < 100 && midtScore > 0) {
            midtermScore = midtScore;
        }
    }

    public void setFinal(final double finScore) {
        if (finScore < 100 && finScore > 0) {
            finaltermScore = finScore;
        }
    }

    public static int getNumberOfStudents(){
        return numberOfStudents;
    }

    // constructor
    public Student(String name, int studentId, int studentClass) {
        studentName = name;
        this.studentClass = studentClass;
        this.studentId = studentId;
        numberOfStudents ++;
    }

    public Student() {
        numberOfStudents ++;
    }

}
