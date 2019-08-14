package by.htp.tasks.loops;
/*Для каждого натурального числа в промежутке от m до n вывести все делители, 
 * кроме единицы и
самого числа. m и n вводятся с клавиатуры.*/

import java.util.Scanner;
public class LoopsEx27 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Введите первое число: ");
		int number1 = myObj.nextInt();
		
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Введите второе число: ");
		int number2 = myObj.nextInt();
		
		for (int i = number1; i < number2; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					System.out.println(i);
				}
			}
		}
		
	}

}
