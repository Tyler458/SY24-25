

public class fraction
{
   
    private int num;
    private int denom;
    
    public fraction(int fracNum, int fracDenom)
    {
        num = fracNum;
        denom = fracDenom;
    }
    
    public fraction mult(fraction other)
    {
        return new fraction(num * other.num, denom * other.denom);
    }
    
    public fraction div(fraction other)
    {
       return new fraction(num * other.denom, denom * other.num ); 
    }
    
    public String toString()
    {
     
        return num + "/" + denom;
        
    }
}
