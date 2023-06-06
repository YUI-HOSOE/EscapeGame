import java.util.ArrayList;
import java.util.List;

public class Stage3 {
	public void workTree(String name) {
		EskScanner in = new EskScanner();

		int direction = 0;

		//boolean tolk = true;
		int serect = 0;
		int mess = 0;

		Text txt = new Text();
		txt.txt(3);

		while (true) {
			txt.txt(3, 0);
			direction = in.nextInt(2);

			//方向１
			if (direction == 1) {
				if (mess != 2) {
					txt.others(3, 0);

					List<String> kadai = new ArrayList<>();
					while (true) {
						txt.exitOrMiss(3, 0);
						String num = in.next(5);
						if (num.equals("5")) {
							break;
						}
						kadai.add(num);
					}
					String str = String.join("", kadai);
					if (str.equals("34") || str.equals("43")) {
						txt.item(3, 0);
						mess = 2;

					} else {
						txt.exitOrMiss(3, 1);

					}
				}
				if (mess == 2) {
					txt.item(3, 1);
				}
				//方向2

			} else {
				txt.txt(3, 2);
				serect = in.nextInt(2);

				if (serect == 1) {
					txt.others(3, 1);
					String ans = in.next();
					if (ans.equals(name)) {
						txt.clear(3);

						break;
					} else {
						txt.exitOrMiss(3, 2);
					}
				}

			}

		}

	}

}
