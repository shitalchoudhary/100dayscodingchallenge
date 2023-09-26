import java.util.Scanner;
class VowelConsonant
{
public static void main(String []args)
{
       System.out.println(" Enter Character ");
       Scanner sc= new Scanner(System.in);
      char ch = sc.next().charAt(0);
       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'  || ch == 'u' || ch == 'A' || ch== 'E' || ch == 'I' || ch == 'O' || ch == 'U')
       {
              System.out.println(ch+"<-- It is a Vowel");
        }
        else
        {
              System.out.println(ch+ " <-- It is a Consonant ");
        }
}
}