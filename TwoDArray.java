/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katta
 */
import java.lang.ArithmeticException;
public class TwoDArray {
    
    public static void main (String[] args)
    {
        int a[][] ={ {1,2,3,4},{4,5,6,6},{7,8,9,9},{10,11,12,13}};
        System.out.println("array length" + a.length);
        int sum=0,sum1=0;
        for ( int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                if (a[i]==a[j])
                {
                    sum =sum + a[i][j];
                sum1=sum1+a[a.length-1-i][j];
                System.out.println(a[a.length-1-i][j]);
                }
            }
        }
        System.out.println(" determinent of matrix is "+ ( sum - sum1));
    
        /*Given an integer, for each digit that makes up the integer determine whether it is a divisor. 
        Count the number of divisors occurring within the integer.*/
    int k = 5030;
    int x,count=0;
    int z=k;
    while (k>0)
    {
        x=k%10;
        k = k/10;
        try
        {        
        if ( (z%x)==0)
        {
            System.out.println(" number disible by "+ x);
            count +=1;
        }
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
     }
      System.out.println(" total number of divisors for the account"+ count); 
      
      byte p=40,q=50;
      int r = p*q;
      System.out.println(q);
        q=(byte) (p * 2);
        
       double d=42.25;
       System.out.println("Value"+ d%20);
       int u=42,v=15;
       System.out.println(u&v);
       
       
    } 
}
