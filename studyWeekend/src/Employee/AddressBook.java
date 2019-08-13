package Employee;

public class AddressBook extends PhoneBook{

	String addr1;
	String addr2;
	
	public AddressBook(String t1, String t2) {
		super(t1, t2);
	}
	
	public AddressBook(String t1, String t2, String t3, String t4) {
	
		super(t1, t2);
		
		addr1 = t3;
		addr2 = t4;
	}
	
	public void printAddr() {
		System.out.println("기본주소:" + addr1 + "상세주소:" + addr2);
	}
	
	public void printAll() {
		System.out.println("이름  : " + name + " 전화번호 : " + phone + " 기본주소 : " + addr1 + " 상세주소ּ : " + addr2);
	}
}
