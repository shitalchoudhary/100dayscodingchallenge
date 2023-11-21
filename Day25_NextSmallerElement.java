import java.util.Scanner;
class NextSmallerElement{
public static void main(String []args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Array size--> ");
                 int n = sc.nextInt();
                 int a[] = new int[n];

        for(int i=0; i<n; i++){
        System.out.print("a["+i+"] = ");
        a[i] =sc.nextInt();
        }
    
        for(int i=0; i<n-1;i++){
        if(a[i]>a[i+1]){
                       System.out.print(a[i+1]+" ");
         }
         else{
                       System.out.print("-1 ");
         }
          }
          System.out.print("-1 ");
}
}