package by.htp.tasks.loops;
/*  С помощью оператора while напишите программу определения 
 * суммы всех нечетных чисел в
диапазоне от 1 до 99 включительно.
*/
public class LoopsEx05 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i % 2 != 0 | i < 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
