-- Active: 1759295776133@@127.0.0.1@3306@onop_db
update exam set pw = '1111';

select * from exam
order by id desc;


insert into exam (hakgi, name,pid, kor, eng,mat) VALUES
(1,'semi','aaa', 11,28,53),
(1,'semi','bbb', 31,29,32),
(1,'final','bbb',41,24,3),
(2,'semi','aaa', 51,23,3),
(2,'final','aaa',61,26,3),
(2,'semi','bbb', 71,23,3),
(2,'final','bbb',81,27,3),
(1,'semi', 'ccc',91,24,3),
(1,'final','ddd',11,24,3),
(1,'semi', 'eee',12,26,3),
(1,'final','fff',13,82,3),
(2,'semi', 'ccc',14,62,3),
(2,'final','ddd',15,32,3),
(2,'semi', 'eee',16,52,3),
(2,'final','fff',17,27,3);
