import java.util.Scanner;
class SumOfFactores
{
	public static void main(String args[])
 {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number-->  ");
		int num = sc.nextInt();
		int i, sum = 0;
		for ( i = 1; i < num; i++)
                               {
			if (num % i == 0) 
                                               {
				sum = sum + i;
				System.out.println("Factors of " + num+" is= " + i);
			}
		}

		System.out.println("Sum of factors= " + sum);
}

}		