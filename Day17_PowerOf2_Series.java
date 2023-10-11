import java.util.Scanner;
class PowerOf2_Series
{
public static void main(String args[])
{

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of terms where you want to print the series --> ");
	int n = sc.nextInt();
              int i, power = 1;	

       for(i=1; i<=n; i++) 
       {
	power = power * 2;
	System.out.print(power+" ");
        }
    }
}