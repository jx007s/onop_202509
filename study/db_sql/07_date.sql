select sysdate(), now(), curdate(), curtime();


select year(sysdate()), year('1999-08-23'), year('2002-06-03 17:45:27');

select year(sysdate()), month(sysdate()), day(sysdate()), date(sysdate());

select dayofyear(sysdate()), dayofmonth(sysdate()), dayofweek(sysdate());
select week(sysdate()), weekday(sysdate()), weekofyear(sysdate());
/*						일 월 화 수 목 금 토 일
dayofweek(sysdate())    1  2 3 4  5 6  7
weekday(sysdate())         0 1 2  3 4  5  6 

올해 몇번째 주
week(sysdate())  0부터 시작
weekofyear(sysdate()) 1부터 시작
*/

select monthname(sysdate()), dayname(sysdate());
select last_day(sysdate()),last_day('2025-02-17'),last_day('2024-02-09');

select hour(sysdate()), minute(sysdate()), second(sysdate());

select date_add(sysdate(), interval 3 month), date_add(sysdate(), interval -3 month);
select date_sub(sysdate(), interval 3 month), date_sub(sysdate(), interval -3 month);
select adddate(sysdate(), interval 3 month), adddate(sysdate(), interval -3 month);
select subdate(sysdate(), interval 3 month), subdate(sysdate(), interval -3 month);

select addtime(sysdate(), '00:10:20'), date_add(sysdate(), interval 5 minute), addtime(sysdate(), '0-1-3 00:10:20');
-- addtime(sysdate(), '0-1-3 00:10:20') : 시간만 가능

select adddate(sysdate(), '0-1-3');  -- 의미 없음

select addtime(sysdate(), '00:10:20'), subtime(sysdate(), '00:10:20');

select datediff(sysdate(),'2022-05-05'), datediff(sysdate(),'2026-05-05');

select period_add(202203,5),period_add(202211,5);
select period_diff(202203,202206);


select date_format('2025-09-08 15:06:45', '%Y')
,date_format('2025-09-08 15:06:45', '%y')
,date_format('2025-09-08 15:06:45', '%M')
,date_format('2025-09-08 15:06:45', '%m')
,date_format('2025-09-08 15:06:45', '%c')
,date_format('2025-09-08 15:06:45', '%D')
,date_format('2025-09-08 15:06:45', '%d')
,date_format('2025-09-08 15:06:45', '%e')
,date_format('2025-09-08 15:06:45', '%w') -- 일요일 : 0
,date_format('2025-09-08 15:06:45', '%W')
,date_format('2025-09-08 15:06:45', '%a')
,date_format('2025-09-08 15:06:45', '%p')
,date_format('2025-09-08 15:06:45', '%H')  -- 24시간 : 2자리
,date_format('2025-09-08 05:06:45', '%H')
,date_format('2025-09-08 05:06:45', '%k')  -- 24시간 : 1자리
,date_format('2025-09-08 15:06:45', '%k')
,date_format('2025-09-08 15:06:45', '%h')  -- 12시간 : 2자리
,date_format('2025-09-08 05:06:45', '%h')  -- 12시간 : 2자리
,date_format('2025-09-08 15:06:45', '%l')  -- 12시간 : 1자리
,date_format('2025-09-08 05:06:45', '%l')  -- 12시간 : 1자리
,date_format('2025-09-08 15:06:45', '%i')  -- 분
,date_format('2025-09-08 15:06:45', '%s')  -- 초
,date_format('2025-09-08 15:06:45', '%j') 
,date_format('2025-09-08 15:06:45', '%r') 
,date_format('2025-09-08 15:06:45', '%T') 
,date_format('2025-09-08 15:06:45', '%U') -- 올해 몇번째 주 : 0 시작
,date_format('2025-09-08 15:06:45', '%u') -- 올해 몇번째 주 : 1 시작
;


-- 2023-08-09 15:06:45를 2023년 8월 09일 (수) 15:06:45 PM 으로 출력하세요
-- concat, date_format, mid

select concat(
date_format('2023-08-09 15:06:45', '%Y년 %c월 %d일 ('),
mid('일월화수목금토',date_format('2023-08-09 15:06:45', '%w')+1,1),
date_format('2023-08-09 15:06:45', ') %T %p'));

