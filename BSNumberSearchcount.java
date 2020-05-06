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

class BSNumberSearchcount {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int array[] = {10, 10 , 10, 10, 10, 10, 10, 12, 12};
        boolean search ;
        int high = array.length - 1;
        System.out.println("Enter the input");
        Scanner obj = new Scanner(System.in);

        int key = obj.nextInt();
        int highkey = findIndexvalue(array, high, key,true);
        int lowkey = findIndexvalue(array, high, key,false);
        if (highkey == -1 && lowkey == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("higher index value " + highkey);
            System.out.println("Lower index value"+ lowkey);
            int count = highkey - lowkey + 1;
            System.out.println(" count of number " + key + " is " + count);
        }
      
    }
    public static int findIndexvalue(int[] array, int high, int x,boolean search ) {
        
        int result = -1;
        int low = 0;
        int mid = 0;
        
        while (low <= high) {
            mid = (low + high) / 2;
            // System.out.println(mid);
            if (x == array[mid]) {
                if (search==true)
                {
                result = mid; 
                 low=mid+1;
                }
                else
                {
                result = mid;
                high = mid - 1;
                }
            } else if (x > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
            return result;
        
    }
}
