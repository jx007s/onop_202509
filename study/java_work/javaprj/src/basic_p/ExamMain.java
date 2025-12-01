package basic_p;

public class ExamMain {

	public static void main(String[] args) {
		String name = "케데헌";
		int kor = 87, eng = 82, mat = 81;
		int tot = kor + eng + mat;
		double avg = (double)(int)((double)tot/3*100)/100;
		char grade = 	avg >= 90 ? '수' :
						avg >= 80 ? '우' :
						avg >= 70 ? '미' :
						avg >= 60 ? '양' :'가';
						
		
		System.out.println("이름:"+name);
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("총점:"+tot);
		System.out.println("평균:"+avg);
		System.out.println("등급:"+grade);
		

	}

}

