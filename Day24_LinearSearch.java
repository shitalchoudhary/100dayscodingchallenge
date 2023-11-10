import java.util.Scanner;
class LinearSearch{
public static void main(String []args){
      
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter  the size of array--> ");
          int n = sc.nextInt();
          int []a =new int[n];
 
         for(int i=0 ; i<n; i++)
         {
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
          }
          System.out.print("check element-- > ");
          int check = sc.nextInt();
    
           boolean b = true;
           for(int i=0; i<n; i++)
           {
			
	   if(a[i] == check) 
	   {
		System.out.println(check +" at index--> "+i);
		b = false;
	    }
			
            }
                  if(b) 
	    {
		System.out.println("Element is not found");
	     }
}
}