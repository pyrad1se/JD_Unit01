package by.htp.tasks.linear;
/* Составить программу для вычисления пути, пройденного лодкой, 
 * если ее скорость в стоячей воде v км/ч, скорость
течения реки v1 км/ч, время движения по озеру t1 ч, 
а против течения реки — t2 ч.*/
public class LinearEx31 {
	public static void main(String[] args) {
		double v = 95;
		double v1 = 10;
		double t1 = 2;
		double t2 = 0.2;
		
		double s = (v - v1) * t2 + v * t1;
		
		System.out.println("Путь равен " + s);
	}

}
