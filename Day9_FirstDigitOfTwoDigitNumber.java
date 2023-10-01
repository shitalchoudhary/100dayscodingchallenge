import java.util.Scanner;
class FirstDigitOfTwoDigitNumber
{
     public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the two Digit number--> ");
	int num = sc.nextInt();
               if(num>=10 && num<=99)
               {
	     System.out.println("The first digit is--> "+num/10) ;
                }
                else 
	{ 
                     System.out.println("number is incorrect");
                 }
  }
}
 