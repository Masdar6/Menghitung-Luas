package menghitung.luas.lingkaran;

import java.util.Scanner;

public class MenghitungLuasLingkaran {

    public static void main(String[] args) {
        //Inisialisasi objek input dari class scanner
        Scanner input = new Scanner(System.in);
        
        //Deklarasi variabel
        double luas, phi = 3.14;
        int r;
        
        //Input nilai jari-jari
        System.out.println("Masukkan nilai jari-jari : ");
        r = input.nextInt();
        
        //Menghitung Luas Lingkaran
        luas = phi * r * r;
        
        //Tampilkan hasil
        System.out.println("Luas Lingkaran : " + luas);
    }
    
}
