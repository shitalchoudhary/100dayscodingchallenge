import java.util.Scanner;
class PrintLast3_Digit
{
     public static void main(String []args)
{
    System.out.println("Enter the number--> ");
   Scanner sc= new Scanner(System.in);
   int number =sc.nextInt();
   
    System.out.println("Last 3 digit is --> "+number%1000);
}
}