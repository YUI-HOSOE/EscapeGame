import java.util.ArrayList;
import java.util.List;

public class Stage2 {
	public void workTree() {

		EskScanner in = new EskScanner();

		int key = 0;
		int direction = 0;

		int serect = 0;
		int mess = 0;
		int note = 0;
		int anser = 0;
		int door = 0;

		Text txt = new Text();
		txt.txt(2);

		while (true) {
			txt.txt(2, 0);
			direction = in.nextInt(4);

			//方向（1）を調べる
			if (direction == 1) {

				txt.txt(2, 1);
				serect = in.nextInt(2);
				if (serect == 1) {
					txt.others(2, 0);
					anser = in.nextInt(9999);

					//扉の謎解き 金庫の謎解き
					if (anser == 1964) {
						txt.others(2, 1);
						serect = in.nextInt(2);
						//リスト　if文に入れる
						if (serect == 1) {
							List<String> daial = new ArrayList<>();

							while (true) {
								txt.others(2, 2);
								String num = in.next(3);
								if (num.equals("3")) {
									break;
								}
								daial.add(num);
							}
							String str = String.join("", daial);

							if (str.equals("11212")) {
								//メッセージカードの半分と鍵の入った箱入手
								txt.item(2, 0);
								mess = 1;
								key = 1;

							} else {
								txt.exitOrMiss(2, 0);
							}
						}

						//扉の数字を間違った場合
					} else {
						txt.exitOrMiss(2, 1);
					}
				}
				//方向２	
			} else if (direction == 2) {
				txt.txt(2, 2);
				note = 1;

				//方向３
			} else if (direction == 3) {
				//System.out.println("扉には鍵がかかっている");
				if (key == 1) {
					txt.item(2, 1);
					//鍵を使用する場合
					if (in.nextInt(2) == 1) {
						txt.clear(2);

						break;//ここで終了

					} //else{　を省略。鍵を使用しない場合はループに戻る

				} else {
					//鍵を持っていない場合
					txt.txt(2, 3);
				}

				//方向４	
			} else if (direction == 4) {
				txt.txt(2, 4);

				if (in.nextInt(2) == 1) {
					txt.tolk(0, 0);

					txt.exitOrMiss(2, 2);
				} else {
					//４になるまでループ
					while (true) {
						txt.tolk(0, 1);
						serect = in.nextInt(4);

						//正面について	
						if (serect == 1) {
							txt.tolk(1, 0);

							if (in.nextInt(2) == 2) {
								txt.tolk(1, 1);
								continue;

								//論理問題１　
							} else {
								while (true) {
									txt.tolk(1, 3);
									serect = in.nextInt(5);
									if (serect == 1) {
										txt.tolk(1, 4);
									} else if (serect == 2) {
										txt.tolk(1, 5);
									} else if (serect == 3) {
										txt.tolk(1, 6);
										;
									} else if (serect == 4) {
										txt.tolk(1, 7);

									} else {
										txt.exitOrMiss(2, 3);
										break;
									}
								}

							}
							//右の扉について
						} else if (serect == 2) {
							//System.out.println("扉には鍵がかかっている");
							if (note == 1) {
								txt.tolk(2, 0);
								//1を入力
								if (in.nextInt(2) == 1) {
									txt.tolk(2, 1);

								} //else{　を省略。鍵を使用しない場合はループに戻る

							} else {
								//鍵を持っていない場合
								txt.tolk(2, 2);
							}

							//左の扉について
						} else if (serect == 3) {
							txt.tolk(3, 0);
							//会話をやめる	
						} else if (serect == 4) {
							txt.exitOrMiss(2, 2);
							break;
						}

					}
				}
			}
		}

	}

}
