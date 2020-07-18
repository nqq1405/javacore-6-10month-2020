package lession7.Ac71_Employ_Management2;

public class AppTest {

    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement(5);
        employeeManagement.input();

        Employee[] e = employeeManagement.getEmployees();

        System.out.println("====== Danh Sách Nhân Viên ======");
        for (Employee a : e) {
            System.out.println(a.toString());
        }

        System.out.println("\nNhân viên có lương cao nhất là");
        System.out.println(employeeManagement.NV_max_salary().toString());

        System.out.println("Nhân viên có lương thấp nhất là");
        System.out.println(employeeManagement.NV_min_salary().toString());
    }
}
