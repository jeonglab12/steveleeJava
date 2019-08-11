package K_basic;

public class Ehardt11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			문자와 숫자가섞인 문자열을 입력받을때 구별하여출력해라
			input:"c910m6ia 1ho"

			output:
				str : cma ho
				int : 91061
		*/
		String input = "c910m6ia 1ho";
//		String ch = "";
		String str = input.replaceAll("[0-9]", "");
		String intt = input.replaceAll("[a-z]|[\\s]", "");
		
		System.out.println(str);
		System.out.println(intt);
		

	}

}
