package by.htp.tasks.conditions;
/*Подсчитать количество отрицательных среди чисел а, b, с*/
public class ConditionsEx18 {
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 7;
		int c = -230;
		
		int sum = 0;
		
		if (a < 0) {
			sum++;
		}
		
		if (b < 0) {
			sum++;
		}
		
		if (c < 0) {
			sum++;
		}
		
		System.out.println("Количество равно " + sum);
	}

}
