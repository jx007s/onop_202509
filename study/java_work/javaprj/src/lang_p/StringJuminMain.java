package lang_p;

import java.util.Arrays;

/*
StringJuminMain
950320-1234567
주민번호를 이용하여
성별, 국적(내국인/외국인), 생년월일, 한국나이, 만나이를
출력하세요
1. 1900 년대 내국인 남성
2. 1900 년대 내국인 여성
########################
3. 2000 년대 내국인 남성
4. 2000 년대 내국인 여성
########################
-----------------------------------------------------
5. 1900 년대 외국인 남성
6. 1900 년대 외국인 여성
########################
7. 2000 년대 외국인 남성
8. 2000 년대 외국인 여성
*/		
public class StringJuminMain {

	public static void main(String[] args) {
		String jumin = "951216-1234567";
		
		int j = jumin.charAt(7)-'0';
		System.out.println("여남".charAt(j%2)+"자");
		System.out.println("내외".charAt(j/5)+"국인");
		int [] birth = new int[3];
		
		
		for (int i = 0; i < birth.length; i++) {
			birth[i] = (jumin.charAt(i*2)-'0')*10+jumin.charAt(i*2+1)-'0';
		}
		birth[0] += ((j-1)%4/2+19)*100;
		System.out.println(Arrays.toString(birth));
		
		int [] now = {2025,12,15};
		System.out.println(now[0]-birth[0]+1);
		int age = now[0]-birth[0];
		if((now[1] < birth[1]) || (now[1] == birth[1] && now[2] < birth[2])) {
			age--;
		}
		System.out.println(age);
	}

}
