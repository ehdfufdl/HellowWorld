package co.edu.except;

public class RectPrint {
	public static void main(String[] args) {
		int cnt = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", cnt);
				cnt = cnt + 5;
			}
			cnt = cnt - 24;
			System.out.println();
		}				
	}
}
