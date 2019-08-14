package by.htp.tasks.linear;
/* Найти площадь кольца, внутренний радиус которого равен r, 
 * а внешний — R (R> r)
 */
public class LinearEx23 {
	public static void main(String[] args) {
		double r = 88;
		double R = 120;
		
		double s = Math.PI * Math.pow(r, 2);
		double S = Math.PI * Math.pow(R, 2);
		
		double ring = S - s;
		
		System.out.println("Площадь кольца равна " + ring);	
	}
}
