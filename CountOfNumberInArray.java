/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katta 
 */
//  ********  This will work only on sorted array  **********.
import java.util.*;
public class CountOfNumberInArray {
    
    public static void main (String[] args)
    {
   int a[]={1,2,3,5,6,7,9,9,9,10,10,10,10,11,11,11,11,11,12,13};
   
    int j;
    
    int key=0,count=1;
   for (j=1;j<a.length;j++)
   {
      
     key=a[j-1];
            if (key==a[j])
            {
                count=count+1;
                 if (j==a.length-1)  // If the searched number which is duplicate happens to be last
                 System.out.println("count"+ count + " key "+ key);   
                
            }
             else
             {
               if (count==1) // This logic  will continue to the next number if the numbers are notequal
               continue;    // This logic  will print only the repeated numbers
                   System.out.println("count "+ count + " of key "+ key);
                count=1;  // this count is to initialze the count to 1 to start finding the duplicate of the next number in an array.
              // if (j==a.length-1)
                //  System.out.println("count"+ count + " key "+ a[j]); 
               } 
            }
   
     }
}
