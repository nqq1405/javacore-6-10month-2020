package lession10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ac101 {
    public static String checkpath(String pathname){
        File a = new File(pathname);
        if (a.exists()) {
            return "File đã tồn tại";
        }
        return "File không tồn tại";
    }

    public static List<File> ListFile(String dotfile,String pathFolder){
        List<File> a = new ArrayList<>();
        File getlistdotfile = new File(pathFolder);
        String[] namefile = getlistdotfile.list();
        for (int i = 0; i < namefile.length; i++) {
            if (namefile[i].endsWith(dotfile)){
                File f = new File("data/"+namefile[i]);
                a.add(f);
            }
        }
        return a;
    }

    public static String TheLongestWord(String pathname) {
        String LongestWord = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(pathname);
            br = new BufferedReader(fr);

            String a;
            String[] word;
            while ((a = br.readLine()) != null){
                word = a.split(" ");
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return LongestWord;
    }

    public static void main(String[] args) {
        List<File> fileList1 = ListFile(".png","data");

        for (File a : fileList1) {
            System.out.println("Tên File .png: " + a.getName());
        }
    }
}
