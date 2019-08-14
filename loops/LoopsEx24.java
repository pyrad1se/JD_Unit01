package by.htp.tasks.loops;
/*Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. 
 * Преобразовать
его в другое число, цифры которого будут следовать в обратном порядке по с
равнению с введенным
числом.*/

import java.util.Scanner;
public class LoopsEx24 {
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Введите число >");
		double x = myObj.nextDouble();
		
		double sum = 0;
		
		while (x > 0) {
			if (x / 10 % 2 == 0) {
				sum += x;
			}
			x++;
		}
		System.out.println("Сумма четных чисел равна" + sum);
		
	}

}
