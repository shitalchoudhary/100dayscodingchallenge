import java.util.Scanner;
class CubeOfEverySingleDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number--> ");
        int n=sc.nextInt();
        int  digit,cube,revers=0;
        while(n!=0)
       {
         digit=n%10;
         revers=revers*10+digit;
         n=n/10;
       }

       while(revers!=0)
       {
           digit=revers%10;
           cube=digit*digit*digit;
           
         
        System.out.println("cube of digit -- > "+cube);
       revers=revers/10;
       }
}}

         