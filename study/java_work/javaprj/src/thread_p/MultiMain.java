package thread_p;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JOptionPane;

class MultiExam extends Thread{
	
	LinkedHashMap map;
	
	boolean chk = false;
	
	MultiExam() {
		map = new LinkedHashMap();
		map.put("3+3","6");
		map.put("10-2","8");
		map.put("10월9일","한글날");
		map.put("오늘은?","추워");
		map.put("인사","hi");
	}
	
	
	@Override
	public void run() {
		
		int cnt = 0;
		
		for (Object obj : map.entrySet()) {
			Map.Entry me = (Map.Entry)obj; 
			String rr = JOptionPane.showInputDialog(me.getKey());
			
			if(chk) {
				break;
			}
			
			System.out.println("rr : "+rr);
			
			if(rr.equals(me.getValue())) {
				cnt++;
			}
		}
		chk = true;
		
		System.out.println("시험 종료 :"+cnt);
		
	}
}

class MultiTimer extends Thread{
	
	MultiExam exam;
	
	
	
	MultiTimer(MultiExam exam) {
		this.exam = exam;
	}



	@Override
	public void run() {
	
		for (int i = 30; i >0 ; i--) {
			
			if(exam.chk) {
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
		
		exam.chk = true;
		
		//System.out.println("타이머 종료");
	}
}

public class MultiMain {

	public static void main(String[] args) {
		//String rr = JOptionPane.showInputDialog("자니?");
		//System.out.println("rr : "+rr);
		
		MultiExam me = new MultiExam();
		MultiTimer timer = new MultiTimer(me);
		
		me.start();
		timer.start();
	}

}

/*
Multi3Main
국,영,수 3과목을 시험보게 하세요

1. 3과목 한꺼번에
2. p 입력시 다음과목 시험 시작(타이머 전체 1개)
3. p 입력시 다음과목 시험 시작( 과목당 타이머)
 * */




