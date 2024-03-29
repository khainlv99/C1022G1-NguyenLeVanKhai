use quan_ly_sinh_vien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select *
from subject
where credit in(select max(credit) from `subject`);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select `subject`.sub_ID , `subject`.sub_name , `subject`.credit, mark.mark 
from subject join mark on `subject`.sub_id = mark.sub_id
where mark.mark in (select max(mark) from mark);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select student.student_id, student.student_name, student.address, student.phone,
avg(mark.mark) as 'Điểm trung bình các môn'
from student join mark on student.student_id = mark.student_id
group by student.student_id , student.student_name
order by avg(mark.mark) desc;