package com.maven333.maven22samp;
import java.util.ArrayList;
import java.util.*;

public class sample {
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static String con(String fname, String lname)
	{
		return fname+" "+lname;
	}
	public static  ArrayList<Integer> adde(int[] arr)
	
	{
		ArrayList<Integer> objlist=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			objlist.add(arr[i]);
		}
		return objlist;
		
	}
	public static List<Integer> addr(int [] arr)
	{
		List<Integer> lis=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			lis.add(arr[i]);
		}
		return lis;
	}
	
  
}
