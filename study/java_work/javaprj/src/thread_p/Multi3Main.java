package thread_p;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JOptionPane;

class Multi3Exam extends Thread{
	
	LinkedHashMap<String, String> map;
	
	boolean chk = false;
	
	Multi3Exam() {
		map = new LinkedHashMap();
		map.put("10월9일","한글날");
		map.put("한글창제","세종대왕");
		map.put("초성갯수?","19");
		map.put("모음갯수?","21");
		map.put("받침갯수?","28");
		
		map.put("인사","hi");
		map.put("사과","apple");
		map.put("자바","java");
		map.put("알파벳갯수","26");
		map.put("창원","nc");
		
		map.put("3+3","6");
		map.put("10-2","8");
		map.put("10*2","20");
		map.put("10/5","2");
		map.put("17%4","1");
		
	}
	
	
	@Override
	public void run() {
		
		int cnt = 0;
		
		for (Map.Entry<String,String> me : map.entrySet()) {

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

class Multi3Timer extends Thread{
	
	Multi3Exam exam;
	
	
	
	Multi3Timer(Multi3Exam exam) {
		this.exam = exam;
	}



	@Override
	public void run() {
	
		for (int i = 60; i >0 ; i--) {
			
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


public class Multi3Main {

	public static void main(String[] args) {
		Multi3Exam me = new Multi3Exam();
		Multi3Timer timer = new Multi3Timer(me);
		
		me.start();
		timer.start();

	}

}
