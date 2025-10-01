-- 2개의 테이블 사용 : 레코드 * 레코드
select * from per2, exam;

/*
select * from per2, exam
where
pid = pid;
*/

/* 
이퀄조인
두개의 테이블이 연결된 레코드만 리턴 */
select per2.*, id, hakgi, name, exam.reg_date, kor, eng, mat from per2, exam
where
per2.pid = exam.pid;

-- 내부 조인 (inner join) : 이퀄조인과 같다
select * from per2
inner join exam
on
per2.pid = exam.pid;


-- 외부조인 (outer join) :
-- 왼쪽 외부조인 :  왼쪽 테이블의 모든 행 리턴 , 오른쪽 테이블 조건에 맞는 행 리턴
select * from per2
left outer join exam
on
per2.pid = exam.pid;


select * from per2
right outer join exam
on
per2.pid = exam.pid;

-- cross 조인 : select * from per2, exam; 와 같다
select * from per2
cross join exam;

-- inner join 과 같다
select * from per2
cross join exam
on
per2.pid = exam.pid;

-- 한개 테이블에서 작업
select * from per2
where friend = pid;

-- self 조인
-- 테이블에 별칭 : me, fr
-- 이퀄조인
select me.*, fr.pname from per2 me,  per2 fr
where me.friend = fr.pid;

-- 왼쪽 외부 조인
select me.*, fr.pname from per2 me
left outer join per2 fr
on
me.friend = fr.pid;


/*
professor
교수테이블을 생성하세요
"pid" "NAME", "TEL"
 
학생테이블에 교수를 추가하시고 각 학생마다 교수를 지정하세요 (pid)
1. 
학생별 교수 이름을 출력하세요

2.
교수별 학생중 가장 높은 평균점수를  출력하세요 (group by)
*/

create table professor(
	pid varchar(50),
    name varchar(100),
    tel  varchar(30)
);

insert into professor (pid, name, tel) values
('pf1','더블도어','1111'),
('pf2','스네이프','2222'),
('pf3','맥도날드','3333');

select * from professor;

alter table per2 add pfid varchar(50);

select per2.*, professor.name from per2
left outer join professor
on per2.pfid = professor.pid;

select name, max(average) from
(select professor.name, (kor+eng+mat)/3 as average from professor
left outer join
(select exam.*, per2.pfid from per2
right outer join exam
on
per2.pid = exam.pid) t1
on professor.pid = pfid) t2
group by name;











