package com.dsa.assignments1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a valit Year: ");
		int year = sc.nextInt();
		
		boolean is_leap_year = false;
		if(year % 4 == 0)
		{
			is_leap_year = true;
			
			if(year % 100 ==0)
			{
				is_leap_year = true;
				if(year % 400 == 0)
				{
					is_leap_year = true;
				}
				else
				{
					is_leap_year = false;
				}
			}
			
		}
		else
		{
			is_leap_year = false;
			
		}
		if(!is_leap_year)
		{
			System.out.println(year+" :is Not a Leap Year.");
		}
		else
		{
			System.out.println(year+" :Year is a Leap Year.");
		}
		sc.close();
	}

}
/*2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 
 * 2036, 2040, 2044, and 2048*/
