package F_basic;

public class Fobjt22 extends Fobjt2 {
	
	public Fobjt22(String name, String phonenum, int age) {
		this.name = name;
		this.phonenum = phonenum;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래 생성자를 실행했을 때 상속받은 Fobjt2의 변수들에 값이 들어가도록
		// 생성자 메서드를 코딩하시오
		// 그리고 Fobjt3클래스의 객체에서 3개의 변수값을 이용해 콘솔에 출력해보시오
		
		Fobjt22 ob1 = new Fobjt22("steveleejava","01055557777",38);
		
		System.out.println("name=" + ob1.name + ", phonenum=" + ob1.phonenum + ", age=" + ob1.age);
		
	}

}
