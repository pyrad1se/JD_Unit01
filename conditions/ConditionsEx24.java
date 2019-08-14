package by.htp.tasks.conditions;

/* Составить программу, определяющую результат гадания на 
 * ромашке — «любит—не любит», взяв за исходное
данное количество лепестков п.*/

public class ConditionsEx24 {
	public static void main(String[] args) {
		int n = 31;
		
		if (n % 2 == 0) {
			System.out.println("Не любит");
		} else {
			System.out.println("Любит");
		}
	}
}
