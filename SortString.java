package Day9112022;

import java.util.Arrays;

public class SortString {
	public static void main(String[]arsg)
	{
		String sarray[]={"dog","cat","animal","basket","fox","elephant"};
		System.out.println("String array elements before sorting");
		for(String i:sarray)
		{
			System.out.print(i+" , ");
		}
		System.out.println("String array elements after sorting");
		Arrays.sort(sarray);
		System.out.println(Arrays.toString(sarray));
	}

}
