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

class UserMemExcep extends Exception{
	int no;
	String [] msg = {
			"id 에러",
			"pw 에러"
	};
	
	
	
	UserMemExcep(int no) {
		this.no = no;
	}



	public String getMessage() {
		return msg[no];
	};
}

class UserMem5{
	final String id, pw, pname;

	UserMem5(String id, String pw, String pname) {
		this.id = id;
		this.pw = pw;
		this.pname = pname;
	}
	
	
}

public class UserThrowLogin {
	UserMem5 [] mems = {
		new UserMem5("aa", "1111", "이효리"),
		new UserMem5("bb", "2222", "삼효리"),
		new UserMem5("cc", "3333", "사효리"),
		new UserMem5("dd", "4444", "오효리"),
		new UserMem5("ee", "5555", "육효리")
	};
	
	Scanner sc = new Scanner(System.in);
	UserMem5 now = null;
	
	void idChk() throws Exception {
		now = null;
		System.out.print("ID :");
		String pid = sc.nextLine();
		
		for (UserMem5 mem : mems) {
			if(pid.equals(mem.id)) {
				now = mem;
				break;
			}
		}
		
		if(now == null) {
			
			throw new UserMemExcep(0);
		}
	}
	
	void pwChk() throws Exception {
		System.out.print("PW :");
		String pw = sc.nextLine();
		
		if(!pw.equals(now.pw)) {
			
			throw new UserMemExcep(1);
		}
	}
	
	UserThrowLogin() {
		
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
		
		new UserThrowLogin();

	}

}
