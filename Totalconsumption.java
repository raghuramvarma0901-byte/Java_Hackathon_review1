import java.util.*;
class Totalconsumption
{
    static int calculateTotal(int morningUsage, int eveningUsage)
    {
        return morningUsage+eveningUsage;
    }
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the the morningUsage");
        int morningUsage=sc.nextInt();
        System.out.println("enter the evening usage");
        int eveningUsage=sc.nextInt();
        int totalconsumption=calculateTotal(morningUsage,eveningUsage);
        System.out.println("Total consumption is: " + totalconsumption);
     }
      
}