 import java.util.Scanner;
class DaysInMonth
{
      public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the month number--> ");
	int M = sc.nextInt();

                 if(M==1)
                 {                 
	     System.out.println("January \n 31 Days in january ");
                  }
                 else if(M==2)
                 {
	      System.out.println("Februry \n 28 (29 in Leap years) Days in Februry");
                  }
                  else if(M==3) 
                  {
	      System.out.println("March \n 31 Days in March");
                   }
                  else if(M==4)
                  {
	       System.out.println("April \n 30 Days in April");
                   }
                   else if(M==5)
                   {
                         System.out.println("May \n 31 Days in May ");
                    } 
                   else if(M==6)
                   {
	        System.out.println("June \n 30 Days in june ");
                    }
                    else if(M==7)
                    {
	         System.out.println("July \n 31 Days in july "); 
                    }
                   else if(M==8)
                   {
	         System.out.println("August \n 31 Days in August");
                    }
                    else if(M==9)
                    {
                           System.out.println("September \n 30 Days in September ");
                     }
                    else if(M==10)
                    {
	         System.out.println("October \n 31 Days in October ");
                    }
                    else if(M==11)
                    {
                          System.out.println("November \n 30 Days in November");
                    }
                   else if(M==12)
                    {
	          System.out.println("December \n 31Days in December ");
                     }
                  else
                  {
	         System.out.println("Invalid month number");
                   }
  }
}