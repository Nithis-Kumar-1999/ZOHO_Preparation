package com.zohopackage;

public class Reverse_String 
{
	 static void reverseStr(String str)
	{
		int n = str.length();
		char ch [] = str.toCharArray();
		char temp;
		int i,j;
		for(i = 0, j = n-1; i < j;i++, j--)
		{
			temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		System.out.println(ch);
	}
	public static void main(String[] args) 
	{
		String str = "Medplus";
		reverseStr(str);
	}
}
