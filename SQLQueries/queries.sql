-- How to find the second highest salary in sql
1. Using max()
    select max(salary)
    from employee
    where salary < (select max(salary) from employee);
2. Using limit
    select distinct salary
    from employee
    order by salary desc
    limit n-1,1; -- where n is the nth highest salary
3. without limit using self join
    select salary
    from employee e1
    where n-1 = (select count(distinct e2.salary)
                 from employee e2
                 where e2.salary > e1.salary);
4. using dense_rank()
    select * from (select salary,dense_rank() over(order by salary desc) as rank
    from employee) as temp where rank=n;
5. using not in
    select max(salary)
    from employee
    where salary not in (select max(salary) from employee);
-- How to find the Nth Highest Salary in SQL
select * from (
    select empName,salary,dense_rank() over (order by salary desc) as ranking
    from employee
) as temp
where temp.ranking=2;

-- with CTE
with temp as (
select empName,salary,dense_rank() over (order by salary desc) as rank from employee
)
select * from temp where rank=2;

-- Find the number of employees working in each department
select d.dept_name,count(*)
from employee e inner join department d on e.dept_id = d.dept_id
group by e.dept_id;