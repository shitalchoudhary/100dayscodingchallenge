class SumOfEvenNumber
{
      public static void main(String[] args)
{
       int i, Sum=0;
       for(i=1; i<=10; i++)
       {
            if(i%2==0)
                   System.out.println(i);
                   Sum=Sum+i;
          }
                  System.out.println("Sum ="+Sum);
        
}
}