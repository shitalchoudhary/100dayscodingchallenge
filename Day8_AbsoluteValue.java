import java.util.Scanner;
class AbsoluteValue
{
       public static void main(String args[])
{
                 Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value -->  ");
	int a = sc.nextInt();
                 if(a>=0)
	{
                         System.out.println("Absolute value --> "+a);
                  }
                  else
	{
                          System.out.println("Absolute value --> "+(-a));
                  }
  }
}
