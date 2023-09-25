import java.util.Scanner;
class LastDigitNumber
{
        public static void main(String []args)
{
      	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the two Digit number --->  ");
	int num = sc.nextInt();

	System.out.println("Last number is ---> "+num%10);
 }
}