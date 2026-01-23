package aaa.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ExamMapper {

	@Select("select * from exam")
	List<ExamDTO> list();
}
