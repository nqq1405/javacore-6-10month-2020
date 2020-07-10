package lession6.Activity61;

public class NhanVienPartTime extends NhanVien{
    private int sogiolam;

    public NhanVienPartTime(String ten, int tuoi, String gioitinh, int sogiolam) {
        super(ten, tuoi, gioitinh);
        this.sogiolam = sogiolam;
    }

    public NhanVienPartTime() {
    }

    public int getSogiolam() {
        return sogiolam;
    }

    public void setSogiolam(int sogiolam) {
        this.sogiolam = sogiolam;
    }

    public double tinhluong(){
        return sogiolam*100000;
    }

    @Override
    public String toString() {
        return super.toString() + "NhanVienPartTime{" +
                "sogiolam=" + sogiolam +
                '}' + "==> Lương: " + tinhluong();
    }
}
