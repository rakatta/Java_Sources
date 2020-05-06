
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katta
 */
import java.util.*;
public class MaxMinValue {                                         

    public static void main(String[] args)  
    {
        int array[]={7,6,10,16,3,8,1,14,15};
        int c=array[0];
        int i;
        for ( i=0;i<array.length-1;i++)
        {
            //c=array[i-1];
            if (c<array[i])
            {
                c=array[i];
            }
       }
        System.out.println("Maxvalue" + c);
        for (i=0;i<array.length-1;i++)
        {
        if (c>array[i])
        {
            c=array[i];
        }
        }
        System.out.println("Min Value "+ c);
       
       
   }

}
