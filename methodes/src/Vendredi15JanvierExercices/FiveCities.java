package Vendredi15JanvierExercices;

import java.util.Scanner;

public class FiveCities 
{
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		
		int [] cities = new int [5];
		for (int i = 0; i < cities.length; i++)
		{
			if(i == 0)
			{
				cities[i] = 0;
			}
			else
			{
				cities[i] = sc.nextInt();
			}
		}
		for(int i = 0; i < cities.length; i++)
		{
			if(i == 0)
			{
				cities[i] = 0;
			}
			else
			{
				cities[i] = cities[i-1];
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
		System.out.print(Math.abs(cities [1] - cities[0]) + " ");	
		System.out.print(Math.abs(cities [1] - cities[1]) + " ");	
		System.out.print(Math.abs(cities [1] - cities[2]) + " ");	
		System.out.print(Math.abs(cities [1] - cities[3]) + " ");	
		System.out.print(Math.abs(cities [1] - cities[4]) + " ");
		System.out.print(Math.abs(cities [1] - cities[5]) + " ");	
		}
	}
	
}
		
			



