package lession5.Activity_52_student;

public class Student {
    private String name;
    private float gpa;

    public Student() {
    }

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public Boolean kt_fail_pass(){
        if (gpa >= 1.5){
            return true;
        }
        return false;
    }
}
