import java.util.Scanner;
class FindLargestElementInArray{
public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();
	int[] a = new int[n];
  
              for(int i=0; i<n; i++) 
              {
		System.out.print("a["+i+"]=");
		a[i] = sc.nextInt();
	}
	int Large = a[0];
              for(int i=1; i<n; i++)
              {
		if(Large<a[i]) 
                           {
                          		Large=a[i];
		}
	}
	System.out.print("Largest element =  "+Large);
}
}