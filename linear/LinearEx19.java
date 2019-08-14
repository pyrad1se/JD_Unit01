package by.htp.tasks.linear;
/*Дана сторона равностороннего треугольника. 
 * Найти площадь этого треугольника, его высоту, радиусы вписанной
и описанной окружностей.*/
public class LinearEx19 {
	public static void main(String[] args) {
		double a = 92;
		
		double S = Math.pow(a, 2) *(Math.sqrt(3) / 4);
		double h = a * (Math.sqrt(3) / 2);
		double r1 = a / (2 * Math.sqrt(3));
		double r2 = a * (Math.sqrt(3) / 3);
		
		System.out.println("Площадь равна: " + S + "\n" + 
		"Высота равна: " + h + "\n" + "Радиусы равны: " + r1 + " и " + r2);
	}

}
