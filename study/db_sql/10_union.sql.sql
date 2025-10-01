-- Active: 1759295776133@@127.0.0.1@3306@onop_db
create table menu_1(

    title VARCHAR(100),
    price int,
    cnt int
);

create table menu_2(

    title VARCHAR(100),
    price int
);

create table menu_3(

    title VARCHAR(100),
    price int,
    opt VARCHAR(100)
);

INSERT into menu_1 (title, price, cnt) VALUES
('아메리카노',1900, 2),
('아프리카노',2100, 1),
('아시아노',2400, 3);

INSERT into menu_2 (title, price) VALUES
('김치찌개',5000),
('된장찌개',6000),
('부대찌개',7500),
('순두부찌개',8000);



INSERT into menu_2 (title, price) VALUES
('아프리카노',2100),
('아시아노',9000);



INSERT into menu_3 (title, price, opt) VALUES
('신라면',3000,'계란'),
('안성탕면',3500,'치즈'),
('짜파게티',3700,'트러플');

INSERT into menu_3 (title, price, opt) VALUES
('아프리카노',2100,'시럽'),
('아메리카노',1900, '더시럽'),
('부대찌개',7500,'6사단'),
('순두부찌개',1234,'할께없음');


select * from menu_1;
select * from menu_2;
select * from menu_3;

-- 중복데이터는 1개만 가져옴
select title, price from menu_1
UNION
select * from menu_2
UNION
select title, price from menu_3;

-- 중복 허용
select title, price from menu_1
UNION all
select * from menu_2
UNION all
select title, price from menu_3;