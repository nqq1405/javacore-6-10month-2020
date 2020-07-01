package lession5.Activity_51_Rectangle;

public class test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.nhap();
        if(r.kt_hinh_vuong(r)){
            System.out.println("la Hinh vuong");
        }else System.out.println("ko la Hinh Vuong");
    }
}
