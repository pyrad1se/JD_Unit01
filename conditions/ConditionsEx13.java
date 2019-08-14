package by.htp.tasks.conditions;
/*Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, 
 * определяющий, которая из точек находится ближе к
началу координат. */
public class ConditionsEx13 {
	public static void main(String[] args) {
		int x1, y1, x2, y2;
		x1 = -8;
		y1 = 15;
		
		x2 = -14;
		y2 = 6;
		
		x1 = Math.abs(x1);
		x2 = Math.abs(x2);
		y1 = Math.abs(y1);
		y2 = Math.abs(y2);
		
		int d1 = x1 + y1;
		int d2 = x2 + y2;
		
		if (d1 < d2) {
			System.out.println("Точка А ближе");
		} else {
			System.out.println("Точка B ближе");
		}
		
	}

}
