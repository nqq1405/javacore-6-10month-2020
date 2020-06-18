package lession3;

public class Activity_34 {

    static int[] div3() {
        int[] a = new int[100];
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                a[i] = i;
            }
        }
        return a;
    }

    static int[] div5() {
        int[] a = new int[100];
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                a[i] = i;
            }
        }
        return a;
    }

    static int[] div3_5() {
        int[] a = new int[100];
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                a[i] = i;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] dv3 = div3();
        int[] dv5 = div5();
        int[] dv3_5 = div3_5();
        System.out.println("Divided by 3:  ");
        for (int i = 1; i < 100; i++) {
            if (dv3[i]>0){
                System.out.print(dv3[i]+",");
            }
        }
        System.out.println("\nDivided by 5:  ");
        for (int i = 1; i < 100; i++) {
            if (dv5[i]>0){
                System.out.print(dv5[i]+",");
            }
        }
        System.out.println("\nDivided by 3&5:  ");
        for (int i = 1; i < 100; i++) {
            if (dv3_5[i]>0){
                System.out.print(dv3_5[i]+",");
            }
        }
    }

}
