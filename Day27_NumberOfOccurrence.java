import java.util.Scanner;
class NumberOfOccurrence{
public static void main(String []args){
               Scanner sc =new Scanner(System.in);
               System.out.print("Enter Array size--> ");
               int n= sc.nextInt();
               int a[] = new int[n];
     
           for(int i=0;i<n;i++){
                       System.out.print("a["+i+"] = ");
	          a[i] = sc.nextInt();
           }
        int count = 0;
        System.out.print("Enter Number--> ");
        int b = sc.nextInt();  
   
        
        for (int i = 0; i < n; i++) {
	if (a[i] == b) {
			
                                   ++count;
	} 
         
          }
		System.out.println(count);
	}
} 
