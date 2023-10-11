import java.util.Scanner;
class SumOfOddNaturalNumber
{
	public static void main(String args[]) 
   {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number --> ");
		int n = sc.nextInt(); 

		int i, sum = 0;
                              System.out.print(n+" Odd number is-->  ");
		

		for (i = 1; i <= n * 2; i++) 
                             {
                                 
			if (i % 2 != 0) 
                                            {
				System.out.print(i);
                                           if(i<n*2-1)
                                             {
				 System.out.print(",");
                                              }
				sum = sum + i;
			}
			
		}

		System.out.println("\nSum of odd number is = " + sum);

    }
}