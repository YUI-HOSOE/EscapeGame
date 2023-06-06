
public class Stage1 {

	public void workTree() {
		EskScanner in = new EskScanner();

		//Scanner in = new Scanner(System.in);
		int direction;

		int key = 0;
		Text txt = new Text();
		txt.txt(1);

		//break;に行くまで繰り返す
		while (true) {

			txt.txt(1, 0);

			direction = in.nextInt(3);

			//方向（1）を調べる
			if (direction == 1) {

				//鍵を持っている場合
				if (key == 1) {
					txt.item(1, 1);
					//鍵を使用する場合
					if (in.nextInt(2) == 1) {
						txt.clear(1);
						break;//ここで終了
					} //else{　を省略。鍵を使用しない場合はループに戻る

				} else {
					//鍵を持っていない場合
					txt.txt(1, 1);
				}

				//方向（2）を調べる
			} else if (direction == 2) {
				txt.txt(1, 2);

				//方向（3）を調べる
			} else if (direction == 3) {
				txt.txt(1, 3);

				//正しい数字を入力した場合
				if (in.nextInt(9999) == 1915) {
					txt.item(1, 0);
					key = 1;
					//間違った番号を入力した場合
				} else {
					txt.exitOrMiss(1, 0);
				}

			}

		}
	}
}
