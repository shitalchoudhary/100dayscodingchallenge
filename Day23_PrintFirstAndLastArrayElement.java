import java.util.Scanner;
class PrintFirstAndLastArrayElement{
public static void  main(String []args){

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Number of array--> ");
     int n=sc.nextInt();
     int []a=new int[n];
for(int i=0; i<n;i++)
{
      System.out.print("a["+i+"] =");
      a[i] =sc.nextInt();
}
      System.out.println("First element: "+a[0]);
      System.out.println("Last element: "+a[n-1]);

    }
} 