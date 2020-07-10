package lession6.Activity61;

public class NhanVien {
    private String ten;
    private int tuoi;
    private String gioitinh;

    public NhanVien(String ten, int tuoi, String gioitinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }

    public double tinhluong(){
        return 0;
    }

    public NhanVien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioitinh='" + gioitinh + '\'' +
                '}';
    }
}
