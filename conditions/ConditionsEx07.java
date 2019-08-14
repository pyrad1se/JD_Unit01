package by.htp.tasks.conditions;
/* Составить программу нахождения модуля выражения
 *  a*x*x + b*x + c при заданных значениях a, b, c и х
 */
public class ConditionsEx07 {
	public static void main(String[] args) {
		int a = -4;
		int b = 80;
		int c = 500;
		int x = -999;
		
		int result1 = a * x * x + b * x + c;
		int result2 = Math.abs(result1);
		
		System.out.println("Модуль выражения равен " + result2);
	}

}
