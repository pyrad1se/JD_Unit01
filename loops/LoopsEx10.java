package by.htp.tasks.loops;
/*???? Составить программу нахождения произведения 
 * квадратов первых двухсот чисел.
*/
public class LoopsEx10 {
	public static void main(String[] args) {
		int mult = 1;
		for (int i = 1; i <= 200; ) {
			int sq =  i * i;
			mult *= sq * sq;
			i++;
			System.out.println(mult);
		}
		System.out.println(mult);
	}
}
