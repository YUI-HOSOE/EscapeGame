
public class Text {
	String text = "";

	public void txt(int stage) {

		if (stage == 1) {
			text = "あなたは見知らぬ部屋にいます。";
		} else if (stage == 2) {
			text = "広い部屋にでました。\n真ん中にレースのカバーをかけた丸いテーブルがあり、\n"
					+ "	 \n３人の女の子がお茶会をしています。\n"
					+ "	 \nまた、正面、右、左のそれぞれに扉があります。\n\nどこから調べますか？\n";
		} else {
			text = "小さい部屋に出ました。\n部屋の真ん中に箱が置いてあり、正面に扉がひとつあります。";
		}

		print(text);

	}

	public void clear(int stage) {

		if (stage == 1) {
			text = "扉が開いた\n\n\n***ステージ１脱出成功***\n\n";
		} else if (stage == 2) {
			text = "扉が開いた\n***ステージ２脱出成功***\n\n";
		} else {
			text = "\n\n*****おめでとう！脱出成功！！****\n\n";
		}
		print(text);

	}

	public void txt(int stage, int direction) {

		if (direction == 0) {
			if (stage == 1) {
				text = "\n調べる方向の番号を入力してください\n" +
						"（1）正面には扉、（2）右の壁には時計、（3）左には箱があります。\n\nどこから調べますか？";
			} else if (stage == 2) {
				text = "\n調べる方向の番号を入力してください。\n"
						+ "（１）正面　（２）右　（３）左　（４）女の子に話しかける\n";

			} else {
				text = "どこから調べますか？\n\n（１）箱（２）扉";
			}

		} else if (direction == 1) {
			if (stage == 1) {
				//key がない
				text = "扉には鍵がかかっている";
			} else if (stage == 2) {
				text = "あなたは今、正面の扉の前にいます。\n扉には鍵がかかっている。扉の横にはタッチスクリーンがあり、"
						+ "0～9の数字を入力するよう求められている。\n\n"
						+ "数字を入力しますか？\n\n（１）はい　（２）いいえ";
			} else {
				//mess 

			}
		} else if (direction == 2) {
			if (stage == 1) {
				text = "あなたは今、右の壁のほうにいます。\n時計の短い針は7、長い針は3をさしたまま止まっている";
			} else if (stage == 2) {
				text = "あなたは今、右の扉の前にいます。\n取っ手に手をかけると扉が開いた。\n中には木製の勉強机がおかれており、１枚の紙が置かれている。"
						+ "\n紙には【お茶会のクッキー】と書かれている。";
			} else {
				text = "扉には鍵がかかっている。正しいキーワードを入力すれば扉が開きそうだ。\n\n"
						+ "キーワードを入力しますか？\n\n（１）はい（２）いいえ";
				//serect
			}
		} else if (direction == 3) {
			if (stage == 1) {
				text = "あなたは今、左の壁の前にいます。\n箱は４桁の数字を入力する南京錠により、鍵がかかっている\n数字を入力してください";
			} else {
				//key がない
				text = "あなたは今、左の扉の前にいる。\n扉には鍵がかかっている。鍵があれば開きそうだ";

			}
		} else {
			text = "赤、青、緑のワンピースを着た三人の女の子が楽しそうにお茶会をしています。\n\n"
					+ "（１）挨拶をする（２）尋ねる";
		}
		print(text);
	}

	public void item(int stage, int use) {
		if (stage == 1) {
			//アイテムゲット
			if (use == 0) {
				text = "\n***鍵を手に入れた***\n";
				//アイテム使用
			} else {
				text = "\nあなたは今、正面の扉の前にいます。\n扉には鍵がかかっている\n鍵を使用しますか？\n\n"
						+ "1:はい\n2:いいえ";
			}
		} else if (stage == 2) {
			if (use == 0) {
				text = "\n***鍵とメッセージカードの切れ端を手に入れた***\n";
			} else {
				text = "あなたは今、左の扉の前にいる。\n扉には鍵がかかっている\n鍵を使用しますか？\n\n"
						+ "1:はい\n2:いいえ";
			}

		} else {
			if (use == 0) {
				text = "\n***メッセージカードの切れ端を手に入れた***\n";
			} else {
				text = "\n手に入れたメッセージカードを合わせるとヒントが書かれていた。\n"
						+ "≪扉を開くヒント≫\n\n「Thank you for playing【you】」";
			}

		}
		print(text);
	}

	public void exitOrMiss(int stage, int type) {
		if (stage == 1) {
			text = "番号が違うようだ\n初期位置に戻ります\n\n";
		} else if (stage == 2) {
			if (type == 0) {
				text = "金庫は開かない\n";

			} else if (type == 1) {
				text = "違うようだ\n初期位置に戻ります\n\n";
			} else if (type == 2) {
				text = "初期位置に戻る";
			} else {
				text = "会話に戻る";
			}

		} else {
			if (type == 0) {
				text = "入力をやめる場合は5を入力";

			} else if (type == 1) {
				text = "\n箱は開かない\n";
			} else {
				text = "扉は開かない";
			}
		}

		print(text);
	}

