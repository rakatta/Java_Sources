/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katta
 * Best Case Omega (n)
 * Worst Case O(N*N)
 */
public class BubbleSort { 
    
    public static void main(String [] args)
    {
        int b[] ={8,4,1,10,9,6,7,3,2,56,23,78,54,21,89,76,47,0};
        int temp;
        for (int i=0;i<=b.length-1;i++)
        {
             if(i>2)  // to find the third largest number in an array
               {
                  System.out.println( "Third Largest Number " + b[i-1]); 
                  break ;
               }
            for (int j=i+1;j<=b.length-1;j++)
            {
               
                if (b[i]<b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
           
        for (int i=0;i<b.length;i++)
        System.out.println( b[i]); 
        System.out.println("-----------------------");
        int a[]={8,4,1,10,9,6,7,3,2,56,23,78,54,21,89,76,47,0};
        for (int i=a.length-1;i>=0;i--)
        {
           
        if((i)<a.length-3)  // to find the third largest number in an array
        {  
            System.out.println(" Third largest number "+ a[i+1]);
        break;
        }
            for (int j=i-1;j>=0;j--)
            {
                if (a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
         // Another form of bubble sort implementation improvisation
        for (int i=0;i<a.length;i++)
        System.out.println( a[i]);
        System.out.println("-----------------------");
      int c[] ={8,4,1,10,9,6,7,3,2,56,23,78,21,89,76,47,0,54};
      int t=0;
      int counter;
      for (t=0;t<=c.length-1;t++)
      {
          counter=0;  //this counter declared to zero
    	  for (int l=0,j=l+1;j<c.length-t;j++,l++) // j<c.length-t indicates for each iteration of t, the largest value gets stored at the last index.
    //hence length-t indicates the comparisons ignoring the last sorted number for each inner loop iteration
          {
              if (c[l]>c[j])
              {
                temp =c[j];
                c[j]=c[l];
                c[l]=temp;
                counter++;  //This counter increments when any swap happens 
                }
            }
    	  if (counter==0) //If the counter is zero after the iteration of the outer loop at some point,
    		  //then it means the array is sorted out and hence no more further iterations are required
    	   {
    	     System.out.println("t value is "+ t);
    	     break;
           }
           
       }
    for (int k=0;k<c.length;k++)
      System.out.println(c[k]);
    }

}
