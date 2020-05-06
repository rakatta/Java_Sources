
public class SubArrayMaxSum 
{
	
	 public static void main (String [] args)
	    {
	        int c[] = { -4,8,10,30,40,-100};
	        int t=0,temp=0;
	        int counter;
	        for (t=0;t<=c.length-1;t++)
	        {
	            counter=0;  //this counter declared to zero
	      	  for (int l=0,j=l+1;j<c.length-t;j++,l++) // j<c.length-t indicates for each iteration of t, the largest value gets stored at the last index.
	      //hence length-t indicates the comparisons ignoring the last sorted number for each inner loop iteration
	            {
	                if (c[l]>c[j])
	                {
	                  temp =c[j];
	                  c[j]=c[l];
	                  c[l]=temp;
	                  counter++;  //This counter increments when any swap happens 
	                  }
	              }
	      	  if (counter==0) //If the counter is zero after the iteration of the outer loop at some point,
	      		  //then it means the array is sorted out and hence no more further iterations are required
	      	     break;
	                          
	         }
	        for (int k=0;k<c.length;k++)
	        	System.out.println(c[k]);
	         int sum=0;
	        		 t=0;
	         int a[] = new int[c.length] ;
         loop1: for (int k=0;k<c.length;k++)
	          {
	        	
        	   if(c[c.length-1]<0)
    	       {
    	    	 for (int j=1;j<c.length;j++) 
    	    	 {
    	    		sum =sum+c[j];  
    	    	    a[j-1]=c[j];
    	    	 }   
    	    	    break;    	    	
    	       }
        	     if(c[k]<0)
	        	 continue loop1 ;
        	        
	        	 else
	        	 {
	        		    
	        		    if (c[0]>0)
	        			c[0]=0;	  
	        			if(k==c.length-1)
	        	    	{
	        			sum=sum+c[k];
	        			a[t]=c[k];
	        		    break;
	        	    	}
	        			sum=sum+c[k];
	        			a[t]=c[k];
	        	    	t++;
	        		
	        	  }
	       	 }
	         System.out.println("sum ::"+sum);
	         for (int j=0;j<a.length;j++)
	        	 System.out.println(a[j]);
	         
	      }
             
   }
