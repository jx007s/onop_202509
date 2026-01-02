package thread_p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JOptionPane;



public class Multi4Main {
	
	ArrayList<Multi4Exam> arr;
	
	int now = 0;
	
	void nextGo() {
		
		if(arr.stream().allMatch(ss-> ss.chk)) { // 모든 과목이 종료되었다면
			return;
		}
		
		now++;
		now%=arr.size();
		
		if(arr.get(now).chk) { //now 가 끝났다면
			nextGo();
		}
		
	}
	
	
	class Multi4Exam extends Thread{
		
		LinkedHashMap<String, String> map;
		
		Multi4Timer timer;
		
		String kind;
		
		int no = 0;
		
		int cnt = 0;
		
		boolean chk = false;
		
		
		
		Multi4Exam(int no, Multi4Timer timer, String kind, String...arr) {
			this.no = no;
			this.timer = timer;
			this.kind = kind;
			map = new LinkedHashMap();
			
			for (String string : arr) {
				String [] qq = string.split("_");
				map.put(qq[0], qq[1]);
			}	
		}
		
		
		
		
		
		
		@Override
		public void run() {
			
			
			
			int currQQ = 0;
			
			ArrayList<String> keys = new ArrayList<String>(map.keySet());
			while(true) {
				if(no == now) {// 현재 과목일때
				
					//현재 풀어야 하는 문제
					String rr = JOptionPane.showInputDialog(keys.get(currQQ));
					
					if(timer.chk) {
						break;
					}
					
					if(rr.equals("p")) { //다른 과목으로 넘기기
						nextGo();
					}else {
						System.out.println("rr : "+rr);
						
						
						
						if(rr.equals(map.get(keys.get(currQQ)))) {
							cnt++;
						}
						
						if(++currQQ == keys.size()) {
							break;
						}
						
					}
				}else {
					try {
						sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

			chk = true; //각 과목별 종료
			nextGo();
			
			//System.out.println(kind+" 종료 :"+cnt);	
				
		}

	}

	class Multi4Timer extends Thread{
		
		boolean chk = false;

		@Override
		public void run() {
		
			for (int i = 60; i >0 ; i--) {
				
				if(arr.stream().allMatch(ss-> ss.chk)) { // 모든 과목이 종료되었다면
					break;
				}
				System.out.println(i);
				
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			chk = true;
			
			System.out.println("타이머 종료");
			arr.stream().forEach(ss->System.out.println(ss.kind+":"+ ss.cnt));
		}
	}
	
	
	
	public Multi4Main() {
		
		Multi4Timer timer = new Multi4Timer();
		
		arr = new ArrayList<Multi4Exam>();
		
		arr.add(new Multi4Exam(0, timer,"국어",
				"10월9일_한글날",
				"한글창제_세종대왕",
				"초성갯수_19",
				"모음갯수_21",
				"받침갯수_28"
		));
		
		arr.add( new Multi4Exam(1, timer,"영어",
		"인사_hi"	,"사과_apple","자바_java","알파벳수_26","창원_nc"));
		
		arr.add( new Multi4Exam(2, timer,"수학",
		"3+3_6",
		"10-2_8",
		"10*2_20",
		"10/5_2",
		"17%4_1"
		));
	
		for (Multi4Exam me : arr) {
			me.start();
		}
		timer.start();
	}

	public static void main(String[] args) {
		

		new Multi4Main();

	}

}
