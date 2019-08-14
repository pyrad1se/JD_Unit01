package by.htp.tasks.linear;
/* Дана длина ребра куба. Найти площадь грани,
 *  площадь полной поверхности и объем этого куба
 */
public class LinearEx18 {
	public static void main(String[] args) {
		int b = 4;
		int s1 = b * b;
		int s_full = 6 * b * b;
		int s_v = (int) Math.pow(b, 3);
		
		System.out.println("Площадь грани равна " + s1);
		System.out.println("Площадь поверхности равна " + s_full);
		System.out.println("Объем куба равен " + s_v);
		
		
	}

}
