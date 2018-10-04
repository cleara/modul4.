package Praktikum1;

public class LakiLaki extends Manusia {
    //constructor
    public LakiLaki (double TB)
    {
        super (TB);
    }
    //method HtgBBI () merupakan method overidding dari superclass nya
    public double HtgBBI()
    {
        return (super.getTB()-100)*0.9;
    }
  
}