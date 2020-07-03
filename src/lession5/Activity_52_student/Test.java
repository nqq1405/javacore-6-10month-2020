package lession5.Activity_52_student;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập số sinh viên: ");
//        int so_sv = sc.nextInt();
        Student[] std = new Student[5];
        String ten;
        float GPA;

        for (int i = 0; i < std.length; i++) {
            System.out.println("Student " + i + 1);
            System.out.print("Nhập tên: ");

            ten = sc.nextLine();
            ten = sc.nextLine();

            System.out.print("Nhập Gpa: ");
            GPA = sc.nextFloat();

            std[i] = new Student(ten, GPA);
        }

        Manager_student manager = new Manager_student(std);

        System.out.println("Tổng sv đỗ/trượt: " + manager.std_fail_pass().getPass() + "/" + manager.std_fail_pass().getFail());
        System.out.println("Sinh viên có điểm GPA cao nhất là: " + manager.std_gpa_cao_nhat().toString());
        System.out.println("Sinh viên có điểm GPA thấp nhất là: " + manager.std_gpa_thap_nhat().toString());
    }
}
