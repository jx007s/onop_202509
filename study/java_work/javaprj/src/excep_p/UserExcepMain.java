package excep_p;


class UserExcep extends Exception{
	
	String [] arr = {
			"사용자예외처리야",
			"빈칸에러",
			"특수기호유효성 에러",
			"숫자만 가능",
			"영문만 가능"
			};
	
	UserExcep() {
		msg = arr[4];
	}
	
	UserExcep(int no) {
		msg = arr[no];
	}
	
	UserExcep(String msg) {
		this.msg = msg;
	}
	
	String msg;
	
	@Override
	public String getMessage() {
		
		return msg;
	}
}

public class UserExcepMain {

	public static void main(String[] args) {
		
		try {
			//throw new UserExcep();
			//throw new UserExcep(4);
			throw new UserExcep("문자열입력예외처리");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
