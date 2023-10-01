class SumOfMultiplesOf3
{
       public static void main(String []args)
{
        int i, Sum=0;
        for(i=1; i<=40; i++)
        
        if(i%3==0)
         {
              System.out.println(i);
                Sum= Sum+i;
        }
       System.out.println("Sum of Multiples of 3  is = "+Sum);
}
}