package Praktikum2;
import java.io.BufferedReader ;
import java.io.InputStreamReader;

public class Utama {
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Kalkulator k = new Kalkulator ();
       
        //input
        System.out.print ("Masukan Bilangan pertama : ");
        double bil1 = Double.parseDouble(br.readLine());
        System.out.print("Masukan Bilangan Kedua : ");
        double bil2 = Double.parseDouble(br.readLine());
       
        k = new Kalkulator (bil1, bil2);
        System.out.print("");
       
        //output
        System.out.println();
        System.out.print("Hasil Penjumlahan = ");
        k.Penjumlahan();
        System.out.print("Hasil Pengurangan = ");
        k.Pengurangan();
        System.out.println("Hasil Perkalian = " + k.Perkalian());
        System.out.println("Hasil Pembagian = " + k.Pembagian());
    }
}

