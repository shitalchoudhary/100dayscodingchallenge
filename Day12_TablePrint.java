import java .util.Scanner;
class TablePrint
{
      public static void main(String []args)
{
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter any number for Table print--> ");
       int num= sc.nextInt();
       int i;
       for(i=1; i<=10; i++)
       {
          System.out.println(num*i);  
        }
}
}