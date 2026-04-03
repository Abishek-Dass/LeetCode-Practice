Select emp.name as Employee
from employee emp
inner join employee m
on emp.managerid = m.id
where emp.salary > m.salary
