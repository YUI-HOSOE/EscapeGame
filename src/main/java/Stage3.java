import java.util.ArrayList;
import java.util.List;

public class Stage3 {
public void workTree(String name) {
	EskScanner in = new EskScanner();
	
	int direction=0;

	//boolean tolk = true;
	int serect = 0;
	int mess = 0;
	
			

	Text txt = new Text();
	txt.txt(3);
	
			while (true) {
				txt.txt(3,0);
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
							txt.item(3,1,0);
							mess = 2;

						} else {
							System.out.println("\n箱は開かない\n");

						}
					}
					if (mess == 2) {
					txt.item(3, 1, 1);
					}
					//方向2

				} else {
					txt.txt(3,2);
					serect = in.nextInt(2);

					if (serect == 1) {
						txt.serect(2, 1);
						String ans = in.next();
						if (ans.equals(name)) {
							txt.clear(3);
							
							break;
						} else {
							txt.serect(2, 2);
						}
					}

				}

			}

		}

		


}
