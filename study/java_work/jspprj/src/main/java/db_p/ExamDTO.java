package db_p;

import java.util.Date;

public class ExamDTO {

	Integer id, hakgi, kor, eng, mat;
	String name, pid, ff, pw;
	Date regDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getHakgi() {
		return hakgi;
	}
	public void setHakgi(Integer hakgi) {
		this.hakgi = hakgi;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMat() {
		return mat;
	}
	public void setMat(Integer mat) {
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getFf() {
		return ff;
	}
	public void setFf(String ff) {
		this.ff = ff;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "ExamDTO [id=" + id + ", name=" + name + ", hakgi=" + hakgi + ", pid=" + pid + ", pw=" + pw + ", kor="
				+ kor + ", eng=" + eng + ", mat=" + mat + ", ff=" + ff + ", regDate=" + regDate + "]";
	}
	
	
}
