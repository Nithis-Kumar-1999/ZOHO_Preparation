package com.zohopackage;

public class MissingNumber
{
		public static int missingNum(int[] num, int n)
		{
			int sum = ((n + 1) * (n + 2)) / 2;
			for (int i = 0; i < n;i++)
			{
				sum -= num[i];
			}
			return sum;
		}
		public static void main(String[] args)
		{
			int[] arr = { 1, 2, 3, 5,7,4 };
			int N = arr.length;
			System.out.println("The Missing Number is : "+missingNum(arr, N));
		}
}
