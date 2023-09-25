import java.util.Scanner;
class DistinctSubject
{
         public static void main(String []args)
{
     
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter English subject marks-->  ");
		double EnglishMarks = sc.nextDouble();
		System.out.println("Please enter Hindi subject marks--> ");
		double HindiMarks = sc.nextDouble();
		System.out.println("Please enter Maths subject marks--> ");
		double MathsMarks = sc.nextDouble();
		if (EnglishMarks >= 75)
                                    {
			System.out.println("Hey You got distinct in english -->" +EnglishMarks);
		}
		if (HindiMarks >= 75)
                                    {
			System.out.println("Hey You got distinct in hindi --> " +HindiMarks);
		}
                                     if (MathsMarks >= 75) 
                                     {
			System.out.println("Hey You got distinct in maths --> " +MathsMarks);
		}
	}
}
