import java.util.Scanner;
	public class Calc13{
		public static void main(String[] args){
		System.out.println("ù��° ������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("���ҰŸ� 1");
		System.out.println("���Ÿ� 2");
		System.out.println("���ҰŸ� 3");
		System.out.println("�����Ÿ� 4");
		System.out.println("���������� 5");
		int opcode = sc.nextInt();
		System.out.print("�ι��Ԥ��¤� ������ �Է��ϼ���");
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