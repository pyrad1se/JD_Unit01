package by.htp.tasks.loops;
/* С помощью оператора while напишите программу вывода 
 * всех четных чисел в диапазоне от 2 до 100
включительно. */
public class LoopsEx04 {

	public static void main(String[] args) {
		for (int x = 2; x <= 100; x++) {
			while (x % 2 == 0) {
				System.out.println(x);
				x++;
			}
		}
	}

}
