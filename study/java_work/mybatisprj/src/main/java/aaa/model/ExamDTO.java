package aaa.model;

import java.util.Date;

import lombok.Data;

@Data
public class ExamDTO {

	Integer id, hakgi, kor, eng, mat;
	String name, pid, ff, pw;
	Date regDate;
}
