package by.htp.tasks.linear;
/* Известна длина окружности. 
 * Найти площадь круга, ограниченного этой окружностью
 */
public class LinearEx20 {
	public static void main(String[] args) {
		double l = 200;
		
		double S = Math.PI * Math.pow(((l / 2) * Math.PI), 2);
		
		System.out.println("Площадь круга равна " + S);
	}

}
