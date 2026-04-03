# Write your MySQL query statement below
delete from Person where id not in (Select s.id from(Select min(id) as id from Person group by email) as s)