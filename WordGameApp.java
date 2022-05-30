import java.util.*;

class Player {
	public static Scanner scan = new Scanner(System.in);
	public String name;
	public String word;
	
	public static void getWordFromUser(int num, Player[] pr) {
		
		for(int i=0; i<num; i++) 
		{
			System.out.print("참가자의 이름을 입력하세요>>");
			pr[i].name = scan.next();
		}
		
		boolean	result = false;
		String 	word1 = "아버지", word2;
		System.out.println("시작하는 단어는 " + word1 + "입니다");
		
		while(true) 
		{
			for(int i=0; i<num; i++) {
				System.out.print(pr[i].name+">>");
				word2 = scan.next();
				
				result = checkSuccess(word1, word2);
				if(result) 
				{
					System.out.println(pr[i].name + "이 졌습니다.");
					break;
				}
				
				word1 = word2;
			}
			if(result) 
				break;
		}
		
	}
	public static boolean checkSuccess(String w1, String w2) {
		int Index1 = w1.length()-1;
		int Index2 = w2.length();
		char lastchar = w1.charAt(Index1);
		char firstchar = w2.charAt(0);
		
		if(lastchar == firstchar) return false;
		else return true;
	}
}

public class WordGameApp{
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇 명입니까");
		int num = scanner.nextInt();
		
		Player[] pr = new Player[num];
		for(int i=0; i<num; i++)
			pr[i] = new Player();
		
		Player.getWordFromUser(num, pr);
	}
	public static void main(String[] args) {
		run();
	}
}