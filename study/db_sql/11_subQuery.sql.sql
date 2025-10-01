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



-- 검색내용이 다중일 경우 in 사용
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