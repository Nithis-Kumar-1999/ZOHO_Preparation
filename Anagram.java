package com.zohopackage;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first String");
		String str = scn.nextLine();
		System.out.println("Enter the second String");
		String str2 = scn.nextLine();
		scn.close();
		str = str.toLowerCase();
		str2 = str2.toLowerCase();
		if(str.length() == str2.length())
		{
			char ch [] = str.toCharArray();
			char ch2 [] = str2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch2);
			boolean result = Arrays.equals(ch,ch2);
			if(result)
			{
				System.out.println("The Strings " + str + " and " + str2 + " are anagram ");
			}
			else
			{
				System.out.println("The Strings " + str + " and " + str2 + " are not anagram ");
			}
		}
		else
		{
			System.out.println("The Strings " + str + " and " + str2 + " are not anagram ");
		}
	}
}
