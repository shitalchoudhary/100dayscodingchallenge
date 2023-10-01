class SumOfFirst13_EvenNumber
{
      public static void main(String[] args)
{
       int i, Sum=0;
       for(i=1; i<=27; i++)
       
            if(i%2==0)
          {
                   System.out.println(i); 
                   Sum=Sum+i;
        }
           System.out.println(" The sum of First 13 even number is  ="+Sum);        
        
}
}