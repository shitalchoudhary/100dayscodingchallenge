import java.util.Scanner;
class Pattern12
{
       public static void main(String []args)
{     
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Number--> ");
      int n =sc. nextInt();
      for(int i=1; i<=n; i++)
{
	char ch = (char)('A'+n-i);
	char ch1 = ch;

	for(int j=1; j<=i; j++)
	{
		System.out.print(ch1);
		ch1++;
	}
		ch++;
		System.out.println();
}
  }
}