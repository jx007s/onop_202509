package text_p;

import java.text.DecimalFormat;

public class DecimalFormatMain {

	public static void main(String[] args) {
		double [] ddArr = {
			123456,-123456,
			123.456789,-123.456789, 
			.9876, -.9876,
			.4321 , -.4321, 0
		};
		
		String [] ppArr= {
				"0", "#", "00000","#####",
				"####0000", //"0000####"//"#0#0#0#0"
				".00",".##",".00000",".#####",
				"0,00","#,##","#,##0.00",
				"#@##", "#?##","0@00",
				"#,##0원","#,##0$","원#,##0","$#,##0",
				"-#,##0","#,##0-",
				"0%","0.00%","#,##0.00%",
				"위에.00;아래00000000",
				// 숫자표시전 글자로 양수/음수 구분함
				// 숫자형식은 음수도 양수의 형태로 사용
				// "위에.00;아래00000000"  ==> "위에.00;아래.00"
				"위에.00;아래",  //"위에;아래", 에러발생
		};
		
		for (String pp : ppArr) {
			System.out.println(pp+" >>>>");
			
			DecimalFormat df = new DecimalFormat(pp);
			
			for (double dd : ddArr) {
				System.out.println("\t"+dd+" : "+df.format(dd));
			}
		}

	}

}

/*
67,78,89,98,76,54,78,77,90,56
점수가 70점 이상이면 ▲, 미만이면 ▼ 로 표시해 주세요
if, switch, 3항연산자등 조건문 사용하지 말것 
*/



