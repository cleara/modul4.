
package OverridingMethodPolimorphis;


public class Kucing extends Hewan {

    @Override
    void setNama() {
       String kucing = "Carberus";
       System.out.println("Nama Kucing :"+kucing);
    }
 

    @Override
    void setSuara() {
       String suara = "Miaw Meo Meong";
       System.out.println("Suara Hewan :"+suara);
    }
    
    @Override
    void setBerat() {
       double berat = 2.0;
       System.out.println("berat Hewan :"+berat+"Kg");
    }

   
    
    
}
