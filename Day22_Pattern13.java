import java.util.Scanner;
class Pattern13{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number--> ");
int n=sc.nextInt();
for(int i=n; i>=1; i--)
{
	for(int j=1; j<=i; j++)
	{
		System.out.print("*");
	}
              for(int k=1; k<=2*(n-i); k++)
	{
		System.out.print(" ");
	}
              for(int m=1; m<=i; m++)
	{
		System.out.print("*");
	}

		System.out.println();
}
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=i; j++)
	{
		System.out.print("*");
	}
              for(int k=1; k<=2*(n-i); k++)
	{
		System.out.print(" ");
	}
              for(int m=1; m<=i; m++)
	{
		System.out.print("*");
	}

		System.out.println();
}
}
}