REM   Script: SDET _sql_act3
REM   SDET _sql_act3

desc salesman


CREATE TABLE salesman( 
salesman_id int, 
salesman_name varchar2(32), 
salesman_city varchar2(32), 
commission int 
);

desc salemman


describe salesman


INSERT INTO salesman values(5002, nail knite, 'paris', 13);

INSERT INTO salesman values(5002, 'nail knite', 'paris', 13);

select * from salesman;

select * from salesman;

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman;

select * from salesman;

select salesman_id, salesman_city from salesman where salesman_city='paris';

select salesman_id, salesman_city from salesman where salesman_city='Paris';

select * from salesman;

update salesman  
set saalesman_city='Paris' where salesman_id=5002;

update salesman  
set salesman_city='Paris' where salesman_id=5002;

select * from salesman;

select * from salesman;

select salesman_id, salesman_city from salesman where salesman_city='Paris';

select salesman_id, salesman_city from salesman where salesman_city='Paris';

select * from salesman;

select salesman_id, commission from salesman where salesman_name='Paul Adam';

select * from salesman where salesman_city='Paris';

