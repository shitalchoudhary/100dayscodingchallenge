 import java.util.Scanner;
class TriangleCheck
{
      public static void main(String args[])
{
                 Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 1st angle of Triangle--> ");
	int angle1 = sc.nextInt();
	System.out.print("Enter the 2nd angle of Triangle--> ");
	int angle2 = sc.nextInt();
	System.out.print("Enter the 3rd angle of Triangle--> ");
	int angle3 = sc.nextInt();	

                 if((angle1+angle2+angle3)==180)
                 {
	        System.out.println("Triangle is valid");
                  }
                 else
                 {
	        System.out.println(" Triangle is not valid");	
                  }
  }
}