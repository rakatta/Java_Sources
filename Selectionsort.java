/*
 * 
 * Worst case O(N*N)
 * Best case Omega(N*N)
 */


public class Selectionsort {
	
	public static void main(String args[])
	{
		int a[] = {8,4,1,10,9,6,7,3,2,56,23,78,54,21,89,76,47,0,91,72,86,100};
		int k=0;
	    int j=0,l=0;
		for (int i=0;i<=a.length-1;i++)
		{
	      k=i;;	
	     /* if(i>2)
	      {
	    	  System.out.println("third largest number "+a[i-1]);
	          break;
		   }*/
     	  for( j=i+1;j<=a.length-1;j++)
		   {
			 if ( a[k]>a[j] )  //check with the indices for the smallest number in the array
			 
				 k=j;  //if yes then assign the index to k 
		//(in this way we can find the smallest number with its index for the first complete iteration of outer loop
     		 
			}
     	  //if (k!=i)
     	  l=a[k];
     	 a[k]=a[i];	 
		 a[i]=l;
		   
	     }
		
		for (int m=0;m<a.length;m++)
			System.out.println(a[m]);
	}
}
