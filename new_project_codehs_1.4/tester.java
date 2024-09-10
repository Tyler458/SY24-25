
public class tester
{
    public static void main(String args[])
    {
        atom H = new atom(0,1,1,"Hydrogen"); 
        System.out.println(H);
        
        
        atom He = new atom(2,2,2,"Helium");
        System.out.println(He);
        
        System.out.println(He.charge());
        
    }
}
