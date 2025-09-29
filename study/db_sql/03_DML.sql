-- 데이터 추가
/*
insert into 테이블명 
(컬럼1, 컬럼2,...)
values
(컬럼1값, 컬럼2값,...);

*/
insert into per2 (pid, pname, age, height) values('ddd','손예진',42,158);

/*다중 입력 가능*/
insert into per2 (pid, pname,height) values
('ddd','발예진',172),
('eee','코예진',168),
('fff','눈예진',174),
('ggg','귀예진',153);



-- 조회
/*
select 컬럼1, 컬럼2,... from 테이블명
select * from 테이블명 : 모든 컬럼
*/
select * from per2;

select pid , age from per2;


-- 변경
/* update 테이블명 set 컬럼명 = 값 
update 테이블명 set 컬럼명 = 값 where 조건
*/
update per2 set age = 45;

update per2 set age = 36 where pid = 'ddd';

-- 삭제
/*delete from 테이블명 where 조건 */
delete from per2 where height <=160;
/*
EXAM 테이블을 생성 및 데이터 입력하세요

시번,  학기,   종류,  응시생,   응시일,   국어, 영어, 수학
id,  hakgi, name,  pid, reg_date, kor, eng, mat
숫자    숫자   문자    문자   날짜       숫자  숫자  숫자


입력내용
학생별
1학기 중간, 기말
2학기 중간, 기말 
을 입력 하세요

학생 4명 * 시험종류4 = 16개
*/

create table exam(
	id int,  
    hakgi int, 
    name varchar(100),  
    pid varchar(100), 
    reg_date date, 
    kor int, eng int, mat int
);

insert into exam
(id,  hakgi, name,  pid, reg_date, kor, eng, mat)
values
(1,1,'semi','aaa','2025-05-04',77,79,71),
(2,1,'semi','bbb','2025-05-04',97,99,91),
(3,1,'semi','ccc','2025-05-04',57,59,61),
(4,1,'semi','ddd','2025-05-04',87,49,71),
(5,1,'final','aaa','2025-07-11',97,39,51),
(6,1,'final','bbb','2025-07-11',75,94,13),
(7,1,'final','ccc','2025-07-11',79,97,13),
(8,1,'final','ddd','2025-07-11',74,96,18),
(9,2,'semi','aaa','2025-10-15',74,92,15),
(10,2,'semi','bbb','2025-10-15',74,59,61),
(11,2,'semi','ccc','2025-10-15',79,93,81),
(12,2,'semi','ddd','2025-10-15',79,69,71),
(13,2,'final','aaa','2025-12-19',97,99,91),
(14,2,'final','bbb','2025-12-19',67,99,61),
(15,2,'final','ccc','2025-12-19',97,59,34),
(16,2,'final','ddd','2025-12-19',37,94,75);

select * from exam;