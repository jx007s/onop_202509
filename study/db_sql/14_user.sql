-- Active: 1759381616931@@127.0.0.1@3306@mysql
-- root 권한 혹은 권한을 받은 계정에서 가능


-- 데이터베이스 생성
-- db명 : db1
-- charset : utf8
-- utf8_general_ci : 대소문자 구분 없음(특수문자, 이모지 불가)
-- utf8mb4_general_ci : 대소문자 구분 없음(특수문자, 이모지 가능)
create DATABASE db1 CHARACTER SET utf8 COLLATE utf8_general_ci;
create DATABASE db3 CHARACTER SET utf8 COLLATE utf8_general_ci;

-- db목록 확인
show DATABASES;


-- 계정생성
-- create user 계정명@접근허용위치 IDENTIFIED by '암호'
-- localhost : 내컴퓨터
-- % : 모든 위치
create user uu1@localhost IDENTIFIED by '1234';
create user uu2@'%' IDENTIFIED by '1234';

-- 특정IP 로 접근 가능
-- 1개정에 여러개의 접근형태 가능
create user uu3@'192.168.0.117' IDENTIFIED by '1234';
create user uu3@'192.168.0.14' IDENTIFIED by '1234';


-- 계정 목록
select * from user;



-- 권한부여
-- 계정 및 접근위치에 따른 권한 부여 가능
-- 강사 url : 192.168.0.78  user:uu2 , password: 1234 ,  db: db1 

grant all PRIVILEGES on db1.* to uu1@localhost;
grant all PRIVILEGES on db1.* to uu2@'%';
grant all PRIVILEGES on db3.* to uu3@'192.168.0.117';
grant all PRIVILEGES on db2.* to uu3@'192.168.0.14';


-- 권한확인
show GRANTS for onop@localhost;

show GRANTS for uu1@localhost;
show GRANTS for uu2@'%';
show GRANTS for uu3@'192.168.0.117';
show GRANTS for uu3@'192.168.0.14';

-- 권한 회수
REVOKE all on db1.* from uu2@'%';
REVOKE all on db1.* from uu1@localhost;
REVOKE all on db3.* from uu3@'192.168.0.117';
REVOKE all on db2.* from uu3@'192.168.0.14';



-- 계정삭제
drop user uu2@'%';
drop user uu1@localhost;
drop user uu3@'192.168.0.117';
drop user uu3@'192.168.0.14';

-- db삭제
drop database db1;
drop database db3;