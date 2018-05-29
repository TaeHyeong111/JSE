import java.util.Scanner;
public class Hello{
	public static void main(String[] agrs){
		System.out.println("이름을 입력하세요");
		Scanner scanner = new Scanner();
		String name = scanner.next();
		System.out.print(name);
	}
}