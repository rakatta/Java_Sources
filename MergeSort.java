/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katta
 */
public class MergeSort {

      public static void main (String[] args)
      {
          int a[] ={ 4,2,1,8,6,9,3,10,7};
          int l=0,h=a.length-1;
          System.out.println("Before Sorted Array:");
          for(int arr=0;arr<a.length;arr++)
        	 System.out.println(a[arr]); 
        
          mergesort(a,l,h);
          System.out.println("After Sorted Array:");
          for(int arr=0;arr<a.length;arr++)
          System.out.println( a[arr]); 
   
      }  
          public static void mergesort(int []a, int low, int high)
          {
              if(low<high)
              {
                 int m=(low+high)/2;
            	  
            	 mergesort(a,low,m);          
            	 mergesort(a,m+1,high);
            	 Merge(a,low,m,high);
              }
          }
                   
          public static void Merge(int[] a, int low, int mid, int high)
          {
              int i=0,j=0,k=0;
              int nL= mid-low+1;
              int rL = high-mid;
               int L[] = new int[nL];
               int R[]  =new int [rL];
              for (int x = 0; x < nL; x++)
               L[x] = a[low+x ];
               for (int x = 0; x < rL; x++)
               R[x] = a[mid + 1+x];
               k=low;
               while(i<nL && j<rL)
               {
                   if(L[i]<=R[j])
                   {
                       a[k]=L[i];
                       i=i+1;
                   }
                   else
                   {
                       a[k]=R[j];
                       j=j+1;
                   }
                   k=k+1;
               }
               
               while (i<nL)
               {
                   a[k]=L[i];
                   i=i+1;
                   k=k+1;
               }
               while (j<rL)
               {
                   a[k] = R[j];
                   j=j+1;
                   k=k+1;
               }
        } 
    }
               
 