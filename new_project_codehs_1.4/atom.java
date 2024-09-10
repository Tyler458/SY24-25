
public class atom
{
    private int neutrons;
    private int protons;
    private int electrons;
    private String name;

    public atom(int neu, int pro, int ele, String nam)
    {
        neutrons = neu;
        protons = pro;
        electrons = ele;
        name = nam;
    }

    int getpro(){return protons;}
    int getneu(){return neutrons;}
    int getele(){return electrons;}
    String nam(){return name;}
    public int atomicNumber(){return protons;}
    public int atomicMass(){return protons + neutrons;}
    
    public String charge()
    {
        if (protons-neutrons>0)
        return "cation";
        if (protons-neutrons<0)
        return "atom";
        return "neutrall";
    }
    
    public String toString()
    {
      return name + ":" + "\n\telectrons" + electrons + "\n\tprotons" + protons + "\n\tneutrons" + neutrons + "\n\tcharge" + charge(); 
      
    }
    
}
