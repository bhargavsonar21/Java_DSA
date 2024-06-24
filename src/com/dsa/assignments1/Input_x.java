package com.dsa.assignments1;
import java.util.Scanner;
public class Input_x {
public static void main(String[] args) {
	String ch;
	Scanner sc = new Scanner(System.in);
	do
	{
		
		System.out.print("Enter X,x or Y,y: ");
		ch = sc.next();
		
		
	}
	while(ch.equals("Y") || ch.equals("y"));
	sc.close();
}
}