package basic_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JoinMember {

	String pname, addr, myPic;
	Date birth;
	
	SimpleDateFormat sdf;
	
	JoinMember(String pname, String birth, String addr, String myPic) {
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		//System.out.println(birth);
		
		this.pname = pname;
		try {
			this.birth = sdf.parse(birth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.addr = addr;
		this.myPic = myPic;
	}
	public String getPname() {
		return pname;
	}
	public String getAddr() {
		return addr;
	}
	public String getMyPic() {
		return myPic;
	}
	public String getBirthStr() {
		System.out.println("getBirthStr() 실행 : "+sdf.format(birth));
		return sdf.format(birth);
	}
	
	
	
}
