import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("inPut Choose rock, paper, scissors");
		String a1 = "rock";
		String a2 = "paper";
		String a3 = "scissors";

		String user1 = sc.next();

		System.out.println("inPut Choose rock, paper, scissors");
		
		String user2 = sc.next();

		String result = "";

		if(user1.equals(user2)){
			result = "비김";
		}else if(user1.equals(a1) && user2.equals(a3) 
			|| user1.equals(a2) && user2.equals(a1) 
			|| user1.equals(a3) && user2.equals(a2)){
			result = "User1 승리";
		}else if(user1.equals(a3) && user2.equals(a1)
		||  user1.equals(a1) && user2.equals(a2)
		||  user1.equals(a2) && user2.equals(a3)){
			result = "User1 패배";
		}else{
			System.out.print("입력칸에 rock, paper, scissors 중 한단어를 입력하세요.");
		}
		System.out.print(result);

	}
}