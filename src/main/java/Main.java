import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
	static String name;
	static Player aaaa;
	static LocalDateTime start;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//文章→アクション
		//状態変数
		//アクション変数
		//脱出までにかかった時間による点数付け、ランキング化
		//タイムスタンプ
		//できたランキングはファイルに出力する（実行する際にデータを取得）
		//Filewriterを使う
		//Mapper Json
		//エンドロールの作成
		//ランキング（名前,タイム)←タイムが少ないほど上位（sort）
		//エンドロール()　スペシャルサンクスに名前を足していく

		//初期入力画面
		EskScanner in = new EskScanner();
		System.out.print("名前を入力してください。\n\n名前：");
		name = in.next();
		//	aaaa = new Player(name);

		//タイム測定開始
		start = LocalDateTime.now();

		//ステージ１
		Stage1 one = new Stage1();
		
		one.workTree();

		//ステージ２
		Stage2 two = new Stage2();
		
		two.workTree();

		//ステージ3
		Stage3 three = new Stage3();
		
		three.workTree(name);
		goal();
	}

	public static void goal() {
		LocalDateTime end = LocalDateTime.now();
		long time = ChronoUnit.SECONDS.between(start, end);

		//aaaa.time = (int)time;
		aaaa = new Player(name, (int) time);
		Ranking sum = new Ranking();
		sum.list.add(aaaa);
		sum.sort();
		sum.bord();
		sum.print();

		EndRrol.print(sum.list);
	}

}
