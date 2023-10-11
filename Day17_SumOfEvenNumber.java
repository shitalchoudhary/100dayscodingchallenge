import java.util.Scanner;
class SumOfEvenNumber
{
      public static void main(String []args)
{
     Scanner sc= new Scanner(System.in);
     System.out.print(" Enter the Number--> ");
      int n=sc.nextInt();
     int i,square=1 ;
      for(i=1; i<=n*2; i++)
     {
         
         if(i%2==0)
         { 
           square=i*i;
             System.out.print(square+" ");
          }
       }
}
}