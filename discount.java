package com.edu;
import java.util.Scanner;
public class discount {
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
		if(pprice>0 && pprice<=10000)
		{
			discount=pprice*0.05f;
		}
		else if(pprice>10000 && pprice<=20000)
		{
			discount=pprice*0.1f;
		}
		else if(pprice>20000 && pprice<=350000)
		{
			discount=pprice*0.15f;
			
		}
		else
		{
			discount=0.2f;
		}
		amount=pprice-discount;
		System.out.println("the product name"+pname);
		System.out.println("the product price"+pprice);
		System.out.println(" the discount is"+discount);
		System.out.println("the amount to be paid"+amount);
		
	}
	}
}

