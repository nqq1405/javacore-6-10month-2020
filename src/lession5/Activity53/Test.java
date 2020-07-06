package lession5.Activity53;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Word[] arrw = new Word[13];
        for (int i = 0; i < arrw.length; i++) { // khởi tạo 5 từ VA và 5 từ AV
            if (i <= 5) {
                arrw[i] = new Word("tam biet" + i, "bye" + i, "VA");
            } else if (i > 5) {
                arrw[i] = new Word("hello" + i, "xin chao" + i, "AV");
            }
        }
        Dictionary dictionary = new Dictionary(arrw);

        String keycantim;
        String typecantim;
        System.out.print("Nhập từ cần tìm: ");
        keycantim = sc.nextLine();
        System.out.print("Nhập loại(type) cần tìm: ");
        typecantim = sc.nextLine();

        String nghia = dictionary.timkiem_theo_key_type(keycantim,typecantim).getValue();
        System.out.println("Nghĩa của từ bạn vừa tìm là: " + nghia);

        System.out.println("Số từ VA/AV là: "+ dictionary.numberVA() +"/"+ dictionary.numberAV());
    }
}
