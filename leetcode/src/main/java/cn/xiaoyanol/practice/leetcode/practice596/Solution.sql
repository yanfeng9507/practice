# Write your MySQL query statement below
select class from (select distinct * from courses) t group by class having count(class)>=5