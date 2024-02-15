import java.util.*;
class FirstElementKTime{
public static void main(String []args){
               Scanner sc =new Scanner(System.in);
              System.out.print("Enter Array size---> ");
               int n =sc.nextInt();
               int a[] =new int[n];
               boolean f = false;
  
          for(int i=0; i<n; i++){
                         System.out.print("a["+i+"] = ");
               a[i] = sc.nextInt();
          }

       System.out.print("Enter the element: ");
		int k = sc.nextInt();

		int b[] = a.clone();
		Arrays.sort(b);
		b = new int[b[n - 1] + 1];
		for (int i = 0; i < n; i++) {
			b[a[i]]++;
			if (b[a[i]] == k) {
				System.out.println(a[i]);
				f = true;
				break;
			}
		}
		if (!f)
			System.out.println(-1);
      }
}