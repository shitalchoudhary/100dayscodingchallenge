import java.util.Scanner;
class ConvertIntoMonths{
public static void main(String args[]) 
{
                  System.out.println("Enter your Age = ");
                  Scanner sc =new Scanner(System.in);
	int age = sc.nextInt();
	int TotalMonths=age*12;
	System.out.println("months = "+TotalMonths);
 }
}
