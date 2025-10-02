-- Active: 1759295776133@@127.0.0.1@3306@onop_db


create table member(
    pid varchar(50) PRIMARY key,  -- not null + unique
    pname varchar(50) not null,  -- null 허용 안함
    tel varchar(50) UNIQUE,      -- 중복 허용 안함
    hobby varchar(50)
);

-- 제약 조건 확인
select * from information_schema.TABLE_CONSTRAINTS;
select * from information_schema.TABLE_CONSTRAINTS where TABLE_NAME = 'member';


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
