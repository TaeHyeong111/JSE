import java.util.Scanner;
public class Hq{
	public static void main(String[] args){
		System.out.println("너 이름이 뭐니?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.print(name);
	}
}