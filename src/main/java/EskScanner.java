import java.util.Scanner;

public class EskScanner {

	Scanner in;

	//nextIntのクラスをつくって、特定の数字以外入力できないようにする
	public EskScanner() {
		in = new Scanner(System.in);

	}

	public int nextInt(int num) {

		int som = -1;

		while (true) {
			try {
				som = in.nextInt();
			} catch (Exception e) {
				in.next();
			}

			if (som > 0 && som <= num) {
				return som;

			} else {
				System.err.println("数値が不正です。\nもう一度入力してください。");
			}
		}

	}

	public String next() {

		return in.next();
	}

	public String next(int num) {

		//上のメソッドをStringに変換して返す

		return String.valueOf(nextInt(num));
	}

}
