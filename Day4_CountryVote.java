import java.util.Scanner;
class Vote{
public static void main(String []args)
{    
      System.out.println("Enter your Age--> ");
      Scanner sc=new Scanner(System.in);
       
      int Age=sc.nextInt();
       if(Age>=18)
       {
             System.out.println("eligible for vote");
       }
     else
      {
           System.out.println("Not eligible for vote");
      }
}
}
