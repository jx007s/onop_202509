package excep_p;

//import java.lang.ArithmeticException;


public class ExcepMain {

	public static void main(String[] args) {

		try {
			System.out.println("실행 1");
			
			int a = 10/2;	//정상일 경우 catch 로 진입 안함  
							//Arithmetic 에러 발생 -->
							//예외처리 catch 있는지 확인--> catch로 던지기--> 
							//try 내 하위구문 실행 안함 
			
			System.out.println("실행 2 : "+a);

			
			int [] arr = {11,22,33};
			
			System.out.println("실행 3 : "+arr[2]);
			
			String ttt = "oNOp";
			ttt = null;
			
			System.out.println("실행 4 : "+ttt+" , "+ttt.toLowerCase());
			
		
			
		}catch(ArrayIndexOutOfBoundsException e) {
			// 타 구간의 지역변수(내부변수)  접근 불가
			//System.out.println("배열 예외처리 발생 : "+e.getMessage()+a);
			System.out.println("배열 예외처리 발생 : "+e.getMessage());
			return;
			
		}catch(Exception e) {  // catch 다중 처리시 부모(상위)클래스 가 하위클래스 보다 뒤에 위치해야 한다
			
			System.out.println("일반적 예외처리 발생 : "+e.getMessage());
			//e.printStackTrace();
			
			try {  // 중첩  try~catch 가능
				System.out.println("catch > try 시작");
				
				int bb = 1234/0;
				
				System.out.println("catch > try 끝");
			} catch (Exception e2) {
				System.out.println("catch > catch 실행 : "+e2.getMessage());
			}
			
			

		}finally {  // try~catch 구간 실행 후 마지막 구문 실행시
			System.out.println("메인 종료");
		}
		
		
		

	}

}

/*
 Excep369Main
 //if문 3항연산자, switch 등 조건항을 사용하지 않고 3,6,9게임을 완성하세요  
  //일의 자리만

1.   1~> 20

1
2
짝
4
5
짝
7
8
짝
10
11
12
짝
14
15
짝
17
18
짝
20
*/
