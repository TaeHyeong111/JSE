import java.util.scanner;
public class HowMuch{
	public static void main(String[] args){
		scanner sc = new Scanner(System.in);
		System.out.println("얼마에요?");
		int price = sc.nextInt();
		System.out.println(price + "입니다.");
		System.out.println("몇개 드릴까요");
		int howMany = sc.nextInt();
		System.out.println(howMany + "개 주세요");
		int extendedPrice = price * howMany
		System.out.println("비싸요 깍아주세요");
		System.out.println("몇 퍼센트 DC 할까요");
		int dcPercent = sc.nextInt();
		String result = "";
		if (0 <= dcPercent && dcPercent < 10){
				result = a "원 입니다."
		}else(dcPercent > 10){
				result = "안팔아요"
		}
		System.out.println(result);
			}

		}
		
