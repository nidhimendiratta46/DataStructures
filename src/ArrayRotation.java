//Given an array A[] and a number x, check for pair in A[] with sum as x
import java.util.*;
import java.lang.*;
public class ArrayRotation 
{
	public static void main(String args[])
	{
		
		ArrayList<Integer> inputs = new ArrayList(); 
		System.out.println("enter the array \n");
		Scanner input = new Scanner(System.in);
		while (true)  
		{
		      String y=input.next();
		      if (y.equalsIgnoreCase("quit")) {break;}
		      if (y.equals(null)) throw new Error("You entered nothing. Try again.");
		      int stringLength = y.trim().length();
		      if (stringLength == 0) throw new Error("Seems you only entered spaces. Try again.");
		      inputs.add(Integer.parseInt(y));
		 }
		System.out.println("enter the value of x");
		int x = Integer.parseInt(input.next());
		int result = sumPair(inputs,x);
		System.out.println(result);
		
	}
	
	public  static int sumPair(ArrayList<Integer> inputs , int x)
	{
		Collections.sort(inputs);
		System.out.println(inputs);
		int n = inputs.size();
		int count=0;
		int i=0;
		int j=n-1;
		while(i<j)
		{
			if(inputs.get(0)>x)
				return 0;
			else
			{
					 if(inputs.get(i)+inputs.get(j)==x)
					 {
						 i++;
						 j--;
						 count++;
					 }
					 else if(inputs.get(i)+inputs.get(j)<x)
					 {
						i++;
					 }
					 else
					 {
						 j--;
					 }
				 }
			
		}
		return count;
	}
}
/*
 * 1234567
 * i     j
	public abstract class ValComparator implements Comparator 
	{
		  public int compare(Integer int1, Integer int2) 
		  {
		    
		    int intComp = int1.compareTo(int2);
		    return intComp;
		    
		  }
	}*/
	/*public void sortArray (int a[])
	{
		int n = a.length;
		int min = a[0];
		if (n<=1)
		{
			
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				for(int j=1;j<n;j++)
				{
					
				}
			}
		}
	
	}*/

