import java.util.Scanner;
class ReverseNumber
{
  public static void main(String [] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Number--> ");
  int num =sc.nextInt();
  int  remainder,reverse=0;
   for(reverse=0; num!=0;  num= num/10)
{
     remainder= num%10;
     reverse = (reverse*10) + remainder;
}
       System.out.println("The reverse of given number  is= "+reverse);
   }
}