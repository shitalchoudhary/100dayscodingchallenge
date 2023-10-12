import java.util.Scanner;
class CountTheDigitOfNumber
{
   public static void main(String []args)
{
      Scanner sc=new Scanner(System.in);
      System.out.print(" Enter the number --> ");
      int n=sc.nextInt();
       int i, digit=0,sum=0;
       while(n!=0)
        {
           i=n%10;
           sum=sum+i;
           n=n/10;
          ++digit;
       }
     System.out.println("Number of digit --> "+digit);
      System.out.println(" Sum of all the digit --> "+sum);
}
}