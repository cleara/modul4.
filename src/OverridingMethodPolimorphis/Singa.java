
package OverridingMethodPolimorphis;


public class Singa extends Hewan {

    @Override
    void setNama() {
         String singa = "Diablo";
       System.out.println("Nama Singan :"+singa);
    }

    @Override
    void setSuara() {
         String suara = "Roaarrr";
       System.out.println("Suara Hewan :"+suara);   
    }

    @Override
    void setBerat() {
          double berat = 10.0;
       System.out.println("berat Hewan :"+berat+"Kg");
    }
    
    
}
    
    
    
    
    

