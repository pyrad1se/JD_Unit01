package by.htp.tasks.conditions;
/*Найти max{min(a, b), min(c, d)}.*/

public class ConditionsEx27 {
	public static void main(String[] args) {
		int a, b, c, d;
		a = 2;
		b = 34;
		c = 19;
		d = 46;
		
		int result = Math.max(Math.min(a, b), Math.min(c, d));
		
		System.out.println("max равно " + result);
		
	}

}
