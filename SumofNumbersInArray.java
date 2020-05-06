/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katta
 */
import java.util.Scanner;
public class SumofNumbersInArray {
    
    public static void main(String[] args)
    {
        
        int a[] ={ 4,2,6,7,8,10,10,10} ;
        int sum=a[0];
        
        for (int j=1;j<a.length;j++)
        {
            sum =sum + a[j];
        }
        System.out.println(" Sum of array"+ sum);
    
        int b[] = { 3,5,7,2,8,10,12,14};
        int countA=0,countB=0;
    for (int j=0;j<a.length;j++)
    {
       if (a[j]==b[j])
           System.out.println(" a and b have equal values at index "+ j);
       else if (a[j]>b[j])
       {
           //System.out.println(" A is greater than B");
                  countA=countA+1;
       }
           else
           {
           //System.out.println(" B is greater");
             countB=countB+1;
           }          
           
    }
      System.out.println(" Final Values of A and B"+ countA + " " + countB);
    
    }
    
}
