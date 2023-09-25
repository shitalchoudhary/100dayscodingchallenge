import java.util.Scanner;
class OneDaySalary
{
        public static void main(String []args)
{
    System.out.println(" Please enter your Monthly Salary");
    Scanner sc =new Scanner(System.in);
    int salary= sc.nextInt();
    System.out.println("your one day salary is --->  " +salary/30);
}
}
    