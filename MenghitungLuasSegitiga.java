package menghitung.luas.segitiga;

import java.util.Scanner;

public class MenghitungLuasSegitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, t;
        double luas;
        
        System.out.println("Masukkan Alas : ");
        
        a = input.nextInt();
        System.out.println("Masukkan Tinggi : ");
        
        t = input.nextInt();
        
        luas = 0.5 * a * t;
        System.out.println("Luas Segitiga : " + luas);
    }
    
}
