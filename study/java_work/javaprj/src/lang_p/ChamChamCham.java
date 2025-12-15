package lang_p;

import java.util.Scanner;

public class ChamChamCham {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] title=",왼쪽,오른쪽".split(",");
		
		System.out.println("[[[추억의 게임 참참참]]]");
		while(true) {
			System.out.print("0.종료 1.왼쪽, 2.오른쪽 입력:");
			int no = sc.nextInt();
			
			if(no==0) {
				break;
			}else if(no>2) {
				System.out.println("예상외 범위");
				continue;
			}
			
			int com = (int)(Math.random()*2+1);
			String res = "승";
			if(com==no) {
				res = "패";
			}
			System.out.println("user:"+title[no]);
			System.out.println("com :"+title[com]);
			System.out.println("결과 :"+res);
		}
		System.out.println("게임종료");

	}

}

//RSPMain
//가위바위보 구현하세요
