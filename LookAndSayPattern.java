package com.zohopackage;
public class LookAndSayPattern 
{
    public static void main(String[] args) 
    {
    	int n = 5;
    	System.out.println(1);
    	String s = "1";
    	int i = 1;
    	while(i < n)
    	{
    		String str = "";
    		int count = 1;
    		char a = s.charAt(0);
    		for(int j = 1;j < s.length();j++)
    		{
    			if(s.charAt(j) != s.charAt(j-1))
    			{
    				System.out.print(count + "" + a);
    				str += "" + count + "" + a;
    				a = s.charAt(j);
    				count  = 1;
    			}
    			else
    			{
    				count++;
    			}
    		}
    		System.out.println(count + "" + a);
    		str += "" + count + "" + a;
    		s = str;
    		i++;
      }
    }
}

