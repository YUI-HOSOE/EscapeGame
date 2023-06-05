import java.util.ArrayList;
import java.util.List;

public class Stage2 {
	public static void workTree(){
		//借り物
		//int key = 0;
		//Scanner in = new Scanner(System.in);
		//int direction;
		//借り物
		EskScanner in = new EskScanner();

		//key初期化
		int key = 0;
		int direction=0;

		//boolean tolk = true;
		int serect = 0;
		int mess = 0;
		int note = 0;
		int anser = 0;

		System.out.println("広い部屋にでました。\n真ん中にレースのカバーをかけた丸いテーブルがあり、"
				+ "\n３人の女の子がお茶会をしています。"
				+ "\nまた、正面、右、左のそれぞれに扉があります。\n\nどこから調べますか？\n");

		while (true) {
			System.out.println("\n調べる方向の番号を入力してください。\n"
					+ "（１）正面　（２）右　（３）左　（４）女の子に話しかける\n");
			direction = in.nextInt(4);

			//方向（1）を調べる
			if (direction == 1) {
				System.out.println("あなたは今、正面の扉の前にいます。\n扉には鍵がかかっている。扉の横にはタッチスクリーンがあり、"
						+ "0～9の数字を入力するよう求められている。\n\n"
						+ "数字を入力しますか？\n\n（１）はい　（２）いいえ");
				serect = in.nextInt(2);
				if (serect == 1) {
					System.out.println("数字を入力してください");
					anser = in.nextInt(9999);

					//扉の謎解き 金庫の謎解き
					if (anser == 1964) {
						System.out.println("扉が開いた。\n部屋の中には鍵のついた金庫が置かれている。\n"
								+ "金庫のダイアルを右か左に何回か回せば開きそうだ。\n\n"
								+ "ダイアルを回しますか？\n（１）はい（２）いいえ");
						serect = in.nextInt(2);
						//リスト　if文に入れる
						if (serect == 1) {
							List<String> daial = new ArrayList<>();

							while (true) {
								System.out.println("（１）左に回す（２）右に回す（３）やめる");
								String num = in.next(3);
								if (num.equals("3")) {
									break;
								}
								daial.add(num);
							}
							String str = String.join("", daial);

							if (str.equals("11212")) {
								//メッセージカードの半分と鍵の入った箱入手
								System.out.println("\n***鍵とメッセージカードの切れ端を手に入れた***\n");
								mess = 1;
								key = 1;

							} else {
								System.out.println("金庫は開かない\n");
							}
						}

						//扉の数字を間違った場合
					} else {
						System.out.println("違うようだ\n初期位置に戻ります\n\n");
					}
				}
				//方向２	
			} else if (direction == 2) {
				System.out.println("あなたは今、右の扉の前にいます。\n取っ手に手をかけると扉が開いた。\n中には木製の勉強机がおかれており、１枚の紙が置かれている。"
						+ "\n紙には【お茶会のクッキー】と書かれている。");
				note = 1;

				//方向３
			} else if (direction == 3) {
				//System.out.println("扉には鍵がかかっている");
				if (key == 1) {
					System.out.println("あなたは今、左の扉の前にいる。\n扉には鍵がかかっている\n鍵を使用しますか？\n\n"
							+ "1:はい\n2:いいえ");
					//鍵を使用する場合
					if (in.nextInt(2) == 1) {
						System.out.println("扉が開いた\n***ステージ２脱出成功***\n\n");

						
						break;//ここで終了

					} //else{　を省略。鍵を使用しない場合はループに戻る

				} else {
					//鍵を持っていない場合
					System.out.println("あなたは今、左の扉の前にいる。\n扉には鍵がかかっている。鍵があれば開きそうだ");
				}

				//方向４	
			} else if (direction == 4) {
				System.out.println("赤、青、緑のワンピースを着た三人の女の子が楽しそうにお茶会をしています。\n\n"
						+ "（１）挨拶をする（２）尋ねる");

				if (in.nextInt(2) == 1) {
					System.out.println("あなたが挨拶をすると、３人は順に挨拶を返してくれた。\n\n"
							+ "(赤)「ごきげんよう、自由を求める囚人さん」\n"
							+ "(青)「ごきげんよう、遊びにいらしたお客様」\n"
							+ "(緑)「ごきげんよう、好奇心旺盛な旅人さん」\n");
					
					System.out.println("初期位置に戻る");
				} else {
					//４になるまでループ
					while (true) {
						//System.out.println("初期位置に戻る");

						System.out.println("何について尋ねますか？\n\n"
								+ "（１）正面の扉について（２）右の扉について（３）左の扉について（４）会話をやめる");
						serect = in.nextInt(4);

						//正面について	
						if (serect == 1) {
							System.out.println("(赤)「正面の扉について聞きたいのね」\n"
									+ "(青)「確か６桁の暗証番号を入力すれば開くんじゃなかったかしら」\n"
									+ "(緑)「青い子の言ってることは間違いだわ。正確には４桁の数字だもの」\n"
									+ "(赤)「それで、暗証番号について聞きたいの？」\n\n"
									+ "（１）はい（２）いいえ");

							if (in.nextInt(2) == 2) {
								System.out.println("(赤)「あらそう」");
								continue;

								//論理問題１　
							} else {
								while (true) {
									System.out.println("誰に尋ねる？\n\n（1）赤（２）青（３）緑（4）ヒントを聞く（５）やめる");
									serect = in.nextInt(5);
									if (serect == 1) {
										System.out.println("(赤)「フランス革命の年じゃなかったかしら。自由になりたいあなたにピッタリ。\n"
												+ "そう、暗証番号は\"1789\"だったはず。ああ、青い子の言ってることは嘘よ。\n彼女、うっかりしてるの」\n");
									} else if (serect == 2) {
										System.out.println("(青)「もてなすといえば東京オリンピックよね。あなたはお客様なんだし。\n"
												+ "だから暗証番号は\"1964\"。そうだ、緑の子が言ってることは嘘だからね。\n彼女、性格悪いから」\n");
									} else if (serect == 3) {
										System.out.println("(緑)「暗証番号は\"1827\"。日本からアメリカへ大冒険したジョン万次郎にちなんでつけたの。\n"
												+ "そうそう、赤の子は本当のこと言ってるわ。\n彼女、しっかり者なの」\n");
									}else if(serect == 4) {
										System.out.println("（赤）「私たちの中で本当のことを言ってるのは一人だけ」\n"
												+ "（青）「本当のことを言ってる一人を見つけてね」");
									
									} else {
										System.out.println("会話に戻る");
										break;
									}
								}

							}
							//右の扉について
						} else if (serect == 2) {
							//System.out.println("扉には鍵がかかっている");
							if (note == 1) {
								System.out.println("テーブルの上にはおいしそうなお菓子がたくさん置かれている\nクッキーの乗った皿を見せてもらいますか？\n\n"
										+ "1:はい\n2:いいえ");
								//鍵を使用する場合
								if (in.nextInt(2) == 1) {
									System.out.println("(赤)「どうぞご自由に」\n");
									System.out.println("__________");
									System.out.println("|         |");
									System.out.println("| ●      |");
									System.out.println("| ●      |");
									System.out.println("|      ● |");
									System.out.println("| ●      |");
									System.out.println("|      ● |");
									System.out.println("|         |");
									System.out.println("ーーーーー");

								} //else{　を省略。鍵を使用しない場合はループに戻る

							} else {
								//鍵を持っていない場合
								System.out.println("(赤)「あそこは確か、メモを残してたはず」\n"
										+ "(青)「金庫のダイアルの開け方ね」\n"
										+ "(緑)「鍵はかけてないから、自由に入ってくださいな」\n");
							}

							//左の扉について
						} else if (serect == 3) {
							System.out.println("(赤)「あそこのカギはどこにあったかしら」\n"
									+ "(青)「正面の扉の先の金庫に入れたわ」\n"
									+ "(緑)「ダイアル式の金庫ね。どちらに、何回回すのか、覚えてないわ」\n"
									+ "(赤)「それのヒントは右の扉の中に置いたわね」\n");
							//会話をやめる	
						} else if (serect == 4) {
							System.out.println("初期位置に戻る");
							break;
						}

					}
				}
			}
		}
		
	}

}
