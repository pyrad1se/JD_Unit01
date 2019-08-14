package by.htp.tasks.loops;
// Найти сумму квадратов первых ста чисел.
public class LoopsEx09 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; ) {
			sum += i * i;
			i++;
		}
		System.out.println(sum);
	}
}
