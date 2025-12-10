package excep_p;

public class ThrowMain {

	public static void main(String[] args) {
		try {
			System.out.println("try 실행 1");
			
			Exception my = new Exception("내가만든예외처리");
			
			System.out.println("try 실행 2");
			
			throw my;	//예외처리 발생
			
			//System.out.println("try 실행 3");
			
		} catch (Exception e) {
			
			System.out.println("catch : "+e.getMessage());
			
		}

		System.out.println("메인 종료------");
	}

}
