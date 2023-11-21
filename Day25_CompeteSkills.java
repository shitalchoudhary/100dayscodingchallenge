import java.util.Scanner;
class CompeteSkills{
public static void main(String args[]){

              Scanner sc = new Scanner(System.in);
	System.out.print("Enter array size --> ");
	int n = sc.nextInt();
	int[] a = new int[n];
	int[] b = new int[n];

	int A = 0, B = 0;
	 System.out.println("Enter values  ");
	for (int i = 0; i < n; i++) {
                             System.out.print("a["+i+"] = ");
		  a[i] = sc.nextInt();
	}
	 System.out.println("Enter values  ");

	for (int i = 0; i < n; i++) {
            		 System.out.print("b[" + i + "] = ");
		 b[i] = sc.nextInt();
	}

	for (int i = 0; i < n; i++) {
	if (a[i] >b[i]) {
		A++;
	} else if (a[i] < b[i]) {
		B++;
	  }
	}
	System.out.println("a=" + A);
	System.out.println("b=" + B);

}
}