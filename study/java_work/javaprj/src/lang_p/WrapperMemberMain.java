package lang_p;


//사진 파일을 확인하세요 ex) 영업_홍길동_20110823.jpg
		//이미지파일만 가능토록 - jpg,bmp,gif (대소문자 구분안함)
		//파일명이 부서명, 회원 이름, 입사일이 될 것
		//입사년도는 숫자만 입력토록 함(8자리만 가능)
		//호봉수를 계산할 것 (년도단위에서 절삭)
		//성명은 2-4자만 기록 가능 

public class WrapperMemberMain {

	public static void main(String[] args) {
		try {
			String pp = "영업_홍길_20110823.bmp";
			
			String [] arr = pp.split("_");
			if(arr.length!=3) {
				throw new Exception("파일명에러");
			}
			
			if(arr[1].length()<2 || arr[1].length()>4 ) {
				throw new Exception("이름 에러");
			}
		
			int pos = arr[2].lastIndexOf(".");
			
			String ext = arr[2].substring(pos+1).toLowerCase();
			
			if(!(ext.equals("jpg") ||ext.equals("bmp") ||ext.equals("gif") )) {
				throw new Exception("확장자 에러");
			}
			
			String joinStr = arr[2].substring(0,pos);
			
			if(joinStr.length()!=8) {
				throw new Exception("년도에러");
			}
			
			int joinDay = Integer.parseInt(joinStr);
			
			int now = 20250815;
			
			System.out.println("부서명:"+arr[0]);
			System.out.println("이름:"+arr[1]);
			System.out.println("입사일:"+joinDay);
			System.out.println("호봉:"+(now-joinDay)/10000);
			
		}catch(NumberFormatException e) {
			System.out.println("입사년도 에러");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
