package aaa.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import aaa.di.PageInfo;

@Mapper
public interface ExamMapper {
	
	@Select("select count(*) as total from exam")
	int total();

	@Select("select * from exam order by id desc limit #{start} , #{cnt}")
	List<ExamDTO> list(PageInfo pInfo);
	
	@Select("select * from exam where id = #{id}")
	ExamDTO detail(ExamDTO dto);
	
	@Insert("insert into exam "
			+ "(hakgi, name,  pid, kor, eng, mat, pw, ff, reg_date) "
			+ "values "
			+ "(#{hakgi}, #{name}, #{pid}, #{kor}, #{eng}, #{mat}, #{pw}, #{ff}, now() )")
	int insert(ExamDTO dto);
	
	
	
	@SelectKey(
			keyProperty = "id",
			resultType = Integer.class,
			before = true,
			statement = "select max(id)+1 from exam"
			)
	@Insert("insert into exam "
			+ "(id, hakgi, name,  pid, kor, eng, mat, pw, ff, reg_date) "
			+ "values "
			+ "(#{id}, #{hakgi}, #{name}, #{pid}, #{kor}, #{eng}, #{mat}, #{pw}, #{ff}, now() )")
	int insertKey(ExamDTO dto);
	
	
	@SelectKey(
			keyProperty = "id",
			resultType = Integer.class,
			before = false,
			statement = "select max(id) from exam"
			)
	@Insert("insert into exam "
			+ "( hakgi, name,  pid, kor, eng, mat, pw, ff, reg_date) "
			+ "values "
			+ "( #{hakgi}, #{name}, #{pid}, #{kor}, #{eng}, #{mat}, #{pw}, #{ff}, now() )")
	int insertKeyAfter(ExamDTO dto);
	
	
	// 리턴이 1개 일때 기본자료형으로 리턴 가능
	@Select("select max(id) from exam")
	int maxId();
	
	@Delete("delete from exam where id = #{id}")
	int delete(ExamDTO dto);
	
	@Update("update exam set "
			+ "hakgi = #{hakgi} , name = #{name} ,  pid = #{pid}, "
			+ "kor = #{kor} , eng = #{eng} , mat = #{mat}, pw = #{pw} "
			+ "where id = #{id} ")
	int modify(ExamDTO dto);
	
	
	//  ${필드명}  :: 문자열로만 대체 -- 테이블의 컬럼명 등 구조형태에 사용
	//  #{필드명}  :: 컬럼의 값으로 대체 - 문자열, 숫자 등 대치시 '' 자동반영
	@Select("<script>"
			
			+ "select * from exam "
			+"<where> "
			+ "<if test= 'schTitle1 != null' >"
			+ "${schTitle1} = #{schVal1} "
			+ "</if>"
			+ "<if test= 'schTitle2 != null' >"
			+ "and ${schTitle2} = #{schVal2} "
			+ "</if>"
			+ "<if test= 'schTitle3 != null' >"
			+ "and ${schTitle3} like concat('%', #{schVal3} ,'%') "
			+ "</if>"
			+"</where> "
			+ "</script>"
			)
	List<ExamDTO> listSch(ExamDTO dto);
	
	
	
	@Select("<script>"
			
			+ "select * from exam "
			+" <where> "
			+ "<choose>"
			+ "    <when test = 'schTitle1 == 1 '> "
			+ "    kor &gt;= 90 "
			+ "    </when> "
			+ "    <when test = 'schTitle1 == 2 '> "
			+ "    kor &gt;= 80 and kor &lt; 90 "
			+ "    </when> "
			+ "    <when test = 'schTitle1 == 3 '> "
			+ "    kor &gt;= 70 and kor &lt; 80 "
			+ "    </when> "
			+ "    <otherwise> "
			+ "    kor &lt; 70 "
			+ "    </otherwise> "
			+ "</choose>"
			+" </where> "
			+ "</script>"
			)
	List<ExamDTO> listChoose(ExamDTO dto);
	
	
	@Insert("<script>"
			+" insert into exam "
			+ "(hakgi, name,  pid, kor, eng, mat, pw, reg_date) "
			+ "values "
			+ "<foreach collection='arr' item='dd' separator=',' index='i'> "
			+ "  ( #{dd.hakgi}, #{dd.name}, #{dd.pid}, #{dd.kor}+#{i}, #{dd.eng}, #{dd.mat}, #{dd.pw},  now() )"
			+ "</foreach> "
			+"</script>")
	int insertList(@Param("arr") List<ExamDTO> arr);
	
	
	
	
}
