package by.htp.tasks.loops;
/* ??? Последовательность аn строится так: а1 = 1, an =6+ аn-1 , 
 * для каждого n >1 Составьте программу
нахождения произведения первых 10 членов этой последовательности.*/
public class LoopsEx12 {
	public static void main(String[] args) {
		double a = 1;
		double result = 1;
		for(int i = 1; i <= 10; i++) {
			result *= a;
			a += 6;
		}
		System.out.println("Произведение равно " + result);
	}
	
}
