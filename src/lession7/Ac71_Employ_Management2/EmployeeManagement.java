package lession7.Ac71_Employ_Management2;

import java.util.Scanner;

public class EmployeeManagement {
    private int n;
    private Employee[] employees;

    public EmployeeManagement(int n) {
        this.n = n;
        this.employees = new Employee[n];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        int lc;
        int slnv = 0; // số lượng nhân viên
        String ten;
        int tuoi;
        String cmt;

        do {
            menu();
            if (0 <= slnv && slnv < n) {
                System.out.println("Bạn cần nhập " + (n - slnv) + " số nhân viên");
                System.out.print("Lựa chọn của bạn: ");
                lc = sc.nextInt();
            }else {
                System.out.println("Bạn đã nhập đủ số nhân viên");
                lc = 3;
            }
            switch (lc) {
                case 1: {
                    sc.nextLine();
                    System.out.print("Nhập Tên NV: ");
                    ten = sc.nextLine();
                    System.out.print("Nhập Tuổi NV: ");
                    tuoi = sc.nextInt();
                    System.out.print("Nhập số chứng minh thư NV: ");
                    sc.nextLine();
                    cmt = sc.nextLine();
                    System.out.print("Nhập số ngày làm việc: ");
                    int songaylv = sc.nextInt();
                    System.out.print("Nhập mức lương/Ngày: ");
                    long mucluong = sc.nextLong();
                    employees[slnv++] = new FullTimeEmployee(ten, tuoi, cmt, songaylv, mucluong);
                    break;
                }
                case 2: {
                    sc.nextLine();
                    System.out.print("Nhập Tên NV: ");
                    ten = sc.nextLine();
                    System.out.print("Nhập Tuổi NV:");
                    tuoi = sc.nextInt();
                    System.out.print("Nhập số chứng minh thư NV: ");
                    sc.nextLine();
                    cmt = sc.nextLine();
                    System.out.print("Nhập số ca làm việc: ");
                    int socalv = sc.nextInt();
                    System.out.print("Nhập mức lương/Ca: ");
                    long mucluong = sc.nextLong();
                    employees[slnv++] = new PartTimeEmployee(ten, tuoi, cmt, socalv, mucluong);
                    break;
                }
                case 3: {
                    System.out.println("Tạm biệt");
                    break;
                }
                default: {
                    System.out.println("Lựa chọn của bạn không phù hợp");
                    break;
                }
            }
        } while (lc != 3);
    }

    public void menu() {
        System.out.println("========= Nhập Thông Tin Nhân Viên =========");
        System.out.println("1. Nhân Viên FullTime");
        System.out.println("2. Nhân Viên PartTime");
        System.out.println("3. Thoát");
    }

    public Employee NV_max_salary() {
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (max.CalculateSalary() < employees[i].CalculateSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    public Employee NV_min_salary() {
        Employee min = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (min.CalculateSalary() > employees[i].CalculateSalary()) {
                min = employees[i];
            }
        }
        return min;
    }
}
