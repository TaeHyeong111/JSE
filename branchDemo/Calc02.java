import java.util.Scanner;
public class Calc02{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Number1");
	int num1 = scan.nextInt();
	System.out.println("Enter OPCODE");
	String op = scan.next();
	System.out.println("Enter Number2");
	int num2 = scan.nextInt();
	
	System.out.println(num1 + op + num2 + "=" );
	
	}
}