/*

 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katta
 * Time complexity :
 * Worst Case O(logn)
 * Best Case Omega (1)
 */
import java.util.Scanner;

class SortedArrayCircularRotationBS { 

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int array[] = {11,12,14,15,2,3,5,7,10};
        int high = array.length - 1;
        for ( int i=0;i<=high;i++)
        System.out.println(array[i]+ " index "+ i);
        System.out.println("Enter the input"); 
        Scanner obj = new Scanner (System.in);
        int key = obj.nextInt();
        System.out.println("Key value" + key);
        
         int result =-1;
        int low = 0;
        int mid = 0;
        int n = array.length;
        int i=0;
        while (low <=high) {
            mid = (low + high) / 2;
            if (high ==0 && low ==0  && key!=array[mid])
            break;
            System.out.println("low value count: " + low+ ":: high value count: " + high);
            System.out.println("mid value count: " + mid);
            
            if ( key == array[mid])
            {
             result = mid;
             break;
            }
             else 
           if (array[mid] < array[high])
             {
             if (key>=array[mid] && key<=array[high])
               low = mid+1;
               
              else 
              high = mid-1;
                
               
            } else if (array[low] < array[mid]) {
            
                if ( key>=array[low] && key<array[mid] )
                high = mid-1;
               else
                low = mid + 1;
            } 
            i++;
            try{
          Thread.sleep(1000);
        }
        catch(InterruptedException ex){
        ex.printStackTrace();
       }
     }
        if (result == -1)
         System.out.println("Number not found in circlar sorted array");
        else
         System.out.println(" number found at index  " + mid + " element:::" + array[result]);
        
      }
}   
