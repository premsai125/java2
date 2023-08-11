package com.edu;

import java.util.Scanner;

public class discount2 {
	public static void main(String args[])
	{
		String pname;
		float pprice;
		float amount;

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the product name");
		pname=sc.nextLine();
		 
		System.out.println("enter the product price");
		
		pprice=sc.nextFloat();
		float discount;
		{
		if(pprice>0 && pprice<=1000)
		{
			discount=pprice*0.02f;
		}
		else if(pprice>1000 && pprice<=3000)
		{
			discount=pprice*0.1f;
		}
		
		
		else
		{
			discount=0.15f;
		}
		amount=pprice-discount;
		System.out.println("the product name"+pname);
		System.out.println("the product price"+pprice);
		System.out.println(" the discount is"+discount);
		System.out.println("the amount to be paid"+amount);
		
	}
	}
}
