# Write your MySQL query statement below
select ifnull((
select distinct Salary SecondHighestSalary from Employee order by Salary desc limit 1,1 ) , null) as SecondHighestSalary

select distinct salary from Employee order by salary desc limit 1,1
就可以，但是输不出null，所以外面再加一层
select (select distinct salary from Employee order by salary desc limit 1,1) as SecondHighestSalary ;