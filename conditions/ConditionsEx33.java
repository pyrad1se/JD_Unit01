package by.htp.tasks.conditions;
/*Написать программу, которая по паролю будет определять уровень доступа
 *  сотрудника к секретной информации в
базе данных. Доступ к базе имеют только шесть человек, 
разбитых на три группы по степени доступа. Они имеют
следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 
3331, 7922 — доступны модули баз В, С; 9455, 8997 —
доступен модуль базы С.
*/

import java.util.Scanner;
public class ConditionsEx33 {
	public static void main(String[] args) {
		int p1 = 9583;
		int p2 = 1747;
		
		int p3 = 3331;
		int p4 = 7922;
		
		int p5 = 9455;
		int p6 = 8997;
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Введите пароль: ");
		int pass = myObj.nextInt();
		
		switch(pass) {
		case 9583:
			System.out.println("Доступны модули А В С");
			break;
		case 1747:
			System.out.println("Доступны модули А В С");
			break;
		case 3331:
			System.out.println("Доступны модули В С");
			break;
		case 7922:
			System.out.println("Доступны модули B C");
			break;
		case 9455:
			System.out.println("Доступен модуль C");
			break;
		case 8997:
			System.out.println("Доступен модуль С");
			break;
		}
		
	}

}
