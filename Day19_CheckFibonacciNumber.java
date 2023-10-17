import java.util.Scanner;
class CheckFibonacciNumber
{
     public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any Number to check no. is Fibonacci or not-> ");
    int n = sc.nextInt();
    int a=0,b=1,c=0;
    for(int i=0;i<=n;i++)
{
      c=a+b;
      a=b;
      b=c;
      if (c==n)
      {
           break;
       }
}
if(c==n)
{
    System.out.println(n+" is fibonacci Number");
}
else
{
    System.out.println(n+" is not  fibonacci Number");
}
}
}