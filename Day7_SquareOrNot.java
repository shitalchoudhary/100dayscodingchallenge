 import java.util.Scanner;
class SquareOrNot
{
        public static void main(String args[])
{
  	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the length of Square--> ");
	float l = sc.nextFloat();
	System.out.print("Please enter the breadh of Square--> ");
	float b = sc.nextFloat();

                 if(l == b)
                 {
	         System.out.println("It is a square");
                  }
                 else 
                  {
                      	System.out.println("It is not a square");
                   }
  }
}