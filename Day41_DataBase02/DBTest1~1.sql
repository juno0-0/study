
--�μ� ���̺� �����ϱ�
CREATE TABLE dept( deptno number(2) CONSTRAINT PK_DEPT PRIMARY KEY, 
                   dname varchar2(14),
                   loc varchar2(13) );

--��� ���̺� �����ϱ�
CREATE TABLE emp( empno number(4) CONSTRAINT PK_EMP PRIMARY KEY,
                  ename varchar2(10),
                  job varchar2(9),
                  mgr number(4),
                  hiredate date,
                  sal number(7,2),
                  comm number(7,2),
                  deptno number(2) CONSTRAINT FK_DEPTNO REFERENCES DEPT );
                  
--�޿� ���̺� �����ϱ�
--grade ���, losal �޿� ���Ѱ�, hisal �޿� ���Ѱ�
CREATE TABLE salgrade ( grade number, losal number, hisal number);

--�μ� ���̺� ���� ������ �ֱ�
INSERT INTO dept (deptno, dname, loc) VALUES(10, '�渮��', '����');
INSERT INTO dept (deptno, dname, loc) VALUES(20, '�λ��', '��õ');
INSERT INTO dept VALUES(30, '������', '����');--(deptno, dname, loc)�� ��������
INSERT INTO dept VALUES(40, '�����', '����');

--��� ���̺� �ȿ� �ִ� ���ڵ�(��)�� �˻��ϱ�
SELECT * FROM dept;

--������ ORDER BY �����ϰ� ���� �÷���

