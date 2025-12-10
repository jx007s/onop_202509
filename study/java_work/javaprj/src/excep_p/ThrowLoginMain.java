package excep_p;

import java.util.Scanner;

public class ThrowLoginMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				
				System.out.print("ID :");
				String pid = sc.nextLine();
				
				if(!pid.equals("aaa")) {
					
					throw new Exception("id 에러");
				}
				
				System.out.print("PW :");
				String pw = sc.nextLine();
				
				if(!pw.equals("1234")) {
					
					throw new Exception("pw 에러");
				}
				
				System.out.println(pid+" 로그인 성공");
				break;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("종료 ---------");

	}

}

/*
ThrowLogin5
5명의 정보로 로그인을 구현하세요

로그인 성공시 이름으로 출력하세요

aa, 1111, 이효리
bb, 2222, 삼효리
cc, 3333, 사효리
dd, 4444, 오효리
ee, 5555, 육효리
 * */
