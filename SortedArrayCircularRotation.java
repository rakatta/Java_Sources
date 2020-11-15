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

class SortedArrayCircularRotation {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int array[] = {9,11,15,2,3,5,7};
        int high = array.length - 1;
        for ( int i=0;i<=high;i++)
        System.out.println(array[i]+ " index "+ i);
        
        
         int result =-1;
        int low = 0;
        int mid = 0;
        int n = array.length;
        while (low <= high) {
            mid = (low + high) / 2;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
            if (array[low]<=array[high])
            { 
             mid = low;
             break;
            }
            
            // System.out.println(mid);
            else if ((array[mid]<array[next]) && (array[mid]<array[prev])) {
                result =mid;
                              
                break;
               
            } else if (array[mid] < array[high]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            } 
            
        }
        System.out.println(" Array rotated  " + mid + "   Times" +  "  pivot element:::" + array[mid]);
        
      }
}   
