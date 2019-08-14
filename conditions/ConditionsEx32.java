package by.htp.tasks.conditions;
/* Написать программу, которая по заданным трем числам определяет, 
 * является ли сумма каких-либо двух из них
положительной.*/
public class ConditionsEx32 {
	public static void main(String[] args) {
		int a = -32;
		int b = 20;
		int c = -8;
		
		if (((a + b) | (a + c) | (b + c)) > 0) {
			System.out.println("ДА");
		} else {
			System.out.println("НЕТ");
		}
	}

}
