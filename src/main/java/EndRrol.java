import java.util.List;

public class EndRrol {
public static void print(List<Player> list) {
		
		System.out.println("\n\n\t\t企画・制作\n\n\t\tyui\n\n\n\t\t監修\n\n\t\t中野さん");
		
		System.out.println("\n\n\t\t[Special Thanks]\n\n");
		
		for(int i = 0;i<list.size() ;i++) {
			Player num =list.get(i);
			System.out.println("\t\t"+num.name);
		}
		
	}
}
