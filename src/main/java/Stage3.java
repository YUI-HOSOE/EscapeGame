import java.util.ArrayList;
import java.util.List;

public class Stage3 {
public void workTree(String name) {
	EskScanner in = new EskScanner();
	int key = 0;
	int direction=0;

	//boolean tolk = true;
	int serect = 0;
	int mess = 0;
	int note = 0;
	int anser = 0;

	//key初期化
			

			System.out.println("小さい部屋に出ました。\n部屋の真ん中に箱が置いてあり、正面に扉がひとつあります。\n");
			while (true) {
				System.out.println("どこから調べますか？\n\n（１）箱（２）扉");
				direction = in.nextInt(2);

				//方向１
				if (direction == 1) {
					if (mess != 2) {
						System.out.println("箱はカプセル化されている。中のモノを取り出すことができるものをすべて選べ。\n\n"
								+ "（１）コンストラクタ（２）セッター（３）ゲッター（４）アクセサ");

						List<String> kadai = new ArrayList<>();
						while (true) {
							System.out.println("入力をやめる場合は5を入力");
							String num = in.next(5);
							if (num.equals("5")) {
								break;
							}
							kadai.add(num);
						}
						String str = String.join("", kadai);
						if (str.equals("34") || str.equals("43")) {
							System.out.println("\n***メッセージカードの切れ端を手に入れた***\n");
							mess = 2;

						} else {
							System.out.println("\n箱は開かない\n");

						}
					}
					if (mess == 2) {
						System.out.println("\n手に入れたメッセージカードを合わせるとヒントが書かれていた。\n"
								+ "≪扉を開くヒント≫\n\n「Thank you for playing【you】」");
					}
					//方向2

				} else {
					System.out.println("扉には鍵がかかっている。正しいキーワードを入力すれば扉が開きそうだ。\n\n"
							+ "キーワードを入力しますか？\n\n（１）はい（２）いいえ");
					serect = in.nextInt(2);

					if (serect == 1) {
						System.out.println("入力してください");
						String ans = in.next();
						if (ans.equals(name)) {
							System.out.println("\n\n*****おめでとう！脱出成功！！****\n\n");
							
							break;
						} else {
							System.out.println("扉は開かない");
						}
					}

				}

			}

		}

		


}
