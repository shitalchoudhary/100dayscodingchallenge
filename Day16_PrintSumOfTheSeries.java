import java.util.Scanner;
class PrintSumOfTheSeries
{
    public static void main(String []args)
{
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter any number--> ");
       int n = sc.nextInt();
       int i,sum=0;
       int term=0;
       for(i=1;i<=n;i++)
      {
           term= term*10 + 2;
          System.out.print(term);
      
	if(i<n)
	{
		System.out.print("+");
	}
	sum = sum + term;
	
}
	System.out.println("\nSum= "+sum);
  
   }

}