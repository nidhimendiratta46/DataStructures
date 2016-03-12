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
				    ArrayList<Integer> arr = new ArrayList(); 
				    for(int j=0;j<size;j++)
				    {
				        arr.add(scan.nextInt());
				    }
				    
				   int res = majority(arr,size);
				   if(res!=-1)
				   System.out.println(res);
				   else
					   System.out.println("NONE");   
				}
			}
			
			public  static int majority(ArrayList<Integer> arr , int size)
			{
				int currMaxCount=0;
				int maxCount=0;
				int element = arr.get(0);
				Collections.sort(arr);
				for(int i : arr)
				{
					if(arr.get(i)==arr.get(i+1))
					{
						currMaxCount++;
					}
					else
						currMaxCount=0;
					
					if(currMaxCount>maxCount)
					{
						maxCount=currMaxCount;
						element = arr.get(i);
					}
				}
				if( maxCount > size/2)
				return element;
				else
					return -1;
				
			}
		}
	

