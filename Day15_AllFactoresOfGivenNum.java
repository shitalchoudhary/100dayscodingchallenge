 import java.util.Scanner;
class  AllFactoresOfGivenNum
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number--> ");
	int n = sc.nextInt(); 
               int i;
 	System.out.print("Factors of "+n+" is--> ");
              for( i=1; i<n; i++)
              {
	if(n%i==0)
	{
		System.out.print(i+",");	
	}
	
              }	
   }
}