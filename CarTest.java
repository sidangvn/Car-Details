//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang

import java.util.Scanner;
public class CarTest
{
   //Create some cars and requests various updates
   public static void main(String[] args)
   {
      //Scanner   
      Scanner input = new Scanner (System.in);
      
      Car car1 = new Car ("Ford", "Taurus", 2015);
      Car car2 = new Car ("Honda", "Accord", 2007);
      Car car3 = new Car ("-", "-", 0);
      
      //Variables to store.
      String Model3;
      String Make3;
      int Year3;
      
      String Model = "Model";
      String Make = "Make";
      int Year = 0;
      System.out.println("Here is the information I have on Mr.Smith's three cars:");
      
      System.out.println(car1);
      System.out.println(car2);
      System.out.println(car3);
      
      System.out.println("\n");
      System.out.println("Whoops! It seems we do not have the info on one of his cars!");
      System.out.println("Enter the information for the third car here:");
      System.out.print("Make: ");
      Make3 = input.nextLine();
      
      System.out.print("Model: ");
      Model3 = input.nextLine();
  
      System.out.print("Year: ");
      Year3 = input.nextInt();
      System.out.println();
      System.out.println("Mr.Smith traded the Taurus for another Ford from the same year.");
      System.out.print("Enter the new Ford model: ");
      Model = input.next();
      
     
      System.out.println("Mr.Smith sold the 2007 Accord to buy a more current version.");
      System.out.print("Enter the new year for the Accord: ");
      Year = input.nextInt();
      System.out.println("\n");
      System.out.println("Here is the updated information I now have on Mr.Smith's three cars");
      
      
      car1.setModel(Model);
      car2.setYear(Year);
      car3.setMake(Make3);
      car3.setModel(Model3);
      car3.setYear(Year3);
      
      System.out.println(car1);
      System.out.println(car2);
      System.out.println(car3);
      
     
    }
   }