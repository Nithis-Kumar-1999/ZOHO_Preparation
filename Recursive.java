package com.zohopackage;

public class Recursive 
{
	static void recursiveReverse(char[] str, int i)
	{
		int n = str.length;
		if (i == n / 2)
			return;
		swap(str,i,n - i - 1);
		recursiveReverse(str, i + 1);
	}
	static void swap(char []arr, int i, int j)
	{
		char temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void main(String[] args)
	{
		char[] str = "Medplus".toCharArray();
		recursiveReverse(str,0);
		System.out.println(String.valueOf(str));
	}
}
