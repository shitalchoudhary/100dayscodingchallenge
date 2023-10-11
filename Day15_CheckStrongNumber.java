import java.util.Scanner;
class CheckStrongNumber
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print(" Enter any number to check no. is strong or not--> ");
    int num = sc.nextInt();

    int i,n, fact=0, sum=0;
    n=num;

    while(n!= 0)
    {
	fact= n%10;
              int factors = 1;
	for( i=1; i<=fact; i++)
             {
		factors = factors*i;
             }
		sum = sum + factors;
                         n = n/10;
   }
	
	System.out.println("Sum of factorial is= "+sum);	
         if(sum==num)
           {
                System.out.println(num+ " = is Strong number. ");
            }
        else
           {
                System.out.println(num+ " = is not Strong number. ");
            }
     
	
      }
   }
