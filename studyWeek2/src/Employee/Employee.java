package Employee;

public class Employee extends AddressBook {

	String department;
	String position;
	int age;
	String phone1;
	String phone2;
	String phone3;
	static String companyName;
	
	public Employee(String t1, String t2) {
		super(t1, t2);
		
		String[] phone = t2.split("-");
		
		phone1 = phone[0];
		phone2 = phone[1];
		phone3 = phone[2];
	}
	
	public void printPhone() {
		System.out.println("phone1 : " + phone1 + " phone2 : " + phone2 + " phone3 : " + phone3);
	}
	
}
