package Abstract;

public abstract class bujurSangkar extends bangunDatar{
    private final double sisi;
    
    public bujurSangkar(double sisi){
        this.sisi = sisi;
    }
        public double hitungKeliling(){
        return 4* sisi;
        }
    
        public double hitungLuas(){
        return sisi*sisi;
            
        }
    }

