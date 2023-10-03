import java.util.Scanner;
class SumOfAllDigits
{
    public static void main(String []args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter  number--> ");
    int num= sc.nextInt();
    int sum=0,digit;
   for(sum=0; num!=0; num=num/10)
{
                digit=num%10;
	sum=sum+digit;
}
	System.out.println("Sum of digits is: " + sum);
  }

}	
  