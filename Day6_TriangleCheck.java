 import java.util.Scanner;
class TriangleCheck
{
         public static void main(String args[])
{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first side of triangle A1=");
	int A1 = sc.nextInt();
	System.out.println("Enter the 2nd side of triangle A2=");
	int A2 = sc.nextInt();
	System.out.println("Enter the 3rd side of Triangle A3=");
	int A3 = sc.nextInt();

                  if((A1+A2)>=A3 && (A2+A3)>=A1 && (A1+A3)>A2)
                  {
	       System.out.println("Valid");
                  }
                  else
                  {
	        System.out.println("Invalid");
                   }
  }
}