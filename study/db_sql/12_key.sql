-- Active: 1759295776133@@127.0.0.1@3306@onop_db


create table member(
    pid varchar(50) PRIMARY key,  -- not null + unique
    pname varchar(50) not null,  -- null 허용 안함
    tel varchar(50) UNIQUE,      -- 중복 허용 안함
    hobby varchar(50)
);

-- 제약 조건 확인
select * from information_schema.TABLE_CONSTRAINTS;
select * from information_schema.TABLE_CONSTRAINTS where TABLE_NAME = 'member2';


create table member2(
    pid varchar(50), 
    pname varchar(50),  
    tel varchar(50),  
    hobby varchar(50)
);

-- 추가
-- 기본키
alter table member2 add constraint PRIMARY key(pid);

-- unique
alter table member2 add constraint UNIQUE(tel);

-- not null
alter table member2 modify pname VARCHAR(50) not null;


-- 제거
alter table member2 drop PRIMARY key;
alter table member2 drop constraint tel;

alter table member2 modify pname VARCHAR(50) null;
alter table member2 modify pid VARCHAR(50) null;


create table product(
    id int AUTO_INCREMENT PRIMARY key,
    title VARCHAR(100)
);

-- AUTO_INCREMENT 삭제
alter table product modify id int;

-- PK 삭제
alter table product drop PRIMARY key;
-- not null 삭제
alter table product modify id int null;

-- PK + AUTO_INCREMENT 추가
alter table product  modify id int AUTO_INCREMENT PRIMARY key;


create table exam2(
    exid int AUTO_INCREMENT PRIMARY key,
    title VARCHAR(100),
    pid VARCHAR(50),
    kor int,
    constraint exam2_fk FOREIGN key(pid) REFERENCES per2(pid)
);
--  외래키 설정
-- constraint exam2_fk FOREIGN key(pid)   REFERENCES per2(pid)
--            제약조건이름      외래키 설정컬럼         참조테이블 : per2  컬럼:pid(PK)


-- 외래키 제거
alter table exam2 drop FOREIGN key exam2_fk;

-- 외래키 추가
alter table exam2 add constraint ex_fk FOREIGN key(pid) REFERENCES per2(pid);

alter table exam2 drop FOREIGN key ex_fk;

alter table exam2 add constraint ex_fk FOREIGN key(pid) REFERENCES per2(pid)
on update CASCADE on delete CASCADE;
-- update CASCADE :  참조키가 변경되면 외래키값도 변경 
-- delete CASCADE :  참조키가 삭제되면 외래키관련 레코드도 삭제



/*
 학과테이블 : id(PK), 학과명, 학과실
 
 교수 테이블 : pid(PK), 이름, tel, 전공(FK)--> 학과테이블
 
 * */

 create table lesson(
    id varchar(100) PRIMARY key,
    title varchar(100),
    room  varchar(100)
 );

 alter table professor add constraint PRIMARY key(pid);

 alter table professor add lesson_id varchar(100);
 alter table professor add constraint le_fk FOREIGN key(lesson_id) REFERENCES lesson(id);
