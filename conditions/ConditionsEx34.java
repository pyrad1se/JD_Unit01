package by.htp.tasks.conditions;
/*Составить программу, реализующую эпизод применения 
 * компьютера в книжном магазине. Компьютер
запрашивает стоимость книг, сумму денег, внесенную покупателем; 
если сдачи не требуется, печатает на экране
«спасибо»; если денег внесено больше, чем необходимо, то печатает 
«возьмите сдачу» и указывает сумму сдачи; если
денег недостаточно, то печатает сообщение об этом и
 указывает размер недостающей суммы.
*/

import java.util.Scanner;

public class ConditionsEx34 {
	public static void main(String[] args) {
		
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Введите стоимость: ");
		int price = myObj1.nextInt();
		
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Введите сумму денег: ");
		int sum = myObj2.nextInt();
		
		if (sum == price) {
			System.out.println("спасибо");
		} else if (sum > price) {
			System.out.println("Возьмите сдачу: " + (sum - price));
		} else if (sum < price) {
			System.out.println("Не хватает: " + (price - sum));
		}
		
		
	}
}
