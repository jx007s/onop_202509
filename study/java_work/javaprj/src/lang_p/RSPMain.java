package lang_p;

import java.util.Scanner;

public class RSPMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] title="가위,바위,보".split(",");
		
		String[][] res = {			//user
				{"비김","패","승"},	//가위
				{"승","비김","패"},	//바위
				{"패","승","비김"}		//보
	//com		가위    바위   보
		};
		
		System.out.println("[[[추억의 게임 가위바위보]]]");
		while(true) {
			System.out.print("0.가위 1.바위, 2.보 , 3.종료 입력:");
			int no = sc.nextInt();
			
			if(no==3) {
				break;
			}else if(no>3) {
				System.out.println("예상외 범위");
				continue;
			}
			
			int com = (int)(Math.random()*3);
			
			System.out.println("user:"+title[no]);
			System.out.println("com :"+title[com]);
			System.out.println("결과 :"+res[no][com]);
		}
		System.out.println("게임종료");

	}

}
