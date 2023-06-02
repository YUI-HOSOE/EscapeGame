import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ranking {
	//name,time sort
	List<Player> list;
	
	public Ranking() {
		list =  new ArrayList<>();
		read();
	}
	
	public void bord() {

		try {
			FileWriter fm = new FileWriter("data.txt");

			for (Player nam : list) {

				fm.write(nam.name);
				fm.write(",");
				fm.write(String.valueOf(nam.time));
				fm.write("\n");

			}

			fm.close();

		} catch (Exception e) {

		}

	}
	
	public void read() {
		try {
			File F =new File("data.txt");
			BufferedReader br =new BufferedReader(new FileReader(F));
			
			String input = br.readLine();
			String[] str;
			
			while(input!=null) {
				str=input.split(",");
				String name =str[0];
				int time=Integer.parseInt(str[1]);
				list.add(new Player(name, time));
				
				input = br.readLine();
			}
			
			
		}catch(Exception e) {
			System.out.println("ファイルが見つかりません");
		}
		
		sort();
	
		
	}
	
	public void sort() {
		Comparator<Player> com =new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				// TODO 自動生成されたメソッド・スタブ
				return o1.time-o2.time;
			}
		};
		
		
		
		Collections.sort(list,com);
	}
	
	public void print() {
		
		for(int i = 0;i<list.size() ;i++) {
			Player num =list.get(i);
			System.out.println(String.format("%d位\t%8s\tタイム：%d分%d秒",i+1,num.name,num.time/60,num.time%60));
		}
		
	}
}
