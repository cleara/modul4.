package Praktikum2;

public class Kalkulator implements Operasi{
  
     //deklarasi variabel / atribut
    private double bil1, bil2 ;
    
      public Kalkulator(){
        
    }
public Kalkulator (double bil1, double bil2){
    this.bil1= bil1 ;
    this.bil2 = bil2 ;
    }

    public void Penjumlahan() {
        System.out.println( bil1 + bil2);    
    }

    public void Pengurangan() {
        System.out.println(bil1 - bil2);
    }
    
    public double Perkalian() {
    return bil1*bil2 ;   
    }

    public double Pembagian() {
    return bil1/bil2 ;   
    }  
}
    
