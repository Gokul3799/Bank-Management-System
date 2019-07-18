package bdms;
	import java.util.*;
	public class rotation{  
	public static void main(String args[]){  
	int a[] ={1,3,5,7,9};
	Scanner s =new Scanner (System.in);
	int k;
	k=s.nextInt();
	int i;
	//int n=k.length
	   // for(i=0;i<n;i++)
	    {
	      rotate(a,k); 
	      printarray(a);
	    }
	}
	    static void rotate(int a[],int r)
	{
	  int n1=a.length;
	  reverse(a,0,r-1);
	  reverse(a,r,n1-1);
	  reverse(a,0,n1-1);
	}
	static void reverse(int a[],int s,int l)
	{
	    int temp;
	    while(s<l)
	    {
	        temp=a[s];
	        a[s]=a[l];
	        a[l]=temp;
	        s++;
	        l--;
	    }
	}
	static void printarray(int a[])
	{
	    int i=0;
	    int n2=a.length;
	    for(i=0;i<n2;i++)
	    {
	        System.out.print(a[i]);
	    }
	}

	}


