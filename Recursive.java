/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katta
 */
import java.util.Scanner;
public class Recursive {
    
        public  long Factorial(int n)
        {
        long fact,x; 
        if (n==0)
             return 1;
         else
              x=Factorial(n-1);
              fact=n*x;
                    
          System.out.println("Fact in Function "+ n +" * " + x + "= "+ fact);
        return fact;
        }
        
        public int ArrayofIntegers(int[] a,int x)
        {
            int sum=0;
            if ( x==0)
                return a[0];
               int recursive = ArrayofIntegers(a, x-1);
            sum=a[x]+recursive;
            System.out.println(" Recurive function loop  sum = " + a[x] + " + " + recursive + " = " + sum);
            return sum;
        }
       
        public  int[] ArrayDemo( int[] a,int x)
        {
            System.out.println("  x value before it goes into recursive "+ x);
            if (x==0)
            {
                System.out.println(a[x]);
                return a;
            }
                int []k ;
                 k=ArrayDemo(a,x-1); 
                
                if( x+1<=k.length)
                {
                 System.out.println(" arr length after each recursive "+ k.length);
                 System.out.println(" x value after returing from recursive"+ x);
                	
                 for (int n=0;n<x+1;n++)
                 System.out.println(" Array elements " + k[n]);
               
                }
               return k;
                
        }
        
        public static void main (String[] args)
    {
        
        System.out.println(" Enter the input");
        Scanner x = new Scanner(System.in);
        int k = x.nextInt();
        x.close();
        System.out.println("x value"+ k);
          Recursive result=new Recursive();
         long f =  result.Factorial(k);
          System.out.println("Factorial of a number is "+ f);
          int[] arr = {3,4,2,5,6,7};
          
          int sum = result.ArrayofIntegers(arr,arr.length-1);
          System.out.println("sum of numbers is "+ sum);
          
          int[] arrayDemo = result.ArrayDemo(arr, arr.length);
         for (int i=0;i<arrayDemo.length;i++)
          System.out.println(arrayDemo[i]);
    }

}
