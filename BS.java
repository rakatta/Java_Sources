/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katta
    Time complexity
    Best Case : Omega (1)
    Worst Case : O(logn)
 */
import java.util.Scanner;
public class BS 
{
    
     public static void main(String[] args) 
     {
        System.out.println("Hello World!");
        int array[] = {2, 5 , 7,10, 13, 16,18, 19, 20};

        int high = array.length - 1;
        for ( int i=0;i<high;i++)
        System.out.println(array[i]+ " index "+ i);
        System.out.println("Enter the input"); 
        Scanner obj = new Scanner(System.in);

        int key = obj.nextInt();
        System.out.println("Key value" + key);
        
         int result =-1;
        int low = 0;
        int mid = 0;
        
        while (low <= high) {
            mid = (low + high) / 2;
            // System.out.println(mid);
            if (key == array[mid]) {
                result =mid;
                              
                break;
               
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            } 
            
        }
        if (result==-1)
            System.out.println("Number not found");
        else
            System.out.println(" Number " + array[mid] + " found at index " + mid );
        
      }
}   
