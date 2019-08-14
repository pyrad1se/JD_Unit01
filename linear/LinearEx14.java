package by.htp.tasks.linear;
/* Вычислить длину окружности и площадь
круга одного и того же заданного радиуса R*/
public class LinearEx14 {
	public static void main(String[] args) {
		
		double r = 5;
		
		double l = 2 * Math.PI * r;
		double s = Math.PI * Math.pow(r, 2);
		
		System.out.println("Длина окружности равна " + l);
		System.out.println("Площадь круга равна " + s);
	}

}
