import java.util.Scanner;
public class Calc10{
	public static void main(String[] args){
	System.out.println("정수를 두번 입력하여 연산하세요");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	String op = sc.next();
	int num2 = sc.nextInt();

	int num3 = num1 + num2;
	int num4 = num1 - num2;
	int num5 = num1 * num2;
	int num6 = num1 / num2;

	if(op == "+"){
	System.out.print(num1 + "+" + num2 + "=" + num3);
	}
	else if(op == "-"){
		System.out.print(num1 + "-" + num2 + "=" + num4);
	}
	else if(op == "*") {
		System.out.print(num1 + "*" + num2 + "=" + num5);
	}
	else if(op == "/"){
		System.out.print(num1 + "/" + num2 + "=" + num6);
	}
	else {
		System.out.print("옳바른 연산자를 입력하세요");
	}
	}
}