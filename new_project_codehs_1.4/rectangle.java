public class rectangle
{
    int width;
    int height;

    public rectangle(int theWidth,int theHeight)
    {
        width = theWidth;
        height = theHeight;
    }

    public void printArea()
    {
        System.out.println("Area: " + width * height);
    }
    
    public void printPerimeter()
    {
        System.out.println("Perimeter: " + (width + height) * 2);
    }
    
    public void printCost(double price)
    {
        System.out.println("Price: " + width * height * price);
    }

    public static void main(String args[])
    {
        rectangle r1 = new rectangle(5,5);
        rectangle r2 = new rectangle(1,2);
        r1.printArea();
        r1.printPerimeter();
        r1.printCost(5.20);
        
        r2.printArea();
        r2.printPerimeter();
        r2.printCost(1.50);
        
    }
    
}
