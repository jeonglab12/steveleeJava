package K_basic;

import java.util.Calendar;

public class Ehardt31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			현우는 성인이되어 회사에입사했다.
			하지만 들어간기업이 하필 할일없는 중소기업이라
			퇴근시간까지 놀다가 퇴근시간에 퇴근하는것이 일상화가되어버렸다..
			현우는 심심한지라 좀더효율적으로놀기위해
			현재부터 퇴근시간까지 남은시간을 알려주는 계산기를 만들어
			계산적으로놀고싶었다 우리가현우를 도와주자!!
			(참고로 현우의퇴근시간은 17시30분이다)
			input: 현재시간
			output: 남은시간 : hh:mm:ss
		*/
		// 문제를 풀기위해서 아래 2개의 클래스를 활용해보세요.

		// 현재시간
		Calendar currentTime = Calendar.getInstance();

		// 퇴근시간
		Calendar endTime = Calendar.getInstance();
		
		endTime.set(Calendar.HOUR_OF_DAY, 18);
		endTime.set(Calendar.MINUTE, 30);
		endTime.set(Calendar.SECOND, 00);

		long diff = endTime.getTimeInMillis() - currentTime.getTimeInMillis();

		long hh = diff / (60 * 60 * 1000);
		long mm = diff / (60 * 1000);
		long ss = (diff / 1000) - (mm * 60);

		if (diff > 0) {
			System.out.println("퇴근시간 까지 남은시간 : " + hh + "시간 " + mm + "분 " + ss + "초");
		} else {
			System.out.println("퇴근시간이 지났습니다 당장 퇴근하세요");
		}
	}
	
	
	

}
