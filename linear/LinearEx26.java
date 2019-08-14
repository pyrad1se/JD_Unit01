package by.htp.tasks.linear;
/* Найти площадь треугольника, две стороны которого равны а и b, 
 * а угол между этими сторонами у.
 */

public class LinearEx26 {
	public static void main(String[] args) {
		double a = 9;
		double b = 10;
		double y = 45;
		
		double S = (a * b * Math.sin(y)) / 2;
		
		System.out.println("Площадь треугольника равна " + S);
	}

}
