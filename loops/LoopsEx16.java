package by.htp.tasks.loops;
// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

public class LoopsEx16 {
	public static void main(String[] args) {
		double a = 1;
		double sum = 1;
		double result = 1;
		for (int i = 1; i <= 10; i++) {
			a += 1;
			sum += a;
			result *= sum;
		}
		System.out.println("Результат равен: " + result);
	}

}
