import java.util.Scanner;
class SecondLargestElement{
public static void main(String []args){
               Scanner sc =new Scanner(System.in);
               System.out.print("Enter Array size--> ");
               int n= sc.nextInt();
               int a[] = new int[n];
               
           for(int i=0;i<n;i++){
                       System.out.print("a["+i+"] = ");
	          a[i] = sc.nextInt();
            }
            int temp=0;
           
           for(int i=0;i <n; i++){
               for(int j=i+1; j<n; j++){
                 if(a[i]>a[j]){
                                   temp=a[i];
                                   a[i] = a[j];
                                   a[j]=temp;
               }
            }
            }
       System.out.println("second largest number is= "+a[n-2]);
}
}
           