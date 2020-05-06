/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katta
 */
import  java.lang.*;
class Employee
{
    
}
public class Misc {
    
    int i;
    long b;
    byte a;
    char c;
    Employee emp;
	private Object block;   
    void fun()
    {
        System.out.println(i);
         System.out.println(b);
       System.out.println(a);
       System.out.println(c);
       
       
       if (emp==null)
           System.out.println("Not pointing to any object");
      
       else
       {
          System.out.println(" pointing to an object");
              
       }
      
       emp=new Employee(); 
        
       
    }
    
    public static void main (String[] args)
    {
        Misc d = new Misc();
        d.fun();
         loop1:
        for (int j=1;j<=5;j++)
        {
            loop2:
            for ( int k=1;k<=5;k++)
            {
                for ( int l=1;l<=5;l++)
                {  
                     if ( j==2 && k==2 && l==2 )
                         continue ;
                     System.out.println( " j "+ j +  "  k "+ k + "  l  " + l );
                }
                } 
            }  
        loop1:
           for (int f=1;f<10;f++)
           {
               System.out.println(" f value " + f);
                  
        loop2:
            for (int g=1;g<10;g++)
             {
               if (g==5)
                   continue loop1;
                System.out.println(" g value " + g);
             }
           }
           System.out.println("------------------");
           int arr[] = new int [5];
           try
           {
               
               for (int y=0;y<8;y++)
               System.out.println(arr[y]);
           }
           
           catch ( Exception e)
           {
               e.printStackTrace();
           }
           
           int brr[] ={ 10,20,30,40,50,60};
           int  crr [] =new int[3];
           crr=brr;
           System.out.println(crr.length);
           System.out.println(brr.length);
           for (int u =0;u<crr.length;u++)
               System.out.println(crr[u]);
           int w=0;
           System.out.println("W is "+ w);
           w=crr[crr.length-1];
           System.out.println(" k value is the last element in array "+ w);
           for  (int v : crr)
               System.out.println(v);
               

    }
    }


