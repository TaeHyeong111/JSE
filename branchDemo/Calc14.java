import java.util.Scanner;
	public class Calc14{
		public static void main(String[] args){

		System.out.println("Enter Number1");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("������ �Է��ϼ���");
		String st = sc.next();
		System.out.println("Enter Number2");
		int num2 = sc.nextInt();
		int num3 = 0;

		if(st.equals("+")){
			num3 = num1 + num2;
		}else if(st.equals("-")){
			num3 = num1 - num2;
		}else if(st.equals("*")){
			num3 = num1 * num2;
		}else if(st.equals("/")){
			num3 = num1 / num2;
		}else{
			num3 = num1 % num2;
		}
		System.out.println(num1 + st + num2 + "=" + num3);
	}
}

	