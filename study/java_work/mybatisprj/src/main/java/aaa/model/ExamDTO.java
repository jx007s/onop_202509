package aaa.model;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExamDTO {

	Integer id, hakgi, kor, eng, mat;
	String name, pid, ff, pw;
	String  schTitle1, schVal1,schTitle2, schVal2, schTitle3, schVal3;
	Date regDate;
	MultipartFile upff;
	public ExamDTO(Integer hakgi, String name, String pid, Integer kor, Integer eng, Integer mat, String pw) {

		this.hakgi = hakgi;
		this.name = name;
		this.pid = pid;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.pw = pw;
	}

	
}
