import java.util.Scanner;
class MultiplesOf_4Series
{
    public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Number--> ");
    int n =sc.nextInt();
    int i ,m=1;
    System.out.print(m+" ");
    for(i=0;i<=n;i++)
    {
         m=m+4;
         System.out.print(m+" ");
     }
}
}