import java.util.Scanner;
class SumOfnthTermSquare
{
   public static void main(String []args)
{
     Scanner sc = new Scanner(System.in);
     System.out.print("Enetr any number --> ");
     int n= sc.nextInt();
     int i,sum=0,square=0;
     for(i=1;i<=n;i++)
     {
       square=i*i;
       System.out.println("square of " + i + " is= "+square);
       sum=sum+square;
     }
       System.out.println("Sum of squares is= "+sum);
}
}