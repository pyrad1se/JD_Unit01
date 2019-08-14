package by.htp.tasks.loops;
// Вычислить : 1+2+4+8+...+ 2 в 10 степени
public class LoopsEx15 {
	public static void main(String[] args) {
		int i, a, s;
		a = 1;
		s = 1;
		for (i = 1; i <= 10; i++) {
			s = s + a;
			a *= 2;
		}
		System.out.println("Ответ:" + s);
	}

}
