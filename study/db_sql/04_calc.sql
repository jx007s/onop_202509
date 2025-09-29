select 10 + 20;

select kor, kor + 20 from exam;
--  산술연산자 +-*/%
-- 별칭 : as
select *, kor+10,eng-20, mat*2, eng/3, kor%5, kor+eng+mat as tot from exam;

-- 문자열 결합으로 + 사용 불가
select *, '이름'+pname from per2;

-- 문자열 결합 concat()
select *, concat(hakgi, '학기') as hg from exam;

-- 비교      return 1: true, 0:false
select kor, 
kor > 70, 
kor >= 70,
kor <= 70,
kor < 70,
kor = 70,  -- 같다
kor != 70, -- 다르다
kor <> 70 -- 다르다
from exam;

-- null 비교 불가
select kor , kor = null, kor != null,  kor <> null from exam;

select kor , kor is null , kor is not null from exam;

-- ifnull(컬럼, 대체값)
select kor , ifnull(kor, -5) from exam;


-- 논리연산자
-- and
select * from exam where hakgi=1 and name='semi';
select * from exam where hakgi=1 && name='semi';
-- or
select * from exam where pid='aaa' or pid='bbb';
select * from exam where pid='aaa' || pid='bbb';
-- not
select * from exam where !(hakgi=1 && name='semi');



