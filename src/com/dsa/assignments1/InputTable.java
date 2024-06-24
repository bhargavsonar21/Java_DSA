package com.dsa.assignments1;


import java.util.Scanner;

public class InputTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Valid Number: ");
		int num = sc.nextInt();
		int result = 0;
		for(int i = 1;i<=10;i++)
		{
			result = num*i;
			System.out.println("2"+"X"+i+"= "+result);
		}
		
		sc.close();
	}

}
