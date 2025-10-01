select left('아기상어',2);
select right('아기상어',2);
select mid('아기상어 뚜루루 뚜 루',3,5);
select substring('아기상어 뚜루루 뚜 루',3,5);
select substring('아기상어 뚜루루 뚜 루',3);

select substr('아기상어 뚜루루 뚜 루',3,5);
select substr('아기상어 뚜루루 뚜 루',3);

select substring_index('aaaa,bb,cccc,dd,eeee,ff,g,h',',',3);
select substring_index('aaaa,bb,cccc,dd,eeee,ff,g,h',',',-3);

select length('aBCd 아기상어 eFg'), char_length('aBCd 아기상어 eFg');
-- byte(한글 3byte)                 글자수

select instr('창원 Onop onoP','on');
-- 몇번째 (대소문자 구분 안함)

-- select instr('창원 Onop onoP','on',6); 없음

select instr('창원 Onop onoP','qwer'); -- 없으면 0

select position('on' in '창원 Onop onoP');

-- 변환
select ascii('A'), char(65),  convert(char(65) using utf8);

select upper('AbcD eFg'), lower('AbcD eFg');

select replace('창원 Onop onoP','o','오'); -- 대소문자 구분함

select repeat('창원',5);

select insert('asd ghj kl',3,4,'공룡이지롱');

        -- 5  글자  3
select '     on op   ', char_length('     on op   ');
select ltrim('     on op   '), char_length(ltrim('     on op   '));
select rtrim('     on op   '), char_length(rtrim('     on op   '));
select trim('     on op   '), char_length(trim('     on op   '));

select lpad('on op',10,'@'),rpad('on op',10,'@');
select lpad('on op123456789',10,'@'),rpad('on op123456789',10,'@');

select reverse('qwer tyu');


-- 1 ==> A학기, 2 ==> B학기 로 바꾸어 출력하세요

select * , concat(char(hakgi+64),'학기') from exam;


select * , replace(replace(hakgi,2,'B학기'),1,'A학기') from exam;

select * , replace(hakgi,2,'B학기') from exam;
