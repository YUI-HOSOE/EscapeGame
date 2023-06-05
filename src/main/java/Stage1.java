
public class Stage1 {

	public static void workTree() {
		EskScanner in = new EskScanner();

		System.out.println("あなたは見知らぬ部屋にいます。\n");
		//Scanner in = new Scanner(System.in);
		int direction;
		int key = 0;

		//break;に行くまで繰り返す
		while (true) {

			System.out.println("\n調べる方向の番号を入力してください\n" +
					"（1）正面には扉、（2）右の壁には時計、（3）左には箱があります。\n\nどこから調べますか？");

			direction = in.nextInt(3);

			//方向（1）を調べる
			if (direction == 1) {

				//鍵を持っている場合
				if (key == 1) {
					System.out.println("\nあなたは今、正面の扉の前にいます。\n扉には鍵がかかっている\n鍵を使用しますか？\n\n"
							+ "1:はい\n2:いいえ");
					//鍵を使用する場合
					if (in.nextInt(2) == 1) {
						System.out.println("扉が開いた\n\n\n***ステージ１脱出成功***\n\n");
						break;//ここで終了
					} //else{　を省略。鍵を使用しない場合はループに戻る

				} else {
					//鍵を持っていない場合
					System.out.println("扉には鍵がかかっている");
				}

				//方向（2）を調べる
			} else if (direction == 2) {
				System.out.println("あなたは今、右の壁のほうにいます。\n時計の短い針は7、長い針は3をさしたまま止まっている");

				//方向（3）を調べる
			} else if (direction == 3) {
				System.out.println("あなたは今、左の壁の前にいます。\n箱は４桁の数字を入力する南京錠により、鍵がかかっている");
				System.out.println("数字を入力してください");

				//正しい数字を入力した場合
				if (in.nextInt(9999) == 1915) {
					System.out.println("\n***鍵を手に入れた***\n");
					key = 1;
					//間違った番号を入力した場合
				} else {
					System.out.println("番号が違うようだ\n初期位置に戻ります\n\n");
				}

				//部屋選択の際、選択肢にない番号を入力した場合
			} else {
				System.out.println("1～3の数字を入れてください");
			}

		}
	}
}
