show databases;

insert into onop_db.person (pid, pname, age) values('ddd','삼효리',26);


SELECT * FROM onop_db.person;

-- 한줄 주석
/*  주석 구간 */
use mysql; -- db 변경 (권한 설정시 mysql DB이어야 함)

-- 계정생성
-- 계정명 : onop
-- 접근가능 IP : localhost - 자신의 컴퓨터만    ,  % : 모든컴퓨터,   162.168.0.57 : 특정IP
-- 암호 : 123456
create user 'onop'@localhost identified by '123456';

-- 권한부여
-- 접근DB : onop_db.* -  onop_db 아래 모든 것
-- 접근권한 :  all  -  모든 권한
-- 접근계정 : 'onop'@localhost
grant all privileges on onop_db.* to 'onop'@localhost;



