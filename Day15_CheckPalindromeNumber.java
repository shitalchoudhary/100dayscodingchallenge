 import java.util.Scanner;
class CheckPalindromeNumber
{
     public static void main(String args[]) 
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number --> ");
	int num = sc.nextInt();

               int revers=0, digit, num1=num;
while(num1 != 0)
{
                digit = num1%10;
	revers = revers*10 + digit;
	num1 = num1/10;
}

if(revers==num)
{
	System.out.println(num+" = is Palindrome number");
}
else
{	
	System.out.println(num+" = is not Palindrome number");
}
   }
}	