import java.util.Scanner;
class SumOfAllFactorial
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number--> ");
	int n = sc.nextInt();

               int i, factorial = 1, sum=0;

              while(n != 0)
              {
	n = n%10;
	for( i=2; i<=n; i++)
	{
		factorial = factorial*i;
		System.out.println("Factorial of "+i+" is= "+factorial);
		sum = sum + factorial;
	}
	
	System.out.println("Sum of factorial is= "+sum);	
	n = n/10;
                }
    }
}