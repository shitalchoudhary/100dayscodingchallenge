import java.util.Scanner;
class DigitsPower
{
  public static void main(String args [])
{
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter the number--> ");
    int n = sc.nextInt();
    int d,revers=0,digit=0;
   while(n!=0)
   {
      d=n%10;
     revers=revers*10+d;
	++digit;
      n=n/10;
      
   }
	
  System.out.println("number of digit --> "+digit);
  System.out.println("raised to the power of --> "+digit);
  for(int i=1;i<=digit;i++)
  {
      d=revers%10;
      int res = 1;
      for(int j=1; j<=digit;j++)
      {
           res=res*d;
       }
 revers=revers/10;
 System.out.println(res);
}
 }
}
 
