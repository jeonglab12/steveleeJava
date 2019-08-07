package F_basic;

import C_basic.Aiftest5;

public class Fobjt12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제:이전에 Aiftest5문제를 잘 풀었다면 아래코드를 실행했을 시 3+6=9라고 출력될 것이다.
		//아래 주석을 풀었을 때도 같은 결과가 콘솔에 출력되도록 프로그래밍 해보시오.
		
		Aiftest5 aif = new Aiftest5();
		
		aif.calculate(3, "+", 6);
		
		aif.calculate(3, 6, "+"); 
		
	}

}
