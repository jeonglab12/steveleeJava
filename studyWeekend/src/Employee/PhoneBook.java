package Employee;

public class PhoneBook {
	
	String name;
	String phone;
	
	public PhoneBook(String t1, String t2) {
		name = t1;
		phone = t2;
	}
	
	public void printPhoneBook() {
		
		System.out.println("name:" + name + " phone:" + phone);
		
	}
}
