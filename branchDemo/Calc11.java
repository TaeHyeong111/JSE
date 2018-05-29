import java.util.Scanner;
public class Calc11{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("정수를 입력하세요");
	int num1 = sc.nextInt();
	System.out.println("if plus then Enter 1");
	System.out.println("if minus then Enter 2");
	System.out.println("if Multi then Enter 3");
	System.out.println("if Divid then Enter 4");
	System.out.println("if mudular then Enter 5");
	int opcode = sc.nextInt();
	System.out.println("두번째 정수를 입력하세요");
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
	else if(opcode == 3){
		num3 = num1 * num2;
		st = "*";
	}
	else if(opcode == 4){
		num3 = num1 / num2;
		st = "/";
	}
	else {
		num3 = num1 % num2;
		st = "%";
	}
	System.out.println(num1 + st + num2 + "=" + num3 );
}
}