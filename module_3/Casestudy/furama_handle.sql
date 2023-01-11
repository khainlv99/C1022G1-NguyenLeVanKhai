use furama;

-- câu 2
select * from nhan_vien where ho_ten like 'H%' or ho_ten like 'T%' or ho_ten like 'K%' and LENGTH(ho_ten) <= 15;

-- câu 3
-- SELECT dia_chi, ngay_sinh, TIMESTAMPDIFF(YEAR, ngay_sinh, CURRENT_DATE) as age
-- from khach_hang
-- having age between 18 and 50
-- and (dia_chi = 'Đà Nẵng' or dia_chi = 'Quảng Trị');
-- câu 4
select ma_khach_hang, count(ma_khach_hang) as 'so_lan_dat_phong'
from khach_hang
where ma_loai_khach = 1
group by ma_khach_hang 
order by count(ma_khach_hang) asc;