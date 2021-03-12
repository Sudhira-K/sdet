REM   Script: SDET _sql_act7
REM   SDET _sql_act7

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

select * from salesman;

ALTER TABLE salesman add grade int;

select * from salesman;

UPDATE TABLE salesman set grade=100;

UPDATE salesman set grade=100;

select * from salesman;

select * from salesman;

select * from salesman;

UPDATE salesman set grade = 200 where salesman_city='Rome';

select * from salesman;

UPDATE salesman set grade = 200 where salesman_city='Rome';

UPDATE salesman set grade = 300 where salesman_name='Pit Alex';

UPDATE salesman set salesman_name ='Pierre' where salesman_name ='McLyon';

select * from salesman;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select * from orders;

select DISTINCT salesman_id from orders;

select * from orders;

select order_no from orders ORDER BY order_date;

select order_no, order_date from orders ORDER BY order_date;

select * from orders;

select order_no, purchase_amount from orders ORDER BY DESC purchase_amount;

select order_no, purchase_amount from orders ORDER BY  purchase_amount DESC;

select * from orders where purchase_amount>500;

select * from orders where purchase_amount<500;

select * from orders where purchase_amount between 1000 and 2000;

select * from orders;

select purchase_amount, sum(PURCHASE_AMOUNT) from orders;

select sum(PURCHASE_AMOUNT) purchase_amount from orders;

select avg(PURCHASE_AMOUNT) purchase_amount from orders;

select sum(PURCHASE_AMOUNT) max_amount from orders;

select sum(PURCHASE_AMOUNT) min_amount from orders;

select * from orders;

select count(salesman_id) salesman_count from orders;

select max(PURCHASE_AMOUNT) max_amount from orders;

select min(PURCHASE_AMOUNT) min_amount from orders;

select sum(PURCHASE_AMOUNT) as "Total Sum" from orders;

select avg(PURCHASE_AMOUNT) as  "Average" from orders;

select max(PURCHASE_AMOUNT) as "max_amount" from orders;

select min(PURCHASE_AMOUNT)  as "Min Amount"  from orders;

select count(salesman_id) as "Total Count" from orders;

