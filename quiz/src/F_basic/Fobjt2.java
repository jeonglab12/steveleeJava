package F_basic;

public class Fobjt2 {
	
	String name;
	String phonenum;
	int age;
	
	// default
	public Fobjt2() {
	}
	
	// String
	public Fobjt2(String name) {
		this.name = name;
	}
	
	// String, String
	public Fobjt2(String name, String phonenum) {
		this.name = name;
		this.phonenum = phonenum;
	}

	// String, String, int
	public Fobjt2(String name, String phonenum, int age) {
		this.name = name;
		this.phonenum = phonenum;
		this.age = age;
	}

	// String, int
	public Fobjt2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
        return "name=" + name + ", phonenum=" + phonenum + ", age=" + age;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자를 6가지 종류로 만들고 아래 주석들을 풀었을 때 동작하도록 하시오.
		
		Fobjt2 ob1 = new Fobjt2();
		Fobjt2 ob2 = new Fobjt2("steveleejava","01055557777");
		Fobjt2 ob3 = new Fobjt2("steveleejava");
		Fobjt2 ob4 = new Fobjt2("steveleejava","01055557777",38);
		Fobjt2 ob5 = new Fobjt2("steveleejava",38);
		
		System.out.println("없음 : " + ob1.toString());
		System.out.println("이름 + 전화번호 : " + ob2.toString());
		System.out.println("이름 : " + ob3.toString());
		System.out.println("이름 + 전화번호 + 나이 : " + ob4.toString());
		System.out.println("이름 + 나이 : " + ob5.toString());
	}
}
