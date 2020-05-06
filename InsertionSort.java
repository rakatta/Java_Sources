/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katta
 */
public class InsertionSort {
    
    public static void main (String [] args)
    {
        int a[] = { 4,8,-10,-2};
        int value=0,hole=0;
        for (int i=1;i<=a.length-1;i++)
        {
            value =a[i];
            hole=i;
            
            while (hole>0 && a[hole-1]>value)
            {
                a[hole]=a[hole-1];
                
                hole=hole-1;            
            }
            a[hole]=value;
        }
        for (int y=0;y<a.length;y++)
            System.out.println(a[y]);
    }

}
