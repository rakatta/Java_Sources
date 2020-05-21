
  /* To find the continous sub array to find a given sum*/


import java.lang.*;

class SubArraySum
{
 public static void main (String args[])
 {
  int a[] = { -2,-3,3,-2,-2,1,5,6};
  int b[] = new int[8];
   // Find the max continous sub array with a given sum 
   int count=0,sum=0;
   x: for ( int i=0;i<a.length;i++)
   {
     for (int j=i, l=0;j<a.length;j++,l++)
     {
       sum = sum + a[j];
        b[l] = a[j];
        count=l;
       
       if ( sum == 11)
      {
       System.out.println(" Sum Value : " + sum);
       for (int k=0;k<=count;k++)
       System.out.print(b[k] +"\t");
       break x;
      }   
      
     }
      sum=0; count=0;
   }
   if (sum !=11)
   System.out.println("No Sub array found");
   System.out.println(); 
  } 
}
 
