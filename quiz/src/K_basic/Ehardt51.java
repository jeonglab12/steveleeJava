package K_basic;

public class Ehardt51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		124 나라의 숫자
		문제 설명
		124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

		124 나라에는 자연수만 존재합니다.
		124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
		예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

		10진법	124 나라	10진법	124 나라
		1		1		6		14
		2		2		7		21
		3		4		8		22
		4		11		9		24
		5		12		10		41
		자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 
		return 하도록 solution 함수를 완성해 주세요.*/
		
		//아래 콘솔 출력시 41이 나와야 함
		System.out.println(solution(20));

	}
	
	public static String solution(int n) {
	    String answer = "";
	    //코딩해야할 부분
	    int mod = 0;
	    
	    while (n>0) {
			mod = n % 3; // 나머지
			n = n / 3; // 몫
			
//			if (n > 0) {
//				System.out.println("n : " + n);
//			}

			if (mod == 0) {
				n -= 1;
				mod = 4;

//				System.out.println("(mod = 0) n : " + n);
			}
			
//			System.out.println("mod : " + mod);
//			System.out.println("answer : " + answer);
			
			answer = mod + answer;
		}
	    
	    return answer;
	}

}
