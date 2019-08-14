package by.htp.tasks.linear;
/* Найти произведение цифр заданного четырехзначного числа */
public class LinearEx16 {
	public static void main(String[] args) {
		
		int a = 2387;
		int a1 = a / 1000;
		int a2 = (a - a1 * 1000) / 100;
		int a3 = (a - a1 * 1000 - a2 * 100) / 10;
		int a4 = (a - a1 * 1000) - a2 * 100 - a3 * 10;
		
		int m = a1 * a2 * a3 * a4;
		
		System.out.println("Произведение цифр равно " + m);
	}
	
}
