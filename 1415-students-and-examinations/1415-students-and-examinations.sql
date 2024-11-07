# Write your MySQL query statement below
select 
s.student_id,s.student_name,sub.subject_name,
        (
        select count(1)
        from examinations e
        where e.student_id = s.student_id
        and e.subject_name = sub.subject_name
         ) as attended_exams
from students s, subjects sub
order by s.student_id, sub.subject_name;

