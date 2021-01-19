package Vendredi15JanvierExercices;

import java.util.Scanner;

public class MagicSquares 
{
	
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
			
		
		int A= sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
		int B= sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
		int C= sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
		int D= sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
		
		boolean Somme = (A==B);
		boolean Sommedeux = (C==D);
		
		if(Somme = Sommedeux)
			System.out.println("magic");
		else
			System.out.println("not magic");
		
		sc.close();		
		
	}
	
}
	


