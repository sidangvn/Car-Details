//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang

public class Car
{
   private String make;
   private String model;
   private int year;
  
   //Constructors
   public Car (String mk, String md, int ye)
   {
      make = mk;
      model = md;
      year = ye;
    }
    
   public Car()
   {
      make = " ";
      model = " ";
      year = 0;
    }
    
   //Update Make, Model and Year into Car and return them. 
   public String updateMake (String str)
   {
      make = str;
      return make;
    }
    
   public int updateYear (int yea)
   {
      year = yea;
      return year;
    }
    
   public String updateModel (String str)
   {
      model = str;
      return model;
    }
    
   //Accessor Make, Model, Year: Returns the current values of them 
   public String getMake()
    {
      return make;
    }  
    
   public int getYear()
    {
      return year;
    }
    
   public String getModel()
    {
      return model;
    }
   
   //Returns a description of the car as a string 
   public String toString()
    {
      return (year + "\t\t" + make + "\t\t" + model);
    }
   
   //Mutators 
   public void setMake (String m)
    {
      make = m;
    }
    
   public void setModel (String mo)
    {
      model = mo;
    }
    
   public void setYear (int y)
    {
      year = y;
    }
}
    