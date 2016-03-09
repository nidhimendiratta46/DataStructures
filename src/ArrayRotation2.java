import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//pair sum as x using hashmap
public class ArrayRotation2 
{
	public static void main(String args[])
	{
		System.out.println("enter the range \n");
		int start;
		int finish ;
		Scanner scan = new Scanner(System.in);
		finish = scan.nextInt();
		int [] m = new int[finish];
		Arrays.fill(m, 0);
		System.out.println("m : "+m);
		//m[0,0,0,0,0,0,0]
		ArrayList<Integer> inputs = new ArrayList(); 
		Scanner input = new Scanner(System.in);
		System.out.println("enter the array");
		for(int i=0;i<finish;i++)
		{
			inputs.add(input.nextInt());
		}
		System.out.println("enter the value of x");
		int x = Integer.parseInt(input.next());
		int result = sumPair(inputs,x,m);
		System.out.println(result);
	}
	
	public static int sumPair(ArrayList<Integer> arr , int x,int[] m)
	{
		int count=0;
		int n= arr.size();
		for(int i=0;i<n;i++)
		{
			if(m[x-arr.get(i)]==1)
				count++;
			m[arr.get(i)-1]=1;
		}
		return count;
		
	}
}
