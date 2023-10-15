import java.util.Scanner;
class ArmStrongNumber
{
     public static void main(String []args)
{
     Scanner sc=new Scanner(System.in);
     System.out.print(" Enter the Number --> ");
     int n= sc.nextInt();
     int digit=0, d,revers=1,sum=0,n1=n;
     while(n!=0)
     {
        d=n%10;
      revers=revers*10+d;
      n=n/10;
      ++digit;
    }
for(int i =1;i<=digit;i++)
    {
      d=revers%10;
      int res =1;
      for(int j=1; j<=digit; j++)
      {
           res =res*d;
      }
revers=revers/10;
System.out.println(res);
sum=sum+res;

    }
System.out.println("sum is= "+sum); 
if(sum==n1)
{
   System.out.println(n1+" =Number is Armstrong");
}
else
{
     System.out.println(n1+ " =Number is not Armstrong");
} 
}
}