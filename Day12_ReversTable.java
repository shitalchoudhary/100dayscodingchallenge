import java.util.Scanner;
class ReversTable
{
      public static void main(String []args)
{
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter any number for Revers Table print--> ");
       int num= sc.nextInt();
       int i;
       for(i=10; i>=1; i--)
       {
          System.out.println(num*i);  
        }
}
}