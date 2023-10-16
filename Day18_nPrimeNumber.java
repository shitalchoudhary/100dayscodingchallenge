import java.util.Scanner;
class nPrimeNumber
{
    public static void main(String []args)
{
     Scanner sc =new Scanner(System.in);
     System.out.print("Enter the Number--> ");
     int n = sc.nextInt();
     int count = 0, num;
     boolean isPrime = true;
   num = 2;
     while (count < n) 
    {
         for (int i= 2; i <= num / 2; i++)
        {
	if (num % i== 0)
              {
		isPrime = false;
		break;
	}
         }
	if (isPrime)
             {
		count++;
		System.out.print(num+" ");
	}
		num++;
                            isPrime=true;
    } 

}
}