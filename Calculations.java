
/**
   Program #2

   Function: An application that solicits and inputs three integers 
   from the user and then displays the sum, average, product, smallest, and 
   largest of the three numbers. 

   Programmed By: Nicholas Scifert, (11/19/2020)

*/

import java.util.Scanner;

public class Calculations
{
   public static void main(String[] args)
   {
      //Declaration of all 3 int variables
      int firstNum;
      int secondNum;
      int thirdNum;
      
      //input scanner object
      Scanner inputDevice = new Scanner(System.in);
      
      //input prompts
      System.out.print("Enter the first integer or number: ");
      firstNum = inputDevice.nextInt();
      System.out.print("Enter the second integer or number: ");
      secondNum = inputDevice.nextInt();
      System.out.print("Enter the thrid integer or number: ");
      thirdNum = inputDevice.nextInt();
      
      // Sum method call and print 
      int sum = Sum(firstNum, secondNum, thirdNum);
      System.out.println("Sum: " + sum);
      
      //Average method call and print
      int average = Average(firstNum, secondNum, thirdNum);
      System.out.println("Average: " + average); 
      
      //Product method call and print
      int product = Product(firstNum, secondNum, thirdNum);
      System.out.println("Product: " + product); 
      
      //Smallest method call and print
      int smallest = Smallest(firstNum, secondNum, thirdNum);
      System.out.println("Smallest: " + smallest);
      
      //Largest method call and print
      int largest = Largest(firstNum, secondNum, thirdNum);
      System.out.println("Largest: " + largest);
      
    } // end method main
    
    //method that calculates the sum.
    public static int Sum(int f, int s, int t)
    {
      int sumCal = f + s + t;
      return sumCal;
    }
    
    //method that calculates the average.
     public static int Average(int f, int s, int t)
    {
      int averageCal = (f + s + t) / 3;
      return averageCal;
    }
    
    //method that calculates the product.
    public static int Product(int f, int s, int t)
    {
      int productCal = f * s * t;
      return productCal;
    }
    
    //method that calculates the smallest number.
    public static int Smallest(int f, int s, int t)
    {
      int smallestNum;
      if (f < s && f < t)
      {
         return f;
      }
      else
      {
         if ( s < f && s < t)
         {
            return s;
         }
         else
         {
            return t;
         }
      }
     
    }
   
    //method that calculates the smallest number.
    public static int Largest(int f, int s, int t)
    {
      int largestNum;
      if (f > s && f > t)
      {
         return f;
      }
      else
      {
         if ( s > f && s > t)
         {
            return s;
         }
         else
         {
            return t;
         }
      }
     
    }

    
      
}  // end class Calculations









