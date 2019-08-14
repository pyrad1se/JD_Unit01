package by.htp.tasks.loops;
/* Напишите программу, где пользователь вводит 
 * любое целое положительное число. А программа
суммирует все числа от 1 до введенного пользователем числа.*/

import java.util.Scanner;
public class LoopsEx06 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Введите целое положительное число: ");
		int num = myObj.nextInt();
		
		int sum = 0;
		int i = 1;
		while (i < num) {
			sum += num;
			i++;
		}
		System.out.println(sum);
	}

}
