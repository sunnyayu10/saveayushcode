package com.testprogrammes;

public class ForLooping {
	public static void main(String args[]) {
	for(int i=8;i<=10;i++)
	{
		for(int j=0;j<=5;j++)
		{
			System.out.println("Child Nested For Loop"+j);
			
		}
		
		System.out.println("The Parent For loop - "+i);
	}
	
	//Nested For loop pyramid program
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("@");
		}
		
		System.out.println();
	}
}
}
