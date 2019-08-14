package by.htp.tasks.conditions;
/*Определить правильность даты, введенной с клавиатуры 
 * (число — от 1 до 31, месяц — от 1 до 12). Если введены
некорректные данные, то сообщить об этом.*/
import java.util.Scanner;

public class ConditionsEx23 {
	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Введите число: ");
		int day = myObj1.nextInt();
		
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Введите месяц: ");
		int month = myObj2.nextInt();
		
		if (day > 31 | day < 1 | month < 1 | month > 12) {
			System.out.println("Введены некорректные данные");
		}
		
	}

}
