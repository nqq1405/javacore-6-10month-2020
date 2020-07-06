package lession5.Activity_52_student;

public class Manager_student {
    private int total_sv;
    private Student[] std;

    public Manager_student(Student[] std) {
        this.std = std;
        total_sv = std.length;
    }

    public Manager_student() {
    }

    public student_fail_pass std_fail_pass(){
        int number_pass = 0;
        for (Student s: std) {
            if (s.kt_fail_pass()){
                number_pass++;
            }
        }
        int number_fail = std.length - number_pass;
        student_fail_pass st = new student_fail_pass(number_pass,number_fail);
        return st;
    }

    public Student std_gpa_cao_nhat(){
        Student std_max_gpa = std[0];
        for (Student s: std) {
            if(std_max_gpa.getGpa() < s.getGpa()){
                std_max_gpa = s;
            }
        }
        return std_max_gpa;
    }

    public Student std_gpa_thap_nhat(){
        Student std_min_gpa = std[0];
        for (Student s: std) {
            if(std_min_gpa.getGpa() >= s.getGpa()){
                std_min_gpa = s;
            }
        }
        return std_min_gpa;
    }
}
