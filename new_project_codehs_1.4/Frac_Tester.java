

public class Frac_Tester
{
  
    public static void main(String[] args)
    {
        fraction frac1 = new fraction(1, 2);
        
        fraction frac2 = new fraction(1, 4);
        System.out.println(frac1 + " x " + frac2 + "=" + frac1.mult(frac2));
        System.out.println(frac1 + " / " + frac2 + "=" + frac1.mult(frac2));
    }
    
}
