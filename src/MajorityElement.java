	import java.util.*;
	import java.lang.*;
	import java.io.*;

public class MajorityElement 
{
		public static void main (String[] args) 
		{
			//code
				Scanner scan = new Scanner(System.in);
				int testcases = scan.nextInt();
				for(int i=0;i<testcases;i++)
				{
				    int size = scan.nextInt();
				    int [] arr = new int[size];
				    for(int j=0;j<size;j++)
				    {
				        arr[i]=scan.nextInt();
				    }
				    majority(arr,size);
				}
			}
			
			public static void majority(int []arr , int size)
			{
			    Arrays.sort(arr);
			    if(size%2==0)
			    {
			        if(arr[0]==arr[size/2] )
			        System.out.println(arr[0]);
			        else if (arr[size/2-1]==arr[size-1])
			        System.out.println(arr[size-1]);
			        else
			        System.out.println("NO Majority Element");
			    }
			    else
			    {
			         if(arr[0]==arr[size/2] )
			        System.out.println(arr[0]);
			        else if (arr[size/2-1]==arr[size-1])
			        System.out.println(arr[size-1]);
			        else
			        System.out.println("NO Majority Element");   
			    }
			}
		}
	

