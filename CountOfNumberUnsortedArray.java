/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katta
 */
//This program prints the count of every number in an array.
public class CountOfNumberUnsortedArray {
      
    public static void main (String [] args)
    {
        int num[] = {1,31,26,11,26,99,40,31,11,1,26,26,40,26};
		   int k,l,count=1;
		 for (k=0;k<=num.length-1 ;k++ )
		{
			if (num[k]==0)
                            continue;
                     for (l=k+1;l<=num.length-1 ;l++ )
			{
                            if (num[k]==num[l] && num[l]>0)
                            {
                                count+=1;
                                num[l]=0;    // flush the variable to nullify the contingention
                                continue ;
                            }                       
                        }
                        if (count>1)
                        {
                            System.out.println("count value of  number "  + num[k] + " is " + count );
                          count=1; 
                        }
                          else
                         System.out.println("Count value of number" + num[k] + " is " + count);   
              }
    }

}
