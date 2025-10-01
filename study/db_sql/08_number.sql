select abs(123.456), abs(-123.456); 
select ceiling(123.456), ceiling(-123.456),ceiling(123.987), ceiling(-123.987); 
select ceil(123.456), ceil(-123.456),ceil(123.987), ceil(-123.987); 
select floor(123.456), floor(-123.456),floor(123.987), floor(-123.987); 
select round(123.436), round(-123.436),round(123.987), round(-123.987); 
select round(123.431,2), round(-123.431,2),round(123.987,2), round(-123.987,2); 
select truncate(123.431,2), truncate(-123.431,2),truncate(123.987,2), truncate(-123.987,2); 
select pow(2,4), mod(15,7);
select greatest(43,78,12,43,56), least(43,78,12,43,56);
select pi();

select interval(78,0,60,70,80,90);
-- 찾을 값 : 78      1  2  3  4  5
-- 값 :  70 <= 찾을값 < 80
--      찾는위치    


select interval(78,100,90,80,70,60,0);   -- 최초 값 100 보다 작기 때문에 0 

select interval(78,0,60,80,70,90);  -- 순차적이지 않아 정확한 위치값을 찾을 수 없음

select interval(70,0,60,70,80,90);

select interval(120,0,60,70,80,90);

-- 시험평균을 이용하여 수우미양가를 출력하세요
-- mid, interval

select mid('가양미우수',interval((ifnull(kor,0)+eng+mat)/3,0,60,70,80,90),1) from exam;

select if(true,'참이지롱','거짓부렁');

select *, if(age>=40,'불혹입니다','응애에요') from per2;

select *,
case 
when kor >= 90 then '수'
when kor >= 80 then '우'
when kor >= 70 then '미'
when kor >= 60 then '양'
else '가'
end as average
from exam;

select database();

-- select '1234', password('1234');

-- 암호화
--  hex() : 16진수로 변형
-- aes_encrypt() : 암호기법
-- 내용 : '아기상어'
-- 암호키 : 'qwer'
select aes_encrypt('아기상어','qwer'), hex(aes_encrypt('아기상어','qwer'));

-- 복호화
-- 0FF20D06BF89F59B00C108764513159C
select unhex('0FF20D06BF89F59B00C108764513159C'), 
aes_decrypt(unhex('0FF20D06BF89F59B00C108764513159C'),'qwer'),
convert( aes_decrypt(unhex('0FF20D06BF89F59B00C108764513159C'),'qwer') using utf8);

/*
per2 를 이용하여

20 미만 미성년자
40 미만 청년
60 미만 중년
이상    노년

으로 분류하여 ???님 ?? 회원입니다. 출력하세요
*/

select *,
concat(pname,'님 ',
case
when age < 20 then '미성년자'
when age < 40 then '쳥년'
when age < 60 then '중년'
else '노년'
end,' 회원입니다.') as hello
 from per2;






