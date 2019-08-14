package by.htp.tasks.loops;
/*Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. 
 * Человек пытается их
угадать. Программа должна выводить угаданные и неугаданные числа из тех, 
что сгенерировала
программа, а также ошибочные числа пользователя.*/

import java.util.Random;
import java.util.Scanner;
public class LoopsEx31 {
	public static void main(String[] args) {
		Random rnd1 = new Random(System.currentTimeMillis());
		int number1 = 1 + rnd1.nextInt(15 - 1 + 1);
		
		Random rnd2 = new Random(System.currentTimeMillis());
		int number2 = 1 + rnd2.nextInt(15 - 1 + 1);
		
		Random rnd3 = new Random(System.currentTimeMillis());
		int number3 = 1 + rnd3.nextInt(15 - 1 + 1);
		
		Random rnd4 = new Random(System.currentTimeMillis());
		int number4 = 1 + rnd4.nextInt(15 - 1 + 1);
		
		Random rnd5 = new Random(System.currentTimeMillis());
		int number5 = 1 + rnd5.nextInt(15 - 1 + 1);
		
		
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Напишите число от 1 до 15");
		int n1 = myObj1.nextInt();
		
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Напишите число от 1 до 15");
		int n2 = myObj2.nextInt();
		
		Scanner myObj3 = new Scanner(System.in);
		System.out.println("Напишите число от 1 до 15");
		int n3 = myObj3.nextInt();
		
		Scanner myObj4 = new Scanner(System.in);
		System.out.println("Напишите число от 1 до 15");
		int n4 = myObj4.nextInt();
		
		Scanner myObj5 = new Scanner(System.in);
		System.out.println("Напишите число от 1 до 15");
		int n5 = myObj5.nextInt();
		
		
		if (n1 == number1 | n1 == number2 | n1 == number3 | n1 == number4 
				| n1 == number5) {
			System.out.println("Вы угадали число " + n1);
			
		} else {
			System.out.println("Вы не угадали. Неверное число: " + n1);
		}
		
		if (n2 == number1 | n2 == number2 | n2 == number3 | n2 == number4 
				| n2 == number5) {
			System.out.println("Вы угадали число " + n2);
			
		} else {
			System.out.println("Вы не угадали. Неверное число: " + n2);
		}
		
		if (n3 == number1 | n3 == number2 | n3 == number3 | n3 == number4 
				| n3 == number5) {
			System.out.println("Вы угадали число " + n3);
			
		} else {
			System.out.println("Вы не угадали. Неверное число: " + n3);
		}
		
		if (n4 == number1 | n4 == number2 | n4 == number3 | n4 == number4 
				| n4 == number5) {
			System.out.println("Вы угадали число " + n4);
			
		} else {
			System.out.println("Вы не угадали. Неверное число: " + n1);
		}
		
		if (n5 == number1 | n5 == number2 | n5 == number3 | n5 == number4 
				| n5 == number5) {
			System.out.println("Вы угадали число " + n5);
			
		} else {
			System.out.println("Вы не угадали. Неверное число: " + n5);
		}
		
		
	}

}
