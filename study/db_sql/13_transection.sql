-- Active: 1759295776133@@127.0.0.1@3306@onop_db

-- autocommit : 자동저장
SET autocommit = 0; -- autocommit 해제
SET autocommit = 1; -- autocommit 적용

select @@autocommit; --autocommit 확인

insert into per2 (pid, pname) values ('mmm','현빈');

insert into per2 (pid, pname) values ('ppp','장희빈');

commit;  -- 변경 내용 저장


insert into per2 (pid, pname) values ('rrr','미스터빈');
insert into per2 (pid, pname) values ('sss','김우빈');
insert into per2 (pid, pname) values ('uuu','원빈');

ROLLBACK;  -- 이전 commit 상태로 되돌리기

insert into per2 (pid, pname) values ('qwqw','젤리빈');
insert into per2 (pid, pname) values ('asas','자바빈');

SAVEPOINT A;

insert into per2 (pid, pname) values ('zxzx','속이빈');
insert into per2 (pid, pname) values ('erer','증기터빈');

SAVEPOINT B;

insert into per2 (pid, pname) values ('dfdf','유즈빈');
insert into per2 (pid, pname) values ('cvcv','명세빈');

ROLLBACK to SAVEPOINT B;
ROLLBACK to SAVEPOINT A;
ROLLBACK;
