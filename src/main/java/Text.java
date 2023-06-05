
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
		
		if(stage==1) {
			text="扉が開いた\n\n\n***ステージ１脱出成功***\n\n";
		}else if(stage==2) {
			text="扉が開いた\n***ステージ２脱出成功***\n\n";
		}else {
			text="\n\n*****おめでとう！脱出成功！！****\n\n";
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
				text="あなたは今、左の扉の前にいる。\n扉には鍵がかかっている。鍵があれば開きそうだ";

			}
		} else {
			text = "赤、青、緑のワンピースを着た三人の女の子が楽しそうにお茶会をしています。\n\n"
					+ "（１）挨拶をする（２）尋ねる";
		}
		print(text);
	}
	
	public void item(int stage,int get,int use) {
		if(stage==1) {
			//アイテムゲット
			if(use==0) {
			text="\n***鍵を手に入れた***\n";
			//アイテム使用
			}else {
				text="\nあなたは今、正面の扉の前にいます。\n扉には鍵がかかっている\n鍵を使用しますか？\n\n"
						+ "1:はい\n2:いいえ";
			}
		}else if(stage==2) {
			
		}else {
			if(use==0) {
				text="\n***メッセージカードの切れ端を手に入れた***\n";
			}else {
				text="\n手に入れたメッセージカードを合わせるとヒントが書かれていた。\n"
						+ "≪扉を開くヒント≫\n\n「Thank you for playing【you】」";
			}
			
		}
		print(text);
	}
	
//	public void serect(int direction,int serect) {
//		if(direction==1) {
//			
//		}else if(direction==2) {
//			if(serect==1) {
//				text="入力してください";
//			}else {
//				text="扉は開かない";
//			}
//		}else {
//			
//		}
//		print(text);
//		
//	}
	
	public void print(String text) {
		System.out.println(text);
	}

}
