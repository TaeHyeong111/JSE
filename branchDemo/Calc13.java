import java.util.Scanner;
	public class Calc13{
		public static void main(String[] args){
		System.out.println("첫번째 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("더할거면 1");
		System.out.println("뺄거면 2");
		System.out.println("곱할거면 3");
		System.out.println("나눌거면 4");
		System.out.println("나머지값은 5");
		int opcode = sc.nextInt();
		System.out.print("두번ㅤㅉㅒㅤ 정수를 입력하세요");
		int num2 = sc.nextInt();
		int num3 = 0;
		String st = null;

		if(opcode == 1){
			num3 = num1 + num2;
			st = "+";
		}
		else if(opcode == 2){
			num3 = num1 - num2;
			st = "-";
		}
		else if (opcode == 3){
			num3 = num1 * num2;
			st = "*";
		}
		else if (opcode == 4){
			num3 = num1 / num2;
			st = "/";
		}
		else{
			num3 = num1 % num2;
			st = "%";
		}
			System.out.print(num1 + st + num2 + "=" + num3);
		}
	}