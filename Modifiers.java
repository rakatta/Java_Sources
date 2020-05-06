/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katta
 */
public class Modifiers {
    
    public static void basefunc()
    {
        System.out.print("Hello from Base func public");
    }
     public static void main (String[] args)
     {
         defaultModifier.defaultfunc();
         Modifiers.basefunc();
         int a=2, b =0;
         double c  =   2 / 7.0;
         System.out.println( "a = " +c+ "b is " + b ) ;
         b = -3 - - ( - 3 ) ;
         System.out.println( "a = " +a+ "b is " + b ) ;
     }
}

class defaultModifier{
    static void defaultfunc()
    {
        System.out.print("Hello from default func modifier");
    }
     
}
