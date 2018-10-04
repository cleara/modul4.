
package Praktikum1;

public abstract class Manusia {
    //deklarasi variable
    private double TinggiBadan;
    //constructor
    public Manusia (double TB)
    {
        TinggiBadan=TB;
    }
    //getter
    public double getTB()
    {
        return TinggiBadan;
    }
    //method HtgBBI
    public abstract double HtgBBI();
    
}