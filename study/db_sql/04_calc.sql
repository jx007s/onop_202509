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
-- between~and
-- 70 이상 80 이하
select * from exam where kor between 70 and 80;
-- 결과물 없음 : between 작은수 and 큰수 이어야 한다.
select * from exam where kor between 80 and 70;

-- pid in ('aaa', 'bbb' )  ==>    pid='aaa' || pid='bbb'
select * from exam where pid in ('aaa' , 'bbb');

-- like
select * from per2 where pname = '진';
select * from per2 where pname like '진';

select * from per2 where pname = '%진%';
-- '진' 을 포함한 모든 row
/*
% : 글자수 0~ 모든글자
_ : 글자수1개 모든글자 
*/
select * from per2 where pname like '%진%';
select * from per2 where pname like '진%';
select * from per2 where pname like '%진';
select * from per2 where pname like '_진_';
select * from per2 where pname like '_진';
select * from per2 where pname like '진_';
select * from per2 where pname like '__진';

-- 이름이 진으로 끝나고 나이가 40,50대인 데이터를 출력하세요
select * from per2 where pname like '%진' and age between 40 and 59;



