package lession4;

public class Activity_41 {

    static boolean ktamstrong(int n){
        int du,tong = 0,demchia = 0;
        int t = n;
        while (t!=0){
            demchia++;
            t=t/10;
        }
        t = n;
        while (t!=0){
            du = t%10;
            tong += (int) Math.pow(du,demchia);
            t/=10;
        }
        if (n == tong)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 500 ; i++) {
            if (ktamstrong(i)==true) {
                System.out.print(i+" ");
            }
        }
//        System.out.println((int) Math.pow(153,3));
    }
}
