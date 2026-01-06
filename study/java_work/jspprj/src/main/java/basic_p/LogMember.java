package basic_p;

import jakarta.servlet.http.HttpServletRequest;

public class LogMember {
	String pid, pname, pw;

	public LogMember(String pid, String pname, String pw) {
		this.pid = pid;
		this.pname = pname;
		this.pw = pw;
	}

	public String getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}
	
	public boolean memChk(HttpServletRequest req) {

		return pid.equals(req.getParameter("pid")) && pw.equals(req.getParameter("pw"));
	}
	
}
