package Abstract;


public class Lingkaran extends bangunDatar {
    private double r;

    @Override
    public double hitungLuas() {
        return 2*3.14*r;
       
    }

    @Override
    public double hitungKeliling() {
        return 3.14*r*r;
        
    }
    
}
