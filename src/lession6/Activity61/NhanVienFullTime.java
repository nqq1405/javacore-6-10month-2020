package lession6.Activity61;

public class NhanVienFullTime extends NhanVien{
    private int songaylamthem;
    private String loai;

    public NhanVienFullTime(String ten, int tuoi, String gioitinh, String loai, int songaylamthem) {
        super(ten, tuoi, gioitinh);
        this.songaylamthem = songaylamthem;
        this.loai = loai;
    }

    public NhanVienFullTime() {
    }

    public int getSongaylamthem() {
        return songaylamthem;
    }

    public void setSongaylamthem(int songaylamthem) {
        this.songaylamthem = songaylamthem;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double tinhluong(){
        double luong = 0;
        if(loai.equals("GD")){
            luong =  songaylamthem*800000 + 20000000;
        }else if(loai.equals("NV")){
            luong = songaylamthem*800000 + 10000000;
        }
        return luong;
    }

    @Override
    public String toString() {
        return super.toString() + "NhanVienFullTime{" +
                "songaylamthem=" + songaylamthem +
                ", loai='" + loai + '\'' +
                '}'+ "==> Lương: " + tinhluong();
    }
}
