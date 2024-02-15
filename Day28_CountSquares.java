import java.util.Scanner;
class CountSquares {
public static void main(String args[] ){

      Scanner sc = new Scanner(System.in);
      System.out.print("Enetr the Number--> ");
      int n= sc.nextInt();
      int count =0;
      
for(int i=1; i<Math.sqrt(n); i++){
     
           int Square =i*i ;
           if (Square <n){
                       
                 count++;
           }
}
System.out.println("The only perfect squares less than " +n+ " is : "+count);
}
}
      
