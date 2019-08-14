package by.htp.tasks.loops;
/*Написать программу, переводящую римские цифры в арабские.*/

import java.util.Scanner;

public class LoopsEx30 {
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Введите римскую цифру... ");
		char ch = myObj.next().charAt(0);
		
		switch(ch) {
		case 'i':
			System.out.println("1");
			break;
			
		case 'V':
			System.out.println("5");
			break;
			
		case 'X':
			System.out.println("10");
			break;
			
		case 'L':
			System.out.println("50");
			break;
			
		case 'C':
			System.out.println("100");
			break;
			
		case 'D':
			System.out.println("500");
			break;
			
		case 'M':
			System.out.println("1000");
			break;
		}
		
		
	}
}
