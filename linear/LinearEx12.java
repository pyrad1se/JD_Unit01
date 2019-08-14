package by.htp.tasks.linear;
/*Вычислить расстояние между двумя 
 * точками с данными координатами (х1, у1)и (x2, у2)
 */
public class LinearEx12 {
	public static void main(String[] args) {
		double x1, y1, x2, y2;
		x1 = 19;
		y1 = 5;
		x2 = -4;
		y2 = 16;
		
		double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("Расстояние между двумя точками равно " + d);
	}
}
