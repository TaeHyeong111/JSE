import java.util.Scanner;
public class Calc03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���");
		int num1 = sc.nextInt();
		System.out.println("+, -, *, /, % �� �����ڸ� �Է��ϼ���");
		String op = sc.next();
		System.out.println("�ι�° ������ �Է��ϼ���");
		int num2 = sc.nextInt();
		int num3 = 0;
		String result = "";
		switch(op){
			case "+" : num3 = num1 + num2; break;
			case "-" : num3 = num1 - num2; break;
			case "*" : num3 = num1 * num2; break;
			case "/" : num3 = num1 / num2; break;
			case "%" : num3 = num1 % num2; break;
			default : result = "ERROR"; break;
		}
		if(!result.equals("ERROR")){
			result = num1 + op + num2 + "=" + num3;
		}
		System.out.print(result);
		
	}
}