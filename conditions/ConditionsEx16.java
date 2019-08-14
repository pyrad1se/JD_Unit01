package by.htp.tasks.conditions;
/*На плоскости ХОY задана своими координатами точка А. Указать, где она 
 * расположена (на какой оси или в каком
координатном угле)*/

public class ConditionsEx16 {
	public static void main(String[] args) {
		int x = -6;
		int y = 2;
		
		if ((x < 0) &(y < 0)) {
			System.out.println("Третий координатный угол");
		} 
		if ((x < 0) & (y > 0)) {
			System.out.println("Второй координатный угол");
		} 
		if ((x > 0) & (y > 0)) {
			System.out.println("Первый координатный угол");
		}
		if ((x > 0) & (y < 0)) {
			System.out.println("Четвертый координатный угол");
		}
		if (x == 0) {
			System.out.println("Точка на оси y");
		}
		if (y == 0) {
			System.out.println("Точка на оси x");
		}
	}

}
