package by.htp.tasks.loops;
/*Составить программу нахождения 
 * разности кубов первых двухсот чисел
 */
public class LoopsEx11 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; ) {
			sum -= i * i * i;
			i++;
		}
		System.out.println(sum);
	}
}
