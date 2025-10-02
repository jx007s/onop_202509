-- Active: 1759295776133@@127.0.0.1@3306@onop_db

-- table
select *,kor+eng+mat as tot , (kor+eng+mat)/3  from exam;

select pid, avg(average) from
(select * , tot/3 as average from
(select *,kor+eng+mat as tot from exam) t1) t2
group by pid;


select t1.* , tot/3 as average from
(select *,kor+eng+mat as tot from exam) t1;


-- 조건절

select avg(kor) from exam;

select * from exam where kor >= 73.1429;

select * from exam where kor >= (select avg(kor) from exam);


-- 값
--  맥도날드 교수님으로 나도 신청하고 싶어
-- 나 : hhh, 너 : bbb

select pid from professor where name = '맥도날드';
update per2 set pfid = 'pf2' where pid = 'fff';


update per2 set pfid = (select pid from professor where name = '맥도날드') where pid = 'hhh';



-- 검색내용이 다중일 경우 


-- = 대신 in 사용
-- 스네이프 교수님 학생들의 영어점수를 5점 추가해줘

select pid from professor where name = '스네이프';

select pid from per2 where pfid='pf2';

update exam set eng = eng+5 where pid in('bbb','fff');

-- 덤블도어 교수님 학생들의 수학점수를 5점 감점해줘

update exam set mat = mat-5 
where pid in(select pid from per2 
where pfid=(select pid from professor where name = '더블도어'));

-- aaa 보다 영어점수 높은 사람
select eng from exam where pid = 'aaa';
-- 79,82,92

-- any  데이터중 1개라도 충족시 선택 (79,82,92) 중 한개만이라도 충족 - 79초과
select * from exam where eng > any (select eng from exam where pid = 'aaa');

-- all  모든 데이터가 충족시 선택 (79,82,92) 모두 충족 - 92 초과
select * from exam where eng > all (select eng from exam where pid = 'aaa');


-- 나이가 40세 이상인 학생중 국어점수가 80점 이하인 학생의 수학점수를 3점 추가하세요

-- 나이가 40세 이상인 학생 /  국어점수가 80점 이하인 학생의 수학점수를 3점 추가하세요

update exam set mat = mat +3 where kor <=80;

select pid from per2 where age >= 40;
-- bbb, eee, fff, ggg


update exam set mat = mat +3 where pid in ('bbb','eee', 'fff', 'ggg');

update exam set mat = mat +3 where kor <=80 and pid in ('bbb','eee', 'fff', 'ggg');

update exam set mat = mat +3 
where kor <=80 and 
pid in (select pid from per2 where age >= 40);


/*
professor
pid   name    tel
---------------------------------------
pf1	더블도어	1111
pf2	스네이프	2222
pf3	맥도날드	3333


pid pname age height friend pfid
---------------------------------------
aaa	황진이	    36		bbb	   pf1
bbb	이효리	    45	175	ccc	   pf2
ccc	장남건	    14	168	bbb	   pf1
dd	경남진돗개			 bbb	pf3
eee	코예진	    57	168	eee	   pf1
fff	예진	   45	174		   pf2
ggg	진	       62   156	aaa	   pf3
hhh	진눈개비	27	 181		pf3

exam
id hakgi name   pid  reg_date  kor eng mat
---------------------------------------------
1	1	semi	aaa	2025-05-04	77	79	69
2	1	semi	bbb	2025-05-04	88	104	94
3	1	semi	ccc	2025-05-04	57	59	59
4	1	semi	ddd	2025-05-04		49	71
5	1	final	aaa	2025-07-11	97	92	90
6	1	final	bbb	2025-07-11	70	83	25
7	1	final	ccc	2025-07-11	79	97	11
8	1	final	ddd	2025-07-11	70	41	21
9	2	semi	aaa	2025-10-15	74	92	13
10	2	semi	bbb	2025-10-15	70	64	73
11	2	semi	ccc	2025-10-15	80	93	79
12	2	semi	ddd	2025-10-15	80	69	74
13	2	final	aaa	2025-12-19		82	86
14	2	final	bbb	2025-12-19		104	64
15	2	final	ccc	2025-12-19	97	59	29
16	2	final	fff	2025-12-19	85	99	78
17	1	final	aaa	2025-07-17	78	92	52
18	1	final	bbb	2025-07-17	58	67	96
*/


-- view 생성
/*
create view 뷰이름
AS
select 구문
*/
create view ex_view 
AS
select t1.* , tot/3 as average from
(select *,kor+eng+mat as tot from exam) t1;


select * from ex_view;

-- view 삭제
drop view ex_view;

-- view 수정
alter view ex_view 
AS
select t1.* , tot/3 as qwer from
(select *,kor+eng+mat as tot from exam) t1;