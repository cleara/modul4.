package Abstract;


public class Lingkaran extends bangunDatar {
    private double r;

    Lingkaran(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double hitungLuas() {
        return 2*3.14*r;
       
    }

    @Override
    public double hitungKeliling() {
        return 3.14*r*r;
        
    }
    
}
