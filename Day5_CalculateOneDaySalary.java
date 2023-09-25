import java.util.Scanner;
class OneDaySalary
{
        public static void main(String []args)
{
    System.out.println(" Please enter your Monthly Salary");
    Scanner sc =new Scanner(System.in);
    double salary= sc.nextDouble();
    System.out.println("your one day salary is --->  " +salary/30);
}
}
    
