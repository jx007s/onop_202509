package lang_p;

interface ClaBoardService{
	void execute(String id);
}

class ClaBList implements ClaBoardService{
	@Override
	public void execute(String id) {
		System.out.println("목록입니다.");
	}
}

class ClaBDetail implements ClaBoardService{
	@Override
	public void execute(String id) {
		System.out.println("상세입니다.");
	}
}
class ClaBInsert implements ClaBoardService{
	@Override
	public void execute(String id) {
		System.out.println("추가입니다.");
	}
}
class ClaBModify implements ClaBoardService{
	@Override
	public void execute(String id) {
		System.out.println("수정입니다.");
	}
}
class ClaBDelete implements ClaBoardService{
	@Override
	public void execute(String id) {
		System.out.println("삭제입니다.");
	}
}



public class ClassBoardMain {
	
	static ClaBoardService serviceGo(String service) throws Exception {
		return (ClaBoardService)Class.forName("lang_p.ClaB"+service).newInstance();
	}

	public static void main(String[] args) {

		
		try {
			serviceGo("List").execute("123");
			serviceGo("Detail").execute("123");
			serviceGo("Insert").execute("123");
			serviceGo("Modify").execute("123");
			serviceGo("Delete").execute("123");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
// ClassShapeMain
//입력값에 따라 도형클래스를 생성하여 도형의 넓이를 계산하세요
/// 1. 인터페이스를 이용한 다형성형태로 만들것
/// 2. 입력형태 사각형   원   삼각형
/// 3. 실행메소드 void excute()
/// 4. 동적 바인딩 사용할 것









