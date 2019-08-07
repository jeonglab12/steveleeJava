package F_basic;

public class Fobjt11 {

	int a;
	String b;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fobjt11 t1 = new Fobjt11();
		
		
		System.out.println(t1.a);
		System.out.println(t1.b);
		
		t1.printint();
		// 문제 (1)번 주석을 풀면 에러가 날지 안날지 생각해보고 주석을 풀어보시오
		
		
		// 문제 (2)번 주석을 풀면 에러가 날지 안날지 생각해보고 주석을 풀어보시오
		// 에러가 나는 부분이 있다면 안나는 부분과 나는 부분이 어떤 차이이고
		// 그 이유가 무엇인지 간단하게 아래 작성해보시오
		
		////////////답변달기/////////////
		// a, b는 인스턴스 필드로 인스턴스 생성시 타입에 맞게 자동으로 초기화되지만 
		// c, d는 printint 메서드의 지역변수로 초기화하지 않으면 컴파일시 오류가 발생한다
	}
	
	public void printint() {
		int c;
		String d;
		
//		System.out.println(c);
//		System.out.println(d);
	}

}
