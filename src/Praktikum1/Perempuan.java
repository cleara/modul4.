package Praktikum1;

public class Perempuan extends Manusia {
    //constrcutor
    public Perempuan (double TB)
    {
        super(TB);
    }
    //Method HtgBBI merupakan method overidding dari superclass nya
    public final double HtgBBI()
    {
        return (super.getTB()-100)*0.8;
    }
}
