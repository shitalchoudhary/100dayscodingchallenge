import java.util.Scanner;
class CheckNumber{
public static void main(String []args)
{
          System.out.println("Enter any Number--->");
          Scanner sc = new Scanner(System.in);
         int Num = sc.nextInt();
         if(Num>=21 && Num<=575)
        {
             System.out.println("Yes Number is valid");
         }
        else
       {
           System.out.println("Sorry Number is not valid");
        }
}
}