package excep_p;

import java.util.Scanner;

/*
ThrowLogin5
5명의 정보로 로그인을 구현하세요

로그인 성공시 이름으로 출력하세요

aa, 1111, 이효리
bb, 2222, 삼효리
cc, 3333, 사효리
dd, 4444, 오효리
ee, 5555, 육효리

*/

class ThrowMem5{
	final String id, pw, pname;

	ThrowMem5(String id, String pw, String pname) {
		this.id = id;
		this.pw = pw;
		this.pname = pname;
	}
	
	
}

public class ReThrowLogin6 {
	ThrowMem5 [] mems = {
		new ThrowMem5("aa", "1111", "이효리"),
		new ThrowMem5("bb", "2222", "삼효리"),
		new ThrowMem5("cc", "3333", "사효리"),
		new ThrowMem5("dd", "4444", "오효리"),
		new ThrowMem5("ee", "5555", "육효리")
	};
	
	Scanner sc = new Scanner(System.in);
	ThrowMem5 now = null;
	
	void idChk() throws Exception {
		now = null;
		System.out.print("ID :");
		String pid = sc.nextLine();
		
		for (ThrowMem5 mem : mems) {
			if(pid.equals(mem.id)) {
				now = mem;
				break;
			}
		}
		
		if(now == null) {
			
			throw new Exception("id 에러");
		}
	}
	
	void pwChk() throws Exception {
		System.out.print("PW :");
		String pw = sc.nextLine();
		
		if(!pw.equals(now.pw)) {
			
			throw new Exception("pw 에러");
		}
	}
	
	ReThrowLogin6() {
		
		while(true) {
			try {
				
				idChk();
				pwChk();
				
				System.out.println(now.pname+" 로그인 성공");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		sc.close();
		System.out.println("종료 ---------");
	}
	

	public static void main(String[] args) {
		
		new ReThrowLogin6();

	}

}
