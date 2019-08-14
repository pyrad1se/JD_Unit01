package by.htp.tasks.conditions;
/*Написать программу нахождения суммы большего и меньшего из трех чисел.*/

public class ConditionsEx26 {
	public static void main(String[] args) {
		int a = 666;
		int b = 28;
		int c = -7;
		int sum = 0;
		if (a > b & a > c) {
			sum = sum + a;
		}
		else if (b > a & b > c) {
			sum = sum + b;
		}
		else if (c > a & c > b) {
			sum = sum + c;
		}
		
		if (a < b & a < c) {
			sum = sum + a;
		}
		else if (b < a & b < c) {
			sum = sum + b;
		}
		else if (c < a & c < b) {
			sum = sum + c;
		}
	
		
		System.out.println("Сумма равна: " + sum);
			
	}

}
