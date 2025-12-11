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

class ThrowMem{
	final String id, pw, pname;

	ThrowMem(String id, String pw, String pname) {
		this.id = id;
		this.pw = pw;
		this.pname = pname;
	}
	
	
}

public class ThrowLogin5 {

	public static void main(String[] args) {
		ThrowMem [] mems = {
			new ThrowMem("aa", "1111", "이효리"),
			new ThrowMem("bb", "2222", "삼효리"),
			new ThrowMem("cc", "3333", "사효리"),
			new ThrowMem("dd", "4444", "오효리"),
			new ThrowMem("ee", "5555", "육효리")
		};
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				
				ThrowMem now = null;
				
				System.out.print("ID :");
				String pid = sc.nextLine();
				
				for (ThrowMem mem : mems) {
					if(pid.equals(mem.id)) {
						now = mem;
						break;
					}
				}
				
				if(now == null) {
					
					throw new Exception("id 에러");
				}
				
				System.out.print("PW :");
				String pw = sc.nextLine();
				
				if(!pw.equals(now.pw)) {
					
					throw new Exception("pw 에러");
				}
				
				
				System.out.println(now.pname+" 로그인 성공");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		sc.close();
		System.out.println("종료 ---------");
		

	}

}
