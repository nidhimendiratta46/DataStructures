//Find the index of the element in a given sorted and rotated array such that it has no duplicate elements.If it does not exist print -1.
import java.util.*;
public class PivotRotataedArray {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int testcases = scan.nextInt();
		ArrayList<Integer> results = new ArrayList<Integer>();
		for(int i=0;i<testcases;i++)
		{
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int size = scan.nextInt();
			for(int j=0;j<size;j++)
			{
				arr.add(scan.nextInt());
				
			}
			int x = scan.nextInt();
			int res = findIndex(arr,size ,x);
			results.add(res);
		}
		for(int i=0;i<testcases ; i++)
		System.out.println(results.get(i));
	}
	private static int findIndex(ArrayList<Integer> arr , int n , int x)
	{
		int pivot=0;
		int res=0;
		//find pivot
		for(int i=0;i<n;i++)
		{
			if(arr.get(i)>arr.get(i+1))
				{
					pivot=i;
					break;
				}
		}
		if(arr.get(0)<x)
		{
			res=binarySearch(arr,0,pivot,x);
		}
		else
		{
			res=binarySearch(arr,pivot+1,n-1,x);
		}
		return res;
	}
	
	private static int binarySearch(ArrayList<Integer> arr,int first , int last , int x)
	{
		int middle = (first + last)/2;
		while(first<=last)
		{
			if(arr.get(middle)==x)
			{
				return middle;
			}
			else if(arr.get(middle)<x)
			{
				first = middle+1;
			}
			else
			{
				last = middle-1;
			}
			middle = (first + last)/2;
		}
		return -1;
	
	}
		
}

