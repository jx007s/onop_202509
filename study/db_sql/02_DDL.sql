-- 테이블 생성 : 대소문자 구분 안함
/*
create table 테이블명(
	컬럼1 타입,
    컬럼2 타입,
    ...
);
[[ 타입 ]]
정수 : int
실수 : double
문자열 : varchar(n)
시간 :  time
날짜 : date
날짜+시간 : datetime
*/
create table bike(
	title varchar(100),
    engine int,
    reg_date datetime,
    start_date date,
    run_time time
);

-- 컬럼추가
alter table bike add size int;

-- 컬럼 자료형 변경
alter table bike modify engine varchar(10);

-- 컬럼 이름,자료형 변경
alter table bike change engine eg int;

-- 컬럼 삭제
alter table bike drop size;


-- 테이블 목록 보기
show tables;

-- 테이블 확인
desc bike;

-- 테이블명 변경
alter table bike rename autobike;

-- 테이블 복사
create table per2 as select * from person;

-- 테이블 삭제
drop table person;

/*
옷테이블 을 구축하세요
숫자         문자     실수          날짜,      날짜시간,   정수
옷번호,     제품명,   가격(천단위),    출시일,      판매일,   크기
*/