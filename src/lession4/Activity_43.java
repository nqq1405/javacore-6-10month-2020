package lession4;

public class Activity_43 {

    static int[] mergertow_array(int[] a, int na,int[] b, int nb){
        int[] ad = new int[na+nb];
        for (int i = 0; i <na ; i++) {
            ad[i] = a[i];
        }
        int j=0;
        for (int i = na; i < na+nb; i++) {
            ad[i] = b[j];
            j++;
        }

        return ad;
    }

    public static void main(String[] args) {
        int[] a = {5,2,4,1,6,1};
        int na = a.length;
        int[] b = {1,6};
        int nb = b.length;

        int[] merge_array = mergertow_array(a,na,b,nb);
        System.out.printf("Merge Two Array: ");
        for (int c: merge_array) {
            System.out.print(c+" ");
        }
    }
}
