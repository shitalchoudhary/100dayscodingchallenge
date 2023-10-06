 import java.util.Scanner;
class SumOfSquare
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number--> ");
	int num = sc.nextInt();
               int i,  sum = 0;
              for(i=1; i<=num; i++)
             {
                 	sum = sum +i*i;
              }
              System.out.println("Sum of squares from 1 to " + num + " is=  "+sum);

  }
}
	