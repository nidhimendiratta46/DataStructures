import java.util.ArrayList;
import java.util.Scanner;

//There are two sorted arrays. First one is of size m+n containing only m elements. Another one is of size n and contains n elements. 
//Merge these two arrays into the first array of size m+n such that the output is sorted.

public class MergeArray 
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		int testcases = scan.nextInt();
		ArrayList<Integer> results = new ArrayList<Integer>();
			ArrayList<Integer> marr = new ArrayList<Integer>();
			ArrayList<Integer> narr = new ArrayList<Integer>();
			int m = scan.nextInt();
			int n= scan.nextInt();
			for(int j=0;j<m+n;j++)
			{
				marr.add(scan.nextInt());
				
			}
			for(int j=0;j<n;j++)
			{
				narr.add(scan.nextInt());
				
			}
			int x = scan.nextInt();
			merge(marr,narr,m,n);
		
		for(int i=0;i<m+n ; i++)
		System.out.println(marr.get(i));
	}
	
	private static void merge(ArrayList<Integer> marr , ArrayList<Integer> narr , int m , int n)
	{
		for(int i=0;i<m+n;i++)
		{
		}
	}
}
