 import java.util.Scanner;
class UpperOrLowercase{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
 	System.out.println("Please enter a character--> ");
	char ch = sc.next().charAt(0);

          if(ch>='a' && ch<='z') 
          {
	System.out.println(ch+" =is a Lowercase alphabet");
           }
          else if(ch>='A' && ch<='Z')
            {
                 System.out.println(ch+" =is an Uppercase Alphabet");	
             }
            else 
             {
	System.out.println(ch+"=  is not an Alphabet");
               }
        }
}