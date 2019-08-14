package by.htp.tasks.linear;
/*Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с*/

public class LinearEx29 {
	public static void main(String[] args) {
		double a = 20;
		double b = 32;
		double c = 15;
		
		double cos_alpha = (a * a + c * c - b * b) / (2 * a * c);
		double cos_beta = (a * a + b * b - c * c) / (2 * a * b);
		double cos_gamma = (b * b + c * c - a * a) / (2 * c * b);
		
		System.out.println("Углы в радианах: ");
		double alpha = Math.acos(cos_alpha);
		double beta = Math.acos(cos_beta);
		double gamma = Math.acos(cos_gamma);
		System.out.println(alpha + " " + beta + " " + gamma);
		
		System.out.println("Углы в градусах: ");
		double alpha_d = Math.toDegrees(alpha);
		double beta_d = Math.toDegrees(beta);
		double gamma_d = Math.toDegrees(gamma);
		System.out.println(alpha_d + " " + beta_d + " " + gamma_d);

		
	}

}
