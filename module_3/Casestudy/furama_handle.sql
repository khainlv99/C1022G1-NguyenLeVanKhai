use furama;

-- câu 2
select * from nhan_vien where ho_ten like 'H%' or ho_ten like 'T%' or ho_ten like 'K%' and LENGTH(ho_ten) <= 15;

-- câu 3
select *
from khach_hang
where (round(datediff(curdate(),khach_hang.ngay_sinh)/365,0)>=18
and round(datediff(curdate(),khach_hang.ngay_sinh)/365,0)<=50)
and ((khach_hang.dia_chi like '%Đà Nẵng%' )
or (khach_hang.dia_chi like '%Quảng Trị%'));
-- câu 4
select kh.ma_khach_hang	,
kh.ho_ten,
count(hd.ma_khach_hang) 'total'
from khach_hang kh join loai_khach lk on kh.ma_loai_khach = lk.ma_loai_khach
join hop_dong hd on hd.ma_khach_hang = kh.ma_khach_hang
where lk.ma_loai_khach=1
group by kh.ma_khach_hang
order by count(hd.ma_khach_hang);