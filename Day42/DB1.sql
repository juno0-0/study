-- 테이블 만들기
CREATE TABLE member(
        name varchar2(10) PRIMARY key,
        age number(3),
        weight number(3),
        height number(3),
        sex char(3));
        
-- 데이터 삽입
insert into member values('유관순',17,50,160,'여');
insert into member values('홍길동',20,60,175,'남');
insert into member values('이순신',20,60,180,'남');

-- 데이터베이스에 확정(저장)
-- DB에는 있는데 Java에서 안보이는 경우 commit을 안한 것
commit;

select * from member;
show user;

SELECT instance FROM v$thread;