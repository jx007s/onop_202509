package excep_p;

class ReCCC{
	void meth_1() throws Exception {
		
		System.out.println("\t meth_1 시작");
		meth_2();
		System.out.println("\t meth_1 끝");
	}
	
	void meth_2() throws Exception {
		
		
		try {
			System.out.println("\t\t meth_2 시작");
			meth_3();  // throws Exception 이 선언된 메소드 호출 시  
						//try~catch or throws Exception 필요
			System.out.println("\t\t meth_2 끝");
		} catch (Exception e) {
			System.out.println(" >>> meth_2 예외처리 : "+e.getMessage());
			throw e;
		}
		
	}

	// declaration : 정의
	// throws Exception : '예외를 던질 수 있다' 를 정의
	// meth_3() 를 호출 하는 구간에서는 예외처리를 필수로 해야 함 (try~catch)
	void meth_3() throws Exception{
	
		try {
			System.out.println("\t\t\t meth_3 시작");
			
			throw new Exception("meth_3 에러발생");
			
			//System.out.println("\t\t\t meth_3 끝");
			
		} catch (Exception e) {
			System.out.println(" >>> meth_3 예외처리 : "+e.getMessage());
			throw e;  //다시던지기
		}
	
}
}



public class ReThrowMain {

	public static void main(String[] args) throws Exception {
		
		try {
			System.out.println("main 시작");
			ReCCC rc = new ReCCC();
			rc.meth_1();
			System.out.println("main 끝");
		} catch (Exception e) {
			System.out.println(" >>> main 예외처리 : "+e.getMessage());
			throw e;
		}
		

	}

}
