//Given an array of size n-1 and given that there are numbers from 1-n with one missing, the missing number was to be found.
import java.util.*;
public class MissingNumber {

	//sum method
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int testcases =  scan.nextInt();
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		for(int i=0;i<testcases ;i++)
		{
			int n= scan.nextInt();
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			for(int j=0;j<n-1;j++)
			{
				arrayList.add(scan.nextInt());
			}
			int res = missingNumber(arrayList,n-1);
			resultList.add(res);
		}
		for(int i=0;i<testcases;i++)
		{
			System.out.print(resultList.get(i) + " ");
		}
	}
	
	private static int missingNumber(ArrayList<Integer> arr , int n)
	{
		int res;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum = sum + arr.get(i);
		}
		res = (n+1)*(n+2)/2 -sum;
		return res;
	}

}
