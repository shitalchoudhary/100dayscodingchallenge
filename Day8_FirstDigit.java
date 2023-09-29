 import java.util.Scanner;
class FirstDigit
{
     public static void main(String args[])
{
                 Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number--> ");
	int number = sc.nextInt();

                 while(number >=10)
                {
	number=number/10;
                 }
	System.out.println("First Digit is="+number);
  }
}