	public void tolk(int serect, int type) {
		if (serect == 0) {
			if (type == 0) {
				text = "あなたが挨拶をすると、３人は順に挨拶を返してくれた。\n\n"
						+ "(赤)「ごきげんよう、自由を求める囚人さん」\n"
						+ "(青)「ごきげんよう、遊びにいらしたお客様」\n"
						+ "(緑)「ごきげんよう、好奇心旺盛な旅人さん」\n";
			} else {
				text = "何について尋ねますか？\n\n"
						+ "（１）正面の扉について（２）右の扉について（３）左の扉について（４）会話をやめる";
			}

		} else if (serect == 1) {
			if (type == 0) {
				text = "(赤)「正面の扉について聞きたいのね」\n"
						+ "(青)「確か６桁の暗証番号を入力すれば開くんじゃなかったかしら」\n"
						+ "(緑)「青い子の言ってることは間違いだわ。正確には４桁の数字だもの」\n"
						+ "(赤)「それで、暗証番号について聞きたいの？」\n\n"
						+ "（１）はい（２）いいえ";
			} else if (type == 1) {
				text = "(赤)「あらそう」";
			} else if (type == 3) {
				text = "誰に尋ねる？\n\n（1）赤（２）青（３）緑（4）ヒントを聞く（５）やめる";
			} else if (type == 4) {
				text = "(赤)「フランス革命の年じゃなかったかしら。自由になりたいあなたにピッタリ。\n"
						+ "そう、暗証番号は\"1789\"だったはず。ああ、青い子の言ってることは嘘よ。\n彼女、うっかりしてるの」\n";
			} else if (type == 5) {
				text = "(青)「もてなすといえば東京オリンピックよね。あなたはお客様なんだし。\n"
						+ "だから暗証番号は\"1964\"。そうだ、緑の子が言ってることは嘘だからね。\n彼女、性格悪いから」\n";
			} else if (type == 6) {
				text = "(緑)「暗証番号は\"1827\"。日本からアメリカへ大冒険したジョン万次郎にちなんでつけたの。\n"
						+ "そうそう、赤の子は本当のこと言ってるわ。\n彼女、しっかり者なの」\n";
			} else {
				text = "（赤）「私たちの中で本当のことを言ってるのは一人だけ」\n"
						+ "（青）「本当のことを言ってる一人を見つけてね」";
			}

		} else if (serect == 2) {
			if (type == 0) {
				text = "テーブルの上にはおいしそうなお菓子がたくさん置かれている\nクッキーの乗った皿を見せてもらいますか？\n\n"
						+ "1:はい\n2:いいえ";
			} else if (type == 1) {
				text = "(赤)「どうぞご自由に」\n"
						+ "__________\n"
						+ "|         |\n"
						+ "| ●      |\n"
						+ "| ●      |\n"
						+ "|      ● |\n"
						+ "| ●      |\n"
						+ "|      ● |\n"
						+ "|         |\n"
						+ "ーーーーー";
			} else {
				text = "(赤)「あそこは確か、メモを残してたはず」\n"
						+ "(青)「金庫のダイアルの開け方ね」\n"
						+ "(緑)「鍵はかけてないから、自由に入ってくださいな」\n";
			}

		} else {
			text = "(赤)「あそこのカギはどこにあったかしら」\n"
					+ "(青)「正面の扉の先の金庫に入れたわ」\n"
					+ "(緑)「ダイアル式の金庫ね。どちらに、何回回すのか、覚えてないわ」\n"
					+ "(赤)「それのヒントは右の扉の中に置いたわね」\n";

		}
		print(text);

	}

	public void others(int stage, int type) {
		if (stage == 2) {
			if (type == 0) {
				text = "数字を入力してください";
			} else if (type == 1) {
				text = "扉が開いた。\n部屋の中には鍵のついた金庫が置かれている。\n"
						+ "金庫のダイアルを右か左に何回か回せば開きそうだ。\n\n"
						+ "ダイアルを回しますか？\n（１）はい（２）いいえ";
			} else {
				text = "（１）左に回す（２）右に回す（３）やめる";
			}
		} else {
			if (type == 0) {
				text = "箱はカプセル化されている。中のモノを取り出すことができるものをすべて選べ。\n\n"
						+ "（１）コンストラクタ（２）セッター（３）ゲッター（４）アクセサ";
			} else {
				text = "入力してください";
			}
		}
		print(text);
	}

	public void print(String text) {
		System.out.println(text);
	}

}
