import java.util.Scanner;
public class Parking_Charges
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    double hours;
    
    for(int i = 1; i <= 4; ++i)
    { 
      System.out.printf("Customer #%d: Enter your number of hours: ", i);
      hours = input.nextDouble();
      
      while(hours < 1 || hours > 24)
      {
        System.out.print("Number of hours cannot be a negative value nor can it surpass 24. Please try again: ");
        hours = input.nextDouble();
      }
      
      System.out.printf("%nCustomer's charge: $%.2f%n", calculateCharges(hours)); //method call
      System.out.println();
    }
    System.out.printf("%nProgram terminated.%n");
  }//end main
  
  public static double calculateCharges(double hour)
  {
    double charge;
    double minFee = 2; //minimum fee
    double addFee = 0.5; //additional fee
    if(hour <= 3)
    {
      charge = minFee;
    }
    else
    {
      charge = minFee + (addFee * hour);
    }
    return charge;
  }//end method
}//end class