--��� ���̺� �ڷ� �����ϱ�
--�� �տ� �ִ� �����ȣ�� �⺻Ű�� �ߺ��� �ȵȴ�.
INSERT INTO EMP VALUES(1001, '����', '���', 1013, to_date('2007-03-01','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1002, '�ѿ���', '�븮', 1005, to_date('2007-04-02','yyyy-mm-dd'), 250,   80, 30);
INSERT INTO EMP VALUES(1003, '����ȣ', '����', 1005, to_date('2005-02-10','yyyy-mm-dd'), 500,  100, 30);
INSERT INTO EMP VALUES(1004, '�̺���', '����', 1008, to_date('2003-09-02','yyyy-mm-dd'), 600, NULL, 20);
INSERT INTO EMP VALUES(1005, '�ŵ���', '����', 1005, to_date('2005-04-07','yyyy-mm-dd'), 450,  200, 30);
INSERT INTO EMP VALUES(1006, '�嵿��', '����', 1008, to_date('2003-10-09','yyyy-mm-dd'), 480, NULL, 30);
INSERT INTO EMP VALUES(1007, '�̹���', '����', 1008, to_date('2004-01-08','yyyy-mm-dd'), 520, NULL, 10);
INSERT INTO EMP VALUES(1008, '���켺', '����', 1003, to_date('2004-03-08','yyyy-mm-dd'), 500,    0, 30);
INSERT INTO EMP VALUES(1009, '�ȼ���', '����', NULL, to_date('1996-10-04','yyyy-mm-dd'),1000, NULL, 20);
INSERT INTO EMP VALUES(1010, '�̺���', '����', 1003, to_date('2005-04-07','yyyy-mm-dd'), 500, NULL, 10);
INSERT INTO EMP VALUES(1011, '�����', '���', 1007, to_date('2007-03-01','yyyy-mm-dd'), 280, NULL, 30);
INSERT INTO EMP VALUES(1012, '������', '���', 1006, to_date('2007-08-09','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1013, '������', '����', 1003, to_date('2002-10-09','yyyy-mm-dd'), 560, NULL, 20);
INSERT INTO EMP VALUES(1016, '���̼�', '���', 1006, to_date('2007-11-09','yyyy-mm-dd'), 250, NULL, 10);
INSERT INTO EMP VALUES(1017, '���̼�', '���', 1006, to_date('2007-11-16','yyyy-mm-dd'), 250, NULL, 10);
INSERT INTO EMP VALUES(1018, '���̼�', '���', 1006, to_date('2007-11-15','yyyy-mm-dd'), 250, NULL, 10);
INSERT INTO EMP VALUES(1019, '������', 'ȸ��', null, to_date('2020-12-29','yyyy-mm-dd'), 250, NULL, 10);
--comm�� null
INSERT INTO EMP VALUES(1020, '������', 'ȸ��', null, to_date('2020-12-29','yyyy-mm-dd'), 250, NULL, 10);
--��¥�� null
INSERT INTO EMP VALUES(1021, '������', 'ȸ��', null, null, 250, 500, 10);
--���ڰ� null
INSERT INTO EMP VALUES(1022, null, 'ȸ��', null, to_date('2020-12-29','yyyy-mm-dd'), 250, 500, 10);
INSERT INTO EMP VALUES(1023, '������', null, null, to_date('2020-12-29','yyyy-mm-dd'), 250, 500, 10);

select comm, nvl(comm,0) from emp;
select hiredate, nvl(hiredate, '2020/12/25') from emp;
select ename, nvl(ename, 'IU') from emp;
select job, nvl(job, 'ȸ��') from emp;

--nvl2 �Լ�
select ename, sal, comm, nvl2(comm, sal*12+comm, sal*12) from emp;
select * from emp;
--nullif �Լ�
select nullif('a','a'),nullif('a','b') from dual;
select coalesce('a','b','c',null,'d') from dual;





--��� ���̺� ��� ���ڵ� ���
SELECT * FROM EMP;

--�޿� ���̺� �ڷ� �����ϱ�
INSERT INTO SALGRADE VALUES (1, 700,1200);
INSERT INTO SALGRADE VALUES (2, 1201,1400);
INSERT INTO SALGRADE VALUES (3, 1401,2000);
INSERT INTO SALGRADE VALUES (4, 2001,3000);
INSERT INTO SALGRADE VALUES (5, 3001,9999);

--�޿� ���̺� ��� ���ڵ� ���
select * from salgrade;

--�ߺ� ����
SELECT DISTINCT job FROM emp;

SELECT DISTINCT job ���� FROM emp;

SELECT sal from emp;

SELECT sal ����, sal*0.03 ���� from emp;

SELECT ename, comm, sal*12+comm ����, NVL(comm,0),sal*12+NVL(comm,0) from emp;

--|| concatentation������ ����Ͽ��� �÷����� ������ �� �ִ�.
SELECT ename || '�� ������ '|| job || '�Դϴ�.' ���� FROM emp;

--Where�� ������
select * from emp;
--���� �˻�
SELECT * from emp where sal >= 500;
SELECT * from emp where deptno = 10;
--���� �˻�
SELECT * from emp where ename = '�ѿ���';
--��¥ �˻�, 2005�� 1�� 1�� ������ �Ի��� ���, �����̸� ���� ��, ���ĸ� ū ��
select * from emp where hiredate < to_date('2005/01/01','yyyy/MM/dd');
select * from emp where hiredate > to_date('2005/01/01','yyyy/MM/DD');

--��������
--�μ���ȣ�� 10�̰� ������ ������ ���
select ename, sal from emp where not deptno = 10 or job = '����';
--�޿��� 400~500�� ��� and
select * from emp where sal >= 400 and sal <= 500;
--�޿��� 400�̸��̰ų� 500�ʰ��� ��� or
select * from emp where sal < 400 or sal > 500;
--between and : ~����
select * from emp where sal between 400 and 500;
--in : ~�ȿ�
select * from emp where comm = 80 or comm = 100 or comm = 200;
select * from emp where comm in(80,100,200);

select * from emp where comm != 80 and comm <> 100 and comm ^= 200;
select * from emp where comm not in(80,100,200);

--like : ������ġ(����ϰ� ��ġ�ϴ� ��)
--�达�� ���, ���� ��򰡿� ��� ��� ��
--���ϵ�ī�� : % : ���ڰ� ���ų� �ϳ� �̻��� � ���ڰ� �͵� �������.
--            _ : �ϳ��� ���ڰ� � ���� �͵� �������.
select * from emp where ename like '__��';
--job���� '��'�� �����ϴ� �� ã��
select * from emp where job like '��%';
--job���� '��'�� �������� �ʴ� �� ã��
select * from emp where job not like '��%';
--���� '��'���� �ƴ� ��� ã��
select * from emp where ename not like '��%';
--comm�� NULL�� ��� ã��
select * from emp where comm is null;

select * from emp order by ename;
--����߿��� �޿� �������� ����
select * from emp where job = '���' order by comm;
--�ֱٿ� �Ի��� ��� ������� ����, ������ ����
select * from emp where job not like '����' order by hiredate desc;

--��� �̸��� �޿��� �Ի� ���ڸ� ����ϱ�
select ename �̸�, sal �޿�, hiredate �Ի��� from emp;
--deptno�� �μ���ȣ, dname�� �μ������� ��Ī �ٿ��� ���
select deptno �μ���ȣ, dname �μ��� from dept;
--������̺� �����ϴ� ������ ������ ����ϱ�
select DISTINCT job ���� from emp;
--�޿��� 300������ ����� �����ȣ, ����̸�, �޿��� ���
select empno �����ȣ, ename �����, sal �޿� from emp where sal <= 300;
--�̸��� '����ȣ'�� ����� �����ȣ, ����� �޿��� ���
--select empno �����ȣ, ename �����, sal �޿� from emp where ename like '����ȣ';
select empno �����ȣ, ename �����, sal �޿� from emp where ename = '����ȣ';
--�޿��� 250�̰ų� 300�̰ų� 500�� ������� �����ȣ, �����, �޿��� ���
select empno �����ȣ, ename �����, sal �޿� from emp where sal in(250,300,500);
--�޿��� 250�� 300�� 500�� �ƴ� ������� ���
select empno �����ȣ, ename �����, sal �޿� from emp where sal not in(250,300,500);
--����߿��� �̸��� '��'���� �����ϴ� ����� �̸��߿� '��'�� �����ϴ� ����� �����ȣ�� ����̸��� ���
select empno �����ȣ, ename �����, sal �޿� from emp where ename like '��%' or ename like '%��%';
--����ڰ� ���� ����� �˻�
select empno �����ȣ, ename �����, sal �޿� from emp where mgr is null;
--������̺��� �ڷḦ �Ի����� �������� �����Ͽ� �ֱٿ� �Ի��� ������ ���� ���� ���(�����ȣ, �����, ����, �Ի��ϸ� ���)
select empno �����ȣ, ename �����, job ����, hiredate �Ի��� from emp order by hiredate desc;
--�μ���ȣ�� ���� �����ȣ���� ����ϵ�, ���� �μ� ���� ����� ����� ��� �Ի����� ���� ������ ������� ���
select * from emp order by deptno, hiredate;

CREATE TABLE group_star( name varchar2(8));

INSERT INTO group_star VALUES('A');
INSERT INTO group_star VALUES('B');
INSERT INTO group_star VALUES('C');
INSERT INTO group_star VALUES('D');
INSERT INTO group_star VALUES('E');
INSERT INTO group_star VALUES('F');
INSERT INTO group_star VALUES('G');
INSERT INTO group_star VALUES('H');

SELECT * FROM group_star;
delete from group_star where name = 'A';

CREATE TABLE single_star( name varchar2(8));

insert into single_star values('E');
insert into single_star values('F');
insert into single_star values('G');
insert into single_star values('H');
insert into single_star values('I');
insert into single_star values('J');
insert into single_star values('K');
insert into single_star values('L');

--������
select * from group_star union select * from single_star;
select * from group_star union all select * from single_star;

--������
select * from group_star INTERSECT select * from single_star;

--������
select * from group_star minus select * from single_star;

--3�� ����Ŭ �Լ�
select * from dual;
select power(2,3) from dual;
select round(3.83,1) from dual;
select mod(10,3) from dual;
select 'Welcome to Oracle' , upper('Welcome to ORacle'), lower('Welcome to oracle'), initcap('welcome to oracle') from dual;
select lengthb('welcome to oracle �ѱ�') from dual;
select concat('ab','cd') from dual;
select substrb('�����ٶ󸶹ٻ�',2,5) from dual;
select instr('�����ͺ��̽�','��',4,1) from dual;
select instrb('�����ͺ��̽�','��',4,1) from dual;
select lpad('Oracle',20,'#') from dual;
select rpad('Oracle',20,'#') from dual;
select sysdate, to_char(sysdate,'yyyy/MM/dd, AM HH:MI:SS') from dual;
select to_date('1992/01/30','yyyy/MM/dd') from dual;
select to_char(1234000, 'L000,000,000.00') from dual;
select to_number('199999') from dual;
select to_number('542') - to_number('500') from dual;
select '542'+'500' from dual;

--��¥ trunc ���� �������� ���� ������.
select to_char(sysdate, 'yyyy-mm-dd') from dual;
select to_char(hiredate, 'yyyy/mm/dd') �Ի���, to_char(trunc(hiredate, 'MONTH'),'yyyy/mm/dd') �Ի��� from emp;

--round ���� �������� 16�Ϻ��ʹ� �ݿø� �������� �ݳ���
select to_char(hiredate, 'yyyy/mm/dd') �Ի���, to_char(round(hiredate, 'MONTH'),'yyyy/mm/dd') �Ի��� from emp;

--���ְ� ���۵Ǵ� ��¥
select to_char(hiredate, 'yyyy/mm/dd') �Ի���, to_char(round(hiredate, 'DAY'),'yyyy/mm/dd') �Ի��� from emp;

select ename, sysdate ����, to_char(hiredate, 'yyyy/mm/dd'), round(MONTHs_BETWEEN(sysdate, hiredate)) from emp;

select ename, to_char(add_months(hiredate, 6), 'yyyy-mm-dd') from emp;

select ename, to_char(hiredate,'yyyy/mm/dd'), to_char(last_day(hiredate), 'yyyy/mm/dd') from emp;

select ename, deptno, decode(deptno, 10, '�渮��',
                                     20, '�λ��',
                                     30, '������',
                                     40, '�����') from emp;
                                     
select ename, deptno, case when deptno = 10 then '�渮��'
                          when deptno = 20 then '�λ��'
                          end as dname from emp;
                          
select to_char(sysdate, 'yyyy/mm/dd') ����,
       to_char(next_day(sysdate,2),'yyyy/mm/dd') ������
       from dual;
       
--9���� �Ի��� ���
select * from emp where substr(hiredate, 4,2)=09;
--2003�⵵�� �Ի��� ���
select * from emp where substr(hiredate,1,2)=03;
--�̸��� '��'�� ������ ����� �˻�
select * from emp where substr(ename,-1,1)='��';
--�̸��� �ι�° ���ڿ� '��'�� �ִ� ����� �˻�
select * from emp where instr(ename, '��',2, 1) = 2;
--���޿� ���� �޿��� �λ�, ������ 5%, ������ 10%, �븮�� 13%, ����� 20%
select ename, job, decode(job, '����', sal*1.05,
                               '����', sal*1.1,
                               '�븮', sal*1.13,
                               '���', sal*1.2,
                                      sal) upsal from emp;
                                      
--�Ի��� ������ 2�ڸ�(YY), ���� ����(MON)���� ǥ��, ������ ���(DY)�� �����Ͽ� ���
select hiredate, to_char(hiredate,'yy/mon/dd dy') from emp;


select sal, round(sal,-2) from emp;

select round(12300.7876, -4) from dual;

--�׷��Լ�
select sum(sal) from emp;
select avg(sal) from emp;
select count(job) from emp;
select count(comm) from emp;
select max(sal) from emp;

--group by
select sum(sal) from emp;--��� ����� ����
--�μ����� ����(�κ���)
select deptno, sum(sal) from emp group by deptno;
--���޺��� ����(�κ���)
select job, sum(sal) from emp group by job;
--����� ���� ����
select deptno, sum(sal) from emp where job='���' group by deptno;
--�达 ���� ���� ������� ���� ���
select job, avg(sal) from emp where ename like '��%' group by job;
--�Ի����� 2000����� 2003�� ����
select job, avg(sal) from emp where substr(hiredate, 1, 2) in('00','01','02','03') group by job;
select deptno, max(sal), min(sal) from emp where job='���' group by deptno order by max(sal);

--HAVING��
--����� 500 �̻� ���
select deptno, avg(sal), max(sal), min(sal) from emp group by deptno having avg(sal) >= 500 order by deptno;

--�׷��Լ��� ����Ͽ� ��赥���� ���ϱ�
--��� ����� �޿��ְ��, ������, �Ѿ�, �� ��� ���
--����� ������ �ݿø�
select max(sal) �ְ��, min(sal) ������, sum(sal) �Ѿ�, round(avg(sal),0) ��� from emp;

--count(*)�Լ��� �̿��Ͽ� ��� ������ ����� ���
select deptno, count(*) from emp group by deptno order by deptno;

--���� ���� �����Ͻÿ�
select count(*) from emp where job='����';

--�޿� �ְ��, �������� ������ ���
select max(sal), min(sal), max(sal) - min(sal) from emp;

--���޺� ����� ���� �޿��� ���,
--������ 500�̸��� �׷��� ���ܽ�Ű��, ����� �޿��� ���� ������������ �����Ͽ� ���
select job, min(sal) from emp group by job having min(sal)>=500 order by min(sal) desc;

--�� �μ��� ���� �μ���ȣ, �����, �μ����� ��� ��� ��� �޿��� ���
--��� �޿��� �Ҽ��� ��°�ڸ��� �ݿø�
select deptno �μ���ȣ, count(*) �����, round(avg(sal),2) ��� from emp group by deptno;

--�� �μ��� ���� �μ���ȣ �̸�, ������, �����, �μ� ���� ��� ����� ��� �޿��� ���
--��� �޿��� ������ �Ҽ��� ��° �ڸ��� �ݿø�
select decode(deptno, 10, '�渮��',
                      20, '�λ��',
                      30, '������',
                      40, '�����') �μ��̸�,
       decode(deptno, 10, '����',
                      20, '��õ',
                      30, '����',
                      40, '����') ������,count(*), round(avg(sal),2) from emp group by deptno;
