package by.htp.tasks.loops;
// Требуется определить факториал числа, которое ввел пользователь

import java.util.Scanner;
public class LoopsEx25 {
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Введите число ... ");
		int num = myObj.nextInt();
		
		int result = 1;
		
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		System.out.println("Факториал равен: " + result);
	}

}
