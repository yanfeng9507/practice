# Write your MySQL query statement below
select Name Customers from Customers c where Id not in (select CustomerId from Orders)