import java.util.Scanner;
class AverageOf_OneToN_Number
{
        public static void main(String []args)
{
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value--> ");
         int n = sc.nextInt();
         int i;
         float Sum=0;
         for(i=1; i<=n; i++)
         {
             
              Sum=Sum+i;
         }
         
         System.out.println("Average of "+n+" is = " +Sum/n);
}
}
          