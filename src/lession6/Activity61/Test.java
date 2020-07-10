package lession6.Activity61;

public class Test {

    public static void main(String[] args) {
        NhanVien[] a = new NhanVien[20];

        for (int i = 0; i < 20; i++) {
            if (i < 5) {
                a[i] = new NhanVienPartTime("Nguyen Van A" + i, 20 + i, "Nam", 15 + i);
            }
            if (i >= 5 && i < 10) {
                a[i] = new NhanVienPartTime("Nguyen Thi B" + i, 24 + i, "Nữ", 5 + i);
            }
            if (i >= 10 && i < 15) {
                a[i] = new NhanVienFullTime("Nguyen Van A" + i, 20 + i, "Nam", "NV", 4);
            }
            if (i >= 15) {
                a[i] = new NhanVienFullTime("Nguyen Thi B" + i, 24 + i, "Nữ", "GD", 2);
            }
        }

        for (NhanVien b : a) {
            System.out.println(b.toString());
        }
    }
}
