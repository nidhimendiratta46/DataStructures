//Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times. 
//Find the number in O(n) time & constant space.
import java.util.*;
public class OddNumberOfElement 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int testcases = scan.nextInt();
		for(int i=0;i<testcases;i++)
		{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int size = scan.nextInt();
		for(int j=0;j<size;j++)
		{
			arr.add(scan.nextInt());
		}
		int res = oddElement(arr,size);
		System.out.println(res);
		}
	}

	private static int oddElement(ArrayList<Integer> arr, int size) 
	{
		int res = arr.get(0);
		for(int i=1;i<size;i++)
		{
			res=res^arr.get(i);
		}
		return res;
	}
}
