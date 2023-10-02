import java.util.Scanner;
class ReversNaturalNumber
{
      public static void main(String []args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter the value = ");
    int n = sc.nextInt();
    System.out.println("The Revers Natural number  "+n+" to 1 is= ");
    int i;
      for(i=1; n>=i; n--)
      {
           System.out.println(n);
       }
      
}
}
     
     