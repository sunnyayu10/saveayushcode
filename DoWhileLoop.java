package com.testprogrammes;

public class DoWhileLoop {
	public static void main(String args[])
	{
		
		int i=0;
		
		while(i<3)
		{
			System.out.println("The value of i is->" +i);
			i++;
		}
		
		int j =0;
		
		do
		{
			System.out.println("The value of J" +j);
			j++;
		}
		while(j<10);
		
		
		
		do
		{
			System.out.println("I am breaking your machine");
		}
		
		while(false);
	}

}

