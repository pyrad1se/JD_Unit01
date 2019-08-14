package by.htp.tasks.loops;
/* Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
*/
public class LoopsEx17 {
	public static void main(String[] args) {
		int a = 2;
		int n = 5;
		int result = 1;
		
		for (int i = 1; i < n; i++) {
			result = result * (a + i - 1);
		}
		System.out.println("ответ: " + result);
		
	}

}
