package OverridingMethodPolimorphis;


public class Karnivora {
     public static void main(String[] args){
         //Cara Penulisan Objek:(superclass) variable = new (subclass)
         System.out.println("====HEWAN DEFAULT====");
         Hewan h = new Hewan();
         h.setNama();
         h.setSuara();
         h.setBerat();
         
         System.out.println("====HEWAN KUCING====");
         Hewan k = new Kucing();
         k.setNama();
         k.setSuara();
         k.setBerat();
         
         System.out.println("====HEWAN SINGA====");
         Hewan s = new Singa();
         s.setNama();
         s.setSuara();
         s.setBerat();
        
    }
    
}
