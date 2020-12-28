
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

