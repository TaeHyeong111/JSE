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
			result = "���";
		}else if(user1.equals(a1) && user2.equals(a3) 
			|| user1.equals(a2) && user2.equals(a1) 
			|| user1.equals(a3) && user2.equals(a2)){
			result = "User1 �¸�";
		}else if(user1.equals(a3) && user2.equals(a1)
		||  user1.equals(a1) && user2.equals(a2)
		||  user1.equals(a2) && user2.equals(a3)){
			result = "User1 �й�";
		}else{
			System.out.print("�Է�ĭ�� rock, paper, scissors �� �Ѵܾ �Է��ϼ���.");
		}
		System.out.print(result);

	}
}