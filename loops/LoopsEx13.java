package by.htp.tasks.loops;
/*Составить таблицу значений функции y = 5 - x
2
/2 на отрезке [-5; 5] с шагом 0.5.
*/
public class LoopsEx13 {
	public static void main(String[] args) {
		System.out.println("x\t" + "y");
		
		for(double x = -5; x <= 5; x = x += 0.5) {
			double y = 5 - Math.pow(x, 2) / 2;
			
			System.out.print(x + "\t");
			System.out.println(y + " ");
		}
	}

}
