import java.util.Scanner;
class SeriesPrint
{
public static void main(String args[])
{

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number-->  ");
	int n = sc.nextInt();

             int i,S = 0;

           for(i=1; i<=n; i++)
          {
	S = S + i;
	System.out.print(S+" ");
          }


   }
}