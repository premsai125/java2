package com.edu;

import java.util.Scanner;

public class Rectangle {
	public static void main(String args[])
	{
		int length,breadth,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		length=sc.nextInt();
		System.out.println("enter breadth");
		breadth=sc.nextInt();
		
		area=length*breadth;
		System.out.println("the area of rectangle of length="+length+" breadth="+breadth+" is "+area);
		}

}
