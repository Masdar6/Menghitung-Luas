package menghitung.luas.persegi;

import java.util.Scanner;

public class MenghitungLuasPersegi {

    public static void main(String[] args) {
        int sisi, luas;
        Scanner scan = new Scanner (System.in);
        System.out.println("Masukkan Panjang Sisi Persegi : ");
        sisi = scan.nextInt();
        luas = sisi * sisi;
        System.out.println("Luas Persegi Adalah :" + luas);
    }
    
}
