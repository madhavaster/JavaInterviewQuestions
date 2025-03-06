Most commonly asked interview questions on core java.

select * 
from employee
order by id asc;

select empname from 
employee 
group by empname
having count(*)>1;

with deleteDuplicates as 
(
    select id,empname,
    ROW_NUMBER() over(
        PARTITION BY empname
        order by id asc
    ) as rowno
    from employee
)

delete from deleteDuplicates 
where rowno > 1;