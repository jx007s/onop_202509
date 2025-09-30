-- 집계함수
-- null 은 제외
select count(*), count(kor), sum(kor), avg(kor), max(kor), min(kor), group_concat(kor) from exam;

-- select * , count(*) from exam; 집계함수와 일반 조회 동시 사용 불가

-- group by 컬럼1, 컬럼2 ... : 컬럼의 데이터를 기준으로 그룹화
select hakgi,name, count(*), count(kor) from exam
group by hakgi, name;

-- having : group의 조건식
select hakgi,name, count(*), count(kor) from exam
group by hakgi, name
having count(kor)> 2;


select hakgi,name, sum(eng) from exam
group by hakgi, name;


-- where : 그룹화 하기전 전체를 대상으로 필터링
select hakgi,name, sum(eng) from exam
where eng >= 60
group by hakgi, name;

-- having : 그룹화 후 그룹단위로 필터링
select hakgi,name, sum(eng) from exam
group by hakgi, name
having sum(eng) > 260;


select hakgi,name, sum(eng) from exam
where eng >= 60
group by hakgi, name
having sum(eng) > 200
order by name;

select pid from exam;

-- distinct 중복데이터 제거
select distinct pid from exam;


-- 학생별로 국어, 영어, 수학의 최대점수를 출력하세요
-- 단 학생 의  4번의 시험 합계(국어+영어+수학) 평균이 170 점이상만 할것
-- null은 0점으로 환산
-- 학생은 내림 차순 할 것

select pid , max(kor) as mkor, max(eng) as meng, max(mat) as mmat from exam
group by pid
having avg(ifnull(kor,0) + eng + mat)>=170
order by pid desc;


