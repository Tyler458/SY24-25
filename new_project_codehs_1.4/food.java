

public class food
{
    String name;
    double fat;
    double carbs;
    double protein;
    
    public food(String foodName, double gmFat, double gmCarbs, double gmProtein)
    {
        name = foodName;
        fat = gmFat;
        carbs = gmCarbs;
        protein = gmProtein;
    }
    
    public double totalgrams()
    {
        return fat + carbs + protein;
    }
    
    public double totalcalories()
    {
        return fat * 9 + carbs * 4 + protein * 4;
    }
    
    public double fatcalper()
    {
        return fat / totalcalories();
    }
    
    public String healthy()
    {
        if (fatcalper() > 30)
        return "health risk, exceeds 30% calories from fat!";
        if (fatcalper() < 30)
        return "acceptable choice, below 30% calories from fat!";
        return "healthy";
    }
    
    public static void main(String args[])
    {
        food a = new food("Whopper", 9, 4, 4);
        System.out.println(a);
    }
    
    
    
    public String toString()
    {
      return name + ", " + totalcalories() + " calories, health risk, exceeds " + fatcalper() + "% calories from fat!”";
    }
    
    
}
