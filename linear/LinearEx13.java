package by.htp.tasks.linear;
/* Заданы координаты трех вершин треугольника 
 * (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.*/
public class LinearEx13 {
	public static void main(String[] args) {
		double x1, x2, x3, y1, y2, y3;
		x1 = 15;
		y1 = 8;
		
		x2 = 43;
		y2 = 10;
		
		x3 = -60;
		y3 = -15;
		
		
		double a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		double b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		double c = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		
		double p = a + b + c;
		double s = Math.sqrt((p / 2) *((p / 2) - a) * ((p / 2) - b) 
				* ((p / 2) - c));
		
		System.out.println("Периметр равен " + p);
		System.out.println("Площадь равна " + s);
		
		
	
		
	}

}
