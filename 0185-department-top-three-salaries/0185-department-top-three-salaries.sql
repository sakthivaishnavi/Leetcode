# Write your MySQL query statement below
SELECT department, employee, salary
FROM
(    
    SELECT
        dept.name AS department,
        emp.name AS employee,
        emp.salary AS salary,
        DENSE_RANK() OVER(PARTITION BY dept.name ORDER BY emp.salary DESC) AS unqrk
    FROM employee emp
    JOIN department dept ON dept.id = emp.departmentid
) AS table1
WHERE unqrk < 4;