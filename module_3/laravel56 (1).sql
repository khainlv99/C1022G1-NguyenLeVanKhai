-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th9 25, 2020 lúc 05:04 PM
-- Phiên bản máy phục vụ: 10.4.13-MariaDB
-- Phiên bản PHP: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `laravel56`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `baiviet`
--

CREATE TABLE `baiviet` (
  `id` int(10) UNSIGNED NOT NULL,
  `a_tenbaiviet` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `a_slug` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `a_motabaiviet` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `a_noidungbaiviet` longtext COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `a_hoatdong` tinyint(4) NOT NULL DEFAULT 1,
  `a_nguoiviet_id` int(11) UNSIGNED NOT NULL DEFAULT 0,
  `a_tieude_seo` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `a_hinhdaidien` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `a_luotxem` int(11) NOT NULL DEFAULT 0,
  `a_noibat` tinyint(4) NOT NULL DEFAULT 0,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `ngaycapnhap` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `baiviet`
--

INSERT INTO `baiviet` (`id`, `a_tenbaiviet`, `a_slug`, `a_motabaiviet`, `a_noidungbaiviet`, `a_hoatdong`, `a_nguoiviet_id`, `a_tieude_seo`, `a_hinhdaidien`, `a_luotxem`, `a_noibat`, `ngaytao`, `ngaycapnhap`) VALUES
(1, 'Sam Sung ra mắt chiếc điện thoại Samsung Galaxy Z Flip', 'samsung-ra-mat-chiec-dien-thoai-samsung-galaxy-X-Flip', 'Sam Sung ra mắt chiếc điện thoại Samsung Galaxy Z Flip : Với mức giá dự kiến là 1.500USD', 'Là thế hệ tiếp theo của mẫu smartphone đắt đỏ ra mắt năm 2020 – Galaxy Fold, Galaxy Z Flip vẫn là dòng sản phẩm hướng đến đối tượng khách hàng thượng lưu trên thị trường. Mẫu điện thoại gập sắp ra mắt tới đây sẽ được thiết kế gập vỏ sò như chiếc Motozola RAZR.\\r\\n\\r\\nGalaxy Z Flip sẽ sở hữu mà hình 6.7 inch có thể gập lại với lớp kính bảo vệ siệu mỏng thay vì bằng nhựa như Galaxy Fold. Cùng với đó là camera selfie đục lỗ ở chính giữa có thể sẽ có độ phân giải 10MP và 2 camera ở mặt lưng của máy.\\r\\n\\r\\nTheo một số tin đồn, Galaxy Z còn sở hữu chip Qualcomm Snapdragon 855+ bộ nhớ trong 256GB và 8GB RAM.\\r\\n\\r\\nVới mức giá dự kiến là 1.500USD, dự kiến Galaxy Z Flip sẽ ra mắt tại sự kiện Unpacked sắp tới ngày 11/2.', 1, 1, 'Điện Thoại', '2020-01-10__4338596-leicaa-8.jpg', 0, 0, '2020-01-05 06:41:36', '2020-01-10 06:36:18'),
(2, 'Hướng Dẫn Cài Đặt Kết Nối Mạng Cho Smart Tivi Samsung Giao Diện Smart Hub', 'huong-dan-cai-dat-ngon-ngu-tieng-viet-cho-may-anh-sony-alpha', 'Những lợi ích từ việc kết nối mạng trên Smart Tivi Samsung giao diện Smart Hub', '<ul>\\r\\n<li>Bước 1:\\r\\n\\r\\nChọn menu trên điều khiển tivi  -> màn hình hiện lên giao diện menu -> Chọn Mạng trên màn hình.</li>\\r\\n<li>Bước 2:\\r\\n\\r\\nỞ menu mạng chọn cài đặt mạng</li>\\r\\n<li>Bước 3:\\r\\n\\r\\nTại giao diện cài đặt mạng hiện ra như hình ảnh bên dưới -> chọn loại mạng (có 3 loại mạng bao gồm không dây, cáp, di động) -> chọn không dây (đây chính là mạng không dây wifi)</li>\\r\\n<li>Bước 4:\\r\\n\\r\\nSau khi chọn mạng không dây thì màn hình sẽ tự động hiển thị lên các mạng wifi khả dụng xung quanh mà bạn có thể kết nối.</li>\\r\\n<li>Bước 5:\\r\\n\\r\\nNếu mạng mà bạn chọn có cài đặt bảo mật -> nhập mật khẩu -> Chờ tivi kết nối internet -> chọn ok để xác nhận thành công.</li>\\r\\n</ul>\', 1, 0, \'Hướng Dẫn Cài Đặt Kết Nối Mạng Cho Smart Tivi Samsung Giao Diện Smart Hub\', \'Hướng Dẫn Cài Đặt Kết Nối Mạng Cho Smart Tivi Samsung Giao Diện Smart Hub<ul>\\r\\n<li>Bước 1:\\r\\n\\r\\nChọn menu trên điều khiển tivi  -> màn hình hiện lên giao diện menu -> Chọn Mạng trên màn hình.</li>\\r\\n<li>Bước 2:\\r\\n\\r\\nỞ menu mạng chọn cài đặt mạng</li>\\r\\n<li>Bước 3:\\r\\n\\r\\nTại giao diện cài đặt mạng hiện ra như hình ảnh bên dưới -> chọn loại mạng (có 3 loại mạng bao gồm không dây, cáp, di động) -> chọn không dây (đây chính là mạng không dây wifi)</li>\\r\\n<li>Bước 4:\\r\\n\\r\\nSau khi chọn mạng không dây thì màn hình sẽ tự động hiển thị lên các mạng wifi khả dụng xung quanh mà bạn có thể kết nối.</li>\\r\\n<li>Bước 5:\\r\\n\\r\\nNếu mạng mà bạn chọn có cài đặt bảo mật -> nhập mật khẩu -> Chờ tivi kết nối internet -> chọn ok để xác nhận thành công.</li>\\r\\n</ul>', 1, 2, 'Hướng Dẫn Cài Đặt Kết Nối Mạng Cho Smart Tivi Samsung Giao Diện Smart Hub', '2020-01-10__1111.jpg', 0, 0, '2020-01-10 06:34:51', '2020-01-10 06:34:51'),
(3, 'Tủ lạnh Panasonic Inverter 234 lít NR-BL267VSV1', 'canon-90d-325mp-4k-video-10fps-co-the-xuat-hien-cuoi-thang-8', 'Dung tích 234 lít lưu trữ được nhiều thực phẩm', '<p>Tủ lạnh Panasonic Inverter 234 lít NR-BL267VSV1</p>\\r\\n<p>Thông số kỹ thuật</p>\\r\\n<ul>\\r\\n<li>Model:	NR-BL267VSV1</li>\\r\\n<li>Màu sắc:	Xám bạc</li>\\r\\n<li>Nhà sản xuất:	Panasonic</li>\\r\\n<li>Xuất xứ:	Việt Nam</li>\\r\\n<li>Thời gian bảo hành:	24 tháng</li>\\r\\n<li>Địa điểm bảo hành:	Nguyễn Kim</li>\\r\\n<li>Kiểu tủ lạnh:	Ngăn đá trên</li>\\r\\n<li>Số cửa tủ:	2 cửa</li>\\r\\n<li>Dung tích tủ lạnh:	234</li>\\r\\n<li>Dung tích ngăn đá:	75 lít</li>\\r\\n</ul>', 1, 2, NULL, '2020-01-10__4753568-cover-canon-90dd.jpg', 0, 0, '2020-01-10 06:56:37', '2020-01-10 06:56:37');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietdonhang`
--

CREATE TABLE `chitietdonhang` (
  `id` int(10) UNSIGNED NOT NULL,
  `or_donhang_id` int(11) UNSIGNED NOT NULL DEFAULT 0,
  `or_sanpham_id` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `or_soluong` tinyint(4) NOT NULL DEFAULT 0,
  `or_giatien` int(11) NOT NULL DEFAULT 0,
  `or_giamgia` tinyint(4) DEFAULT 0,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `ngaycapnhap` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietdonhang`
--

INSERT INTO `chitietdonhang` (`id`, `or_donhang_id`, `or_sanpham_id`, `or_soluong`, `or_giatien`, `or_giamgia`, `ngaytao`, `ngaycapnhap`) VALUES
(17, 28, 14, 1, 11900000, NULL, '2020-09-25 07:57:11', '2020-09-25 07:57:11'),
(18, 29, 15, 10, 11400000, NULL, '2020-09-25 07:57:53', '2020-09-25 07:57:53'),
(19, 30, 14, 2, 11900000, NULL, '2020-09-25 08:02:23', '2020-09-25 08:02:23');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `datlaimatkhau`
--

CREATE TABLE `datlaimatkhau` (
  `email` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `donhang`
--

CREATE TABLE `donhang` (
  `id` int(10) UNSIGNED NOT NULL,
  `tr_khachhang_id` int(11) UNSIGNED NOT NULL DEFAULT 0,
  `tr_tongtien` int(11) NOT NULL DEFAULT 0,
  `tr_ghichu` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tr_diachi` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tr_sodienthoai` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `str_trangthaidonhang` tinyint(4) NOT NULL DEFAULT 0,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `ngaycapnhap` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `donhang`
--

INSERT INTO `donhang` (`id`, `tr_khachhang_id`, `tr_tongtien`, `tr_ghichu`, `tr_diachi`, `tr_sodienthoai`, `str_trangthaidonhang`, `ngaytao`, `ngaycapnhap`) VALUES
(10, 1, 15900000, 'ngọc mua đó', 'đà nẵng', '0939847832', 0, '2020-01-10 06:52:58', '2020-01-10 06:52:58'),
(12, 6, 28310000, 'Muốn mua Fujifilm nhưng hết hàng rồi. Đặt hàng cho vui thôi tí hủy hihi', 'Quảng Trị', '0374927171', 0, '2020-01-10 11:21:25', '2020-01-10 11:21:25'),
(13, 6, 13205000, 'vân cứ thích mua đó hihi', 'Quảng Trị', '0374927171', 0, '2020-01-10 12:22:01', '2020-01-10 12:22:01'),
(14, 1, 252000000, NULL, 'đà nẵng', '0939847832', 0, '2020-01-10 12:53:01', '2020-01-10 12:53:01'),
(15, 1, 70420000, NULL, 'đà nẵng', '0939847832', 0, '2020-01-10 12:58:51', '2020-01-10 12:58:51'),
(16, 7, 807899000, NULL, 'TP. Đà Nẵng', '0702750320', 0, '2020-09-15 17:25:28', '2020-09-15 17:25:28'),
(17, 7, 11305000, NULL, 'TP. Đà Nẵng', '0702750320', 0, '2020-09-24 01:24:31', '2020-09-24 01:24:31'),
(18, 7, 11305000, NULL, 'TP. Đà Nẵng', '0702750320', 0, '2020-09-24 01:24:57', '2020-09-24 01:24:57'),
(19, 7, 11305000, NULL, 'TP. Đà Nẵng', '0702750320', 0, '2020-09-24 01:25:24', '2020-09-24 01:25:24'),
(20, 7, 11305000, NULL, 'TP. Đà Nẵng', '0702750320', 0, '2020-09-24 01:25:46', '2020-09-24 01:25:46'),
(21, 7, 11305000, NULL, 'TP. Đà Nẵng', '0702750320', 0, '2020-09-24 01:26:05', '2020-09-24 01:26:05'),
(22, 7, 11305000, NULL, 'TP. Đà Nẵng', '0702750320', 0, '2020-09-24 01:26:24', '2020-09-24 01:26:24'),
(23, 7, 22610000, NULL, 'TP. Đà Nẵng', '0702750320', 0, '2020-09-24 02:09:53', '2020-09-24 02:09:53'),
(24, 7, 11305000, NULL, 'TP. Đà Nẵng', '0702750320', 0, '2020-09-24 11:36:46', '2020-09-24 11:36:46'),
(25, 7, 11305000, 'khaimuavexemphim', 'TP. Đà Nẵng', '0702750320', 0, '2020-09-24 11:37:57', '2020-09-24 11:37:57'),
(26, 7, 7999000, 'khaiso1', 'TP. Đà Nẵng', '0702750320', 0, '2020-09-24 11:45:16', '2020-09-24 11:45:16'),
(27, 7, 11305000, NULL, 'TP. Đà Nẵng', '0702750320', 0, '2020-09-24 12:44:48', '2020-09-24 12:44:48'),
(28, 8, 11305000, NULL, NULL, NULL, 0, '2020-09-25 07:57:11', '2020-09-25 07:57:11'),
(29, 8, 114000000, NULL, NULL, NULL, 0, '2020-09-25 07:57:53', '2020-09-25 07:57:53'),
(30, 10, 22610000, NULL, NULL, NULL, 0, '2020-09-25 08:02:23', '2020-09-25 08:02:23');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lienhe`
--

CREATE TABLE `lienhe` (
  `id` int(10) UNSIGNED NOT NULL,
  `c_ten` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `c_email` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `c_tieude` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `c_noidung` text COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `c_trangthai` tinyint(4) NOT NULL DEFAULT 0,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `ngaycapnhap` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `lienhe`
--

INSERT INTO `lienhe` (`id`, `c_ten`, `c_email`, `c_tieude`, `c_noidung`, `c_trangthai`, `ngaytao`, `ngaycapnhap`) VALUES
(3, 'Thân Đức Quang Hải', 'thanducquanghai@gmail.com', 'Là Hải nè', 'Hải muốn mua máy', 0, '2020-01-10 06:39:57', '2020-01-10 06:39:57'),
(4, 'Trần Thị Hồng Vân', 'vantran@gmail.com', 'Vân cũng muốn mua máy', 'Giống Hải', 0, '2020-01-10 06:41:01', '2020-01-10 06:41:01'),
(5, 'Nguyen Khai', 'khainguyenlevan@gmail.com', 'khai', 'khaideplam', 0, '2020-09-24 00:55:15', '2020-09-24 00:55:15');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaisanpham`
--

CREATE TABLE `loaisanpham` (
  `id` int(10) UNSIGNED NOT NULL,
  `c_ten` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `c_slug` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `c_bieutuong` char(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `c_hinhdaidien` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `c_hienthi` tinyint(4) NOT NULL DEFAULT 1,
  `c_tongsosp` int(11) NOT NULL DEFAULT 0,
  `c_tieudesp` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `c_motasp` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `c_tukhoa` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `ngaycapnhap` timestamp NULL DEFAULT NULL,
  `c_noibat` tinyint(4) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `loaisanpham`
--

INSERT INTO `loaisanpham` (`id`, `c_ten`, `c_slug`, `c_bieutuong`, `c_hinhdaidien`, `c_hienthi`, `c_tongsosp`, `c_tieudesp`, `c_motasp`, `c_tukhoa`, `ngaytao`, `ngaycapnhap`, `c_noibat`) VALUES
(1, 'TiVi', 'TiVi', 'fa-fa-camera', NULL, 1, 0, 'TiVi', 'TiVi', NULL, '2020-01-05 06:09:41', '2020-01-07 13:46:52', 1),
(2, 'Máy Giặt', 'Máy Giặt', 'fa-fa-camera', NULL, 1, 0, 'Máy Giặt', 'Máy Giặt', NULL, '2020-01-06 03:12:36', '2020-01-06 03:12:43', 1),
(3, 'Điện Thoại', 'Điện Thoại', 'fa-fa-camera', NULL, 1, 0, 'Điện Thoại', 'Điện Thoại', NULL, '2020-01-07 17:29:12', '2020-01-10 05:16:28', 1),
(4, 'LapTop', 'LapTop', 'fa-fa-camera', NULL, 1, 0, 'LapTop', 'LapTop', NULL, '2020-01-09 08:37:51', '2020-01-10 05:16:31', 1),
(5, 'Tủ Lạnh', 'Tủ Lạnh', 'fa-fa-camera', NULL, 1, 0, 'Tủ Lạnh', 'Tủ Lạnh', NULL, '2020-01-10 05:25:11', '2020-01-10 05:25:19', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `migrations`
--

CREATE TABLE `migrations` (
  `id` int(10) UNSIGNED NOT NULL,
  `migration` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `migrations`
--

INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
(43, '2014_10_12_000000_create_users_table', 1),
(44, '2014_10_12_100000_create_password_resets_table', 1),
(45, '2019_05_01_102000_create_categories_table', 1),
(46, '2019_05_05_012944_create_products_table', 1),
(47, '2019_05_05_021943_alter_column_pro_content_and_pro_title_seo_in_table_products', 1),
(48, '2019_05_07_075137_create_articles_table', 1),
(49, '2019_05_14_100138_create_contacts_table', 1),
(50, '2019_05_27_082917_create_transactions_table', 1),
(51, '2019_05_27_083015_create_orders_table', 1),
(52, '2019_05_27_084633_alter_column_pro_pay_in_table_products', 1),
(53, '2019_06_01_130041_create_ratings_table', 1),
(54, '2019_06_02_003724_alter_column_rating_in_table_products', 1),
(55, '2019_06_04_152044_create_admins_table', 1),
(56, '2019_06_08_082242_alter_column_c_home_in_table_categories', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quantrivien`
--

CREATE TABLE `quantrivien` (
  `id` int(10) UNSIGNED NOT NULL,
  `tenAdmin` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sodienthoai` char(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `hinhdaidien` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `hoatdong` tinyint(4) NOT NULL DEFAULT 1,
  `password` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nho_token` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `ngaycapnhap` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `quantrivien`
--

INSERT INTO `quantrivien` (`id`, `tenAdmin`, `email`, `sodienthoai`, `hinhdaidien`, `hoatdong`, `password`, `nho_token`, `ngaytao`, `ngaycapnhap`) VALUES
(1, 'KhaiNguyen', 'nngoc6215@gmail.com', NULL, NULL, 1, '$2y$10$ww.yP10iREmjmvccMdKAqeNBEB1AouOkh9T0wKAVrPlItxmCCjfr.', '4UXTAe8gMB96vtfqTcy1lqGy8rutXcPAuM4N9ACVNy4SBv3NlVCEMf6ArbX8', NULL, NULL),
(2, 'KhaiNguyen', 'khainguyenlevan@gmail.com', '0702750320', NULL, 1, '$2y$10$TKh8H1.PfQx37YgCzwiKb.KjNyWgaHb9cbcoQgdIVFlYg7B77UdFm', 'qTuSjyvXFl3C7jpBuI6RzoOYpNjEHFOuwqAhaGY5Ayfa7VWFuACBD6FtOKjy', NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ratings`
--

CREATE TABLE `ratings` (
  `id` int(10) UNSIGNED NOT NULL,
  `ra_sanpham_id` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `ra_sodanhgia` tinyint(4) NOT NULL DEFAULT 0,
  `ra_noidung` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ra_khachhang_id` int(11) UNSIGNED NOT NULL DEFAULT 0,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `ngaycapnhap` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `ratings`
--

INSERT INTO `ratings` (`id`, `ra_sanpham_id`, `ra_sodanhgia`, `ra_noidung`, `ra_khachhang_id`, `ngaytao`, `ngaycapnhap`) VALUES
(10, 14, 5, 'đẹp', 8, '2020-09-25 07:56:21', '2020-09-25 07:56:21'),
(11, 14, 5, 'tôt', 8, '2020-09-25 07:56:40', '2020-09-25 07:56:40');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `id` int(10) UNSIGNED NOT NULL,
  `pro_tensp` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `pro_nguoitao_id` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `pro_slug` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `pro_loaisanpham_id` int(10) UNSIGNED NOT NULL DEFAULT 0,
  `pro_dongia` int(11) NOT NULL DEFAULT 0,
  `pro_giamgia` int(11) NOT NULL DEFAULT 0,
  `pro_hoatdong` tinyint(4) NOT NULL DEFAULT 1,
  `pro_sphot` tinyint(4) NOT NULL DEFAULT 0,
  `pro_mota` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `pro_hinhdaidien` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `pro_tukhoa` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `ngaycapnhap` timestamp NULL DEFAULT NULL,
  `pro_tieude` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `pro_noidungsp` longtext COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `pro_spdaban` tinyint(4) NOT NULL DEFAULT 0,
  `pro_soluong` tinyint(4) NOT NULL DEFAULT 0,
  `pro_tongdanhgia` int(11) NOT NULL DEFAULT 0 COMMENT 'tong so danh gia',
  `pro_tongsodiemdanhgia` int(11) NOT NULL DEFAULT 0 COMMENT 'tong so diem danh gia'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`id`, `pro_tensp`, `pro_nguoitao_id`, `pro_slug`, `pro_loaisanpham_id`, `pro_dongia`, `pro_giamgia`, `pro_hoatdong`, `pro_sphot`, `pro_mota`, `pro_hinhdaidien`, `pro_tukhoa`, `ngaytao`, `ngaycapnhap`, `pro_tieude`, `pro_noidungsp`, `pro_spdaban`, `pro_soluong`, `pro_tongdanhgia`, `pro_tongsodiemdanhgia`) VALUES
(13, 'Internet Tivi Sony 40 inch KDL-40W650D', 1, 'canon-eos-200d-kiss-x9-kit-18-55mm-f4-56-stm', 1, 7999000, 0, 1, 1, 'Internet Tivi Sony 40 inch KDL-40W650D', '2020-01-10__z-nikon-d3400-frontleft-flashhh-jpg.jpg', NULL, '2020-01-10 05:28:55', '2020-09-24 11:44:39', 'Internet Tivi Sony', '<p>Internet Tivi Sony 40 inch KDL-40W650D</p><p>Giá thành: 7.999.000</p><p><em>Th&ocirc;ng số kỹ thuật:</em></p><ul><li>Tên sản phẩm: Internet Tivi Sony 40 inch KDL-40W650D</li><li>Xuất xứ: Nhật Bản</li><li>Loại tivi: Internet tivi</li><li>Kích thước màn hình: 40 Inch</li><li> Độ phân giải: Full HD</li><li>Kết nối: Wifi, HDMI, USB, LAN</li><li>Tổng công suất loa: 10 W</li> <li>Các ứng dụng sẵn có: Trình duyệt web, YouTube, Zing TV, Zing Mp3, NetFlix, FPT  Play, HTV Online, YAN TV, Opera TV Store</li><li>Phụ kiện đi kèm: Sách hướng dẫn, Remote, Chân đế, Adapter</li><li>Giá thành: 7.999.000</li></ul>', 1, 20, 2, 4),
(14, 'Smart Tivi Samsung 4K 55 inch UA55RU7200KXXV', 1, 'canon-eos-6d-mark-ii-body', 1, 11900000, 5, 1, 1, 'Smart Tivi Samsung 4K 55 inch UA55RU7200KXXV', '2020-01-10__sony-ilce6500kit-a6500-mirrorless-camera-withhh-1343713.jpg', NULL, '2020-01-10 05:31:23', '2020-09-25 07:56:40', 'Smart Tivi Samsung 4K 55 inch UA55RU7200KXXV', '<p>Smart Tivi Samsung 4K 55 inch UA55RU7200KXXV</p><p>Giá thành: 11.900.000</p><p><em>Th&ocirc;ng số kỹ thuật:</em></p><ul><li>Tên sản phẩm: Smart Tivi Samsung 4K 55 inch UA55RU7200KXXV</li><li>Xuất xứ: Việt Nam</li><li>Loại tivi: Smart tivi</li><li>Kích thước màn hình: 55 inch</li><li>Độ phân giải: Ultra HD 4K</li><li>Kết nối: Wifi, USB, LAN</li><li>Tổng công suất loa: 20 W</li><li>Các ứng dụng sẵn có: Trình duyệt web, YouTube, Netflix, Flix TV, FPT Play, Fim+</li><li>Phụ kiện đi kèm: Remote, sách hướng dẫn, chân đế</li><li>Giá thành: 11.900.000</li></ul>', 0, 100, 7, 26),
(15, 'Smart Tivi Sony 50 inch 50W660G Full HD', 1, 'canon-eos-3000d-kit-ef-s18-55mm-iii', 1, 11400000, 0, 1, 1, 'Smart Tivi Sony 50 inch 50W660G Full HD', '2020-01-10__3000dd-copy.jpg', NULL, '2020-01-10 05:35:04', '2020-01-10 06:38:46', 'Smart Tivi Sony 50 inch 50W660G Full HD', '<p>Smart Tivi Sony 50 inch 50W660G Full HD</p><p>Thông số kỹ thuật</p><li>Hệ điều hành, giao diệnLinux</li><li>Các ứng dụng sẵn cóYouTube, Trình duyệt web, Netflix, VEWD App Store</li><li>Các ứng dụng phổ biến có thể tải thêmFPT Play, Zing TV, Zing Mp3, Nhạc của tui, Netflix</li><li>Hỗ trợ điều khiển thông minhKhông</li><li>Điều khiển tivi bằng điện thoạiKhông</li><li>Kết nối không dây với điện thoại, máy tính bảngBằng Miracast (Screen Mirroring)</li><li>Kết nối Bàn phím, chuột </li></ul>', 0, 100, 1, 5),
(16, 'Smart Tivi Panasonic 43 inch 4K UHD TH-43FX600V', 1, 'canon-eos-5dsr-body', 1, 9890000, 10, 1, 1, 'Smart Tivi Panasonic 43 inch 4K UHD TH-43FX600V', '2020-01-10__d75000-copy.jpg', NULL, '2020-01-10 05:46:26', '2020-01-10 05:49:14', 'CANON EOS 5DSR BODY', '<p>&nbsp;Smart Tivi Panasonic 43 inch 4K UHD TH-43FX600V. Gi&aacute;: 9.890.000 BH 3 th&aacute;ng.</p><p>Thông số kỹ thuật của sản phẫm</p><ul><li>Tên sản phẩm: Smart Tivi Panasonic 43 inch 4K UHD TH-43FX600V</li><li>Xuất xứ: Nhật Bản</li><li>Loại tivi: Smart tivi</li><li>Kích thước màn hình: 43 inch</li><li>Độ phân giải: Ultra HD 4K (3840 x 2160</li><li>Kết nối: Wifi, USB, LAN, HDMI</li><li>Tổng công suất loa: 20 W</li><li>Các ứng dụng sẵn có: Trình duyệt web, Ngoisao.net, VNExpress, Sohoa</li><li>Phụ kiện đi kèm: Remote, Sách hướng dẫn</li><li>Giá thành: 9.890.000</li></ul>', 0, 100, 0, 0),
(17, 'Smart Tivi LG 4K 43 inch 43UM7300PTA', 1, 'canon-eos-5d-mark-iv-body', 1, 7999000, 0, 1, 1, 'Smart Tivi LG 4K 43 inch 43UM7300PTA', '2020-01-10__5dd-mk4.jpg', NULL, '2020-01-10 05:48:58', '2020-01-10 05:49:09', 'Smart Tivi LG 4K 43 inch 43UM7300PTA', '<p>Smart Tivi LG 4K 43 inch 43UM7300PTA</p><p>Thông số kỹ thuật của sản phẫm</p><ul><li>Tên sản phẩm: Internet Tivi Sony 40 inch KDL-40W650D</li><li>Xuất xứ: Nhật Bản</li><li>Loại tivi: Internet tivi</li><li>Kích thước màn hình: 40 Inch</li><li>Độ phân giải: Full HD</li><li>Kết nối: Wifi, HDMI, USB, LAN</li><li>Tổng công suất loa: 10 W</li><li>Các ứng dụng sẵn có: Trình duyệt web, YouTube, Zing TV, Zing Mp3, NetFlix, FPT Play, HTV Online, YAN TV, Opera TV Store</li><li>Phụ kiện đi kèm: Sách hướng dẫn, Remote, Chân đế, Adapter</li><li>Giá thành: 7.999.000</li></ul>', 0, 100, 0, 0),
(18, 'Smart Tivi LED Toshiba 49 inch 49L5650', 1, 'canon-eos-8000d-760d-len-18-55mm-stm', 1, 9190000, 0, 1, 1, ' Smart Tivi LED Toshiba 49 inch 49L5650', '2020-01-10__80dd.jpg', NULL, '2020-01-10 05:51:07', '2020-01-10 12:32:23', 'Smart Tivi LED Toshiba 49 inch 49L5650', '<p>Smart Tivi LED Toshiba 49 inch 49L5650</p>\\r\\n<p>Thông số kỹ thuật của sản phẫm </p>\\r\\n<ul><li>Tên sản phẩm: Smart Tivi LED Toshiba 49 inch 49L5650</li><li>Xuất xứ: Nhật Bản</li><li>Loại tivi: Smart simple tivi</li><li>Kích thước màn hình: 49 inch</li><li>Độ phân giải: Full HD</li><li>Kết nối: Wifi, USB, LAN, HDMI</li><li>Tổng công suất loa: 20 W</li><li>Các ứng dụng sẵn có: Trình duyệt web, YouTube, Facebook, Twitter</li><li>Phụ kiện đi kèm: Sách hướng dẫn, Remote, Chân đế</li><li>Giá thành: 9.190.000</li></ul>', 0, 101, 0, 0),
(19, 'Smart Tivi 4K Samsung 65 inch 65TU7000 Crystal UHD', 1, 'canon-eos-7d-mark-ii-body', 1, 25500000, 5, 1, 1, 'Smart Tivi 4K Samsung 65 inch 65TU7000 Crystal UHD', '2020-01-10__7d22-copy-jpg.jpg', NULL, '2020-01-10 05:52:50', '2020-01-10 05:54:45', 'Smart Tivi 4K Samsung 65 inch 65TU7000 Crystal UHD', '<p> Cảm biến CMOS APS-C 20.2MP</p><p>- Bộ xử l&yacute; h&igrave;nh ảnh Dual DIGIC 6</p><p>- M&agrave;n h&igrave;nh&nbsp;LCD&nbsp;Clear View II 3.0&quot; 1.04m-Dot</p><p>- Quay phim&nbsp;Full HD 1080p 60fps</p><p>- Tốc độ chụp li&ecirc;n tiếp l&ecirc;n đến 10fps</p><p>- Lấy n&eacute;t tự động theo pha 65 điểm</p><p>- ISO&nbsp;100-16000 (mở rộng đến 51200)</p><p>- Động cơ lấy n&eacute;t tự động&nbsp;Dual Pixel CMOS</p><p>-&nbsp;C&oacute; chế độ Live View</p><p>- Thiết kế th&acirc;n m&aacute;y với chất liệu hợp kim magi&ecirc;</p><p>- T&iacute;ch hợp đầu thu GPS v&agrave; la b&agrave;n kỹ thuật số</p>', 0, 110, 0, 0),
(20, 'Smart Tivi Samsung 4K 55 inch 55TU8500 Crystal UHD', 1, 'canon-eos-kiss-x7-100d-kit-18-55mm-is', 1, 20500000, 0, 1, 1, 'Smart Tivi Samsung 4K 55 inch 55TU8500 Crystal UHD', '2020-01-10__kiss-x77-zpsiac535hh.jpg', NULL, '2020-01-10 05:54:32', '2020-01-10 05:54:40', 'Smart Tivi Sam4K 55 inch 55TU8500 Crystal UHD', '<p>- Bản khởi đầu cho d&ograve;ng m&aacute;y DSLR nhỏ gọn nhất của Canon<br/>Cảm biến CMOS 18.0 MPs, bộ xử l&yacute; DIGIC V 14-Bit<br />- Hệ thống lấy n&eacute;t tự động thế hệ mới &#39;Hybrid CMOS AF II&#39;<br />- Tốc độ chụp li&ecirc;n tiếp 4 h&igrave;nh/gi&acirc;y, dải ISO 100-12.800<br />- Hệ thống đo s&aacute;ng iFCL 63 v&ugrave;ng ảnh<br />- Quay phim Full HD lấy n&eacute;t tự động theo chủ thể<br />- M&agrave;n h&igrave;nh cảm ứng 3&rdquo; l&ecirc;n tới 1.04 triệu điểm ảnh<br />- T&ecirc;n gọi kh&aacute;c: Canon 100D, Kiss X7,&nbsp;Rebel SL1</p>', 0, 0, 0, 0),
(21, 'Smart Tivi LED LG 55 inch 55UM7600PTA, 4K UHD, HDR', 1, 'canon-eos-r-body-mount', 1, 24900000, 0, 1, 1, 'Smart Tivi LED LG 55 inch 55UM7600PTA, 4K UHD, HDR', '2020-01-10__eosrgg-copy.jpg', NULL, '2020-01-10 05:56:31', '2020-01-10 05:56:38', 'Smart Tivi LED LG 55 inch 55UM7600PTA, 4K UHD, HDR', '<ul><li>- Cảm biến CMOS Full-Frame&nbsp;30.3MP&nbsp;</li><li>- Bộ xử l&yacute; h&igrave;nh ảnh DIGIC 8</li><li>- Quay phim UHD 4K30; xuất C-Log v&agrave; HDMI 10-Bit&nbsp;</li><li>- Hệ thống lấy n&eacute;t tự động Dual Pixel CMOS, 5655 điểm lấy n&eacute;t tự động</li><li>- K&iacute;nh ngắm điện tử OLED 3.69m-Dot&nbsp;</li>  <li>- M&agrave;n h&igrave;nh cảm ứng, xoay lật LCD 3.15&quot; 2.1m-Dot</li> <li>- ISO mở rộng đến 50-102400</li><li>- Chụp li&ecirc;n tiếp 8fps</li><li>- Kết nối Wi-Fi v&agrave; Bluetooth</li><li>- Khe thẻ nhớ SD UHS-II</li><li>- Thanh đa chức năng Multi-Function Bar, Dual Pixel RAW</li></ul>', 0, 100, 0, 0),
(22, 'Smart Tivi Sony 43 inch 43X7000G 4K Ultra HD', 1, 'canon-eos-750d-kiss-x8i-lens-18-55-is-stm', 1, 11900000, 0, 1, 1, 'Smart Tivi Sony 43 inch 43X7000G 4K Ultra HD', '2020-01-10__750daa.jpg', NULL, '2020-01-10 05:58:52', '2020-01-10 05:58:59', 'Smart Tivi Sony 43 inch 43X7000G 4K Ultra HD', '<p>Cảm biến thế hệ mới Hybrid CMOS APS-C 24.2MPs</p><p>Bộ xử l&yacute; DIGIC VI 14 bit, hệ thống AF 19 điểm</p><p>ISO tới 12.800, tốc độ chụp li&ecirc;n tiếp 5 h&igrave;nh/s</p><p>Hệ thống đo s&aacute;ng thế hệ mới iFCL 63 v&ugrave;ng ảnh</p><p>Quay phim Full HD với khả năng lấy n&eacute;t li&ecirc;n tục</p><p>Kết nối Wifi, NFC với c&aacute;c thiết di động th&ocirc;ng minh</p><p>M&agrave;n h&igrave;nh lật xoay cảm ứng 3.2&rdquo; l&ecirc;n tới 1.04 triệu pixels</p><p>T&ecirc;n gọi kh&aacute;c&nbsp;Kiss X8i / 750D / Rebel T6i</p>', 0, 100, 0, 0),
(23, 'Smart Tivi 4K 55 inch Sony KD-55X7500H HDR Android', 1, 'canon-eos-80d-body', 1, 19400000, 0, 1, 1, 'Smart Tivi 4K 55 inch Sony KD-55X7500H HDR Android', '2020-01-10__80ddd.jpg', NULL, '2020-01-10 06:00:40', '2020-01-10 06:00:50', 'Smart Tivi 4K 55 inch Sony KD-55X7500H HDR Android', '<p>- Canon EOS 80D body 1.5k shot đẹp như mới&nbsp;pin sạc d&acirc;y đeo c&aacute;p nối. BH 6 th&aacute;ng</p><p>- Len 18-135mm IS. Gi&aacute; 3tr2. BH 6 th&aacute;ng.</p><p>- Len 18-135mm IS STM. Gi&aacute; 4tr2. BH 6 th&aacute;ng.</p><p>- Len 18-135mm IS USM nano. Gi&aacute; 5tr8. BH 6 th&aacute;ng.</p><p>Canon EOS 80D, EOS 80D n&acirc;ng cấp t&iacute;nh năng từ chiếc 70D, nổi bật nhất l&agrave; việc trang bị hệ thống lấy n&eacute;t mới với 45 điểm c&ugrave;ng với Dual Pixel tr&ecirc;n cảm biến, quay phim Full HD 60fps tương đương EOS-1D X Mark II. kết nối Wi-Fi NFC, m&aacute;y sở hữu cảm biến 24.2MP với chip xử l&yacute; DIGIC 6, hiển thị tr&ecirc;n m&agrave;n h&igrave;nh cảm ứng LCD 3&rdquo; độ ph&acirc;n giải 1,04 triệu điểm ảnh.</p><p>&nbsp;</p><p>Th&ocirc;ng Số Kỹ Thuật</p><p>Bộ cảm biến ảnh CMOS 24.2 MP<br />nBộ xử l&yacute; ảnh DIGIC 6<br />Tốc độ m&agrave;n trập 1/8000 đến 30 gi&acirc;y<br />Tốc độ chụp li&ecirc;n tục tối đa 7.0 h&igrave;nh/gi&acirc;y<br />Điểm lấy n&eacute;t 45 điểm<br />K&iacute;ch thước m&agrave;n h&igrave;nh 3&quot;<br />\\r\\nLoại m&agrave;n h&igrave;nh (C&ocirc;ng nghệ m&agrave;n h&igrave;nh) LCD<br />Thẻ nhớ tương th&iacute;ch SD, SDHC, SDXC<br />nỐng k&iacute;nh Ống k&iacute;nh 18-55mm<br />nHỗ trợ định dạng JPEG, RAW</p>', 0, 100, 0, 0),
(24, 'Điện thoại iPhone 11 Pro Max 64GB', 2, 'sony-alpha-a6500-sony-e-18-135mm-f35-56-oss', 3, 33990000, 0, 1, 1, 'Điện thoại iPhone 11 Pro Max 64GB', '2020-01-10__1521828318000-13997899.jpg', NULL, '2020-01-10 05:28:55', '2020-09-24 11:44:39', 'Điện thoại iPhone 11 Pro Max 64GB', '<p>Điện thoại iPhone 11 Pro Max 64GB</p><p>Thông số kỹ thuật</p><ul><li>Màn hình: OLED, 6.5\\\", Super Retina XDR</li><li>Hệ điều hành: iOS 13</li><li>Camera sau:  3 camera 12 MP</li><li>Camera trước:  12 MP</li><li>CPU:  Apple A13 Bionic 6 nhân</li><li>RAM:  4 GB</li><li>Bộ nhớ trong:  64 GB</li><li>Thẻ SIM: eSIM & 1 Nano SIM, Hỗ trợ 4G</li><li>HOTSIM VNMB Siêu sim (5GB/ngày)</li><li>Dung lượng pin:  3969 mAh, có sạc nhanh</li></ul>', 0, 100, 0, 0),
(25, 'Điện thoại OPPO A92', 1, 'sony-cyber-shot-dsc-rx10-iv', 3, 21500000, 0, 1, 1, 'Điện thoại OPPO A92', '2020-01-10__1505225826000-img-8680533.jpg', NULL, NULL, NULL, 'Điện thoại OPPO A92', '<p>Điện thoại OPPO A92</p><p>Thông số kỹ thuật</p><ul><li>Màn hình:  TFT LCD, 6.5\\\", Full HD+</li><li>Hệ điều hành:  Android 10</li><li>Camera sau:  Chính 48 MP & Phụ 8 MP, 2 MP, 2 MP</li><li>Camera trước:  16 MP</li><li>CPU:  Snapdragon 665 8 nhân</li><li>RAM:  8 GB</li>\\r\\n<li>Bộ nhớ trong:  128 GB</li><li>Thẻ nhớ: MicroSD, hỗ trợ tối đa 256 GB</li><li>Thẻ SIM:\\r\\n2 Nano SIM, Hỗ trợ 4G</li><li>HOTSIM VNMB Siêu sim (5GB/ngày)</li><li>Dung lượng pin: 5000 mAh, có sạc nhanh</li></ul>', 0, 100, 0, 0),
(26, 'Điện thoại Samsung Galaxy A71', 1, 'sony-cyber-shot-dsc-rx10-iv', 3, 21500000, 0, 1, 1, 'Điện thoại OPPO A92', '2020-01-10__sony-ilce6500kit-a6500-mirrorless-camera-with-1343713.jpg', NULL, NULL, NULL, 'Điện thoại OPPO A92', '<p>Điện thoại OPPO A92</p><p>Thông số kỹ thuật</p><ul><li>Màn hình:  TFT LCD, 6.5\\\", Full HD+</li><li>Hệ điều hành:  Android 10</li><li>Camera sau:  Chính 48 MP & Phụ 8 MP, 2 MP, 2 MP</li><li>Camera trước:  16 MP</li><li>CPU:  Snapdragon 665 8 nhân</li><li>RAM:  8 GB</li>\\r\\n<li>Bộ nhớ trong:  128 GB</li><li>Thẻ nhớ: MicroSD, hỗ trợ tối đa 256 GB</li><li>Thẻ SIM:\\r\\n2 Nano SIM, Hỗ trợ 4G</li><li>HOTSIM VNMB Siêu sim (5GB/ngày)</li><li>Dung lượng pin: 5000 mAh, có sạc nhanh</li></ul>', 0, 100, 0, 0),
(27, 'Điện thoại Xiaomi Redmi Note 9', 1, 'sony-alpha-a7-r-mark-iii-body', 3, 4180000, 10, 1, 1, 'Điện thoại Xiaomi Redmi Note 9', '2020-01-10__a7r33-copy-jpg.jpg', NULL, '2020-01-10 05:28:55', '2020-09-24 11:44:39', 'Điện thoại Xiaomi Redmi Note 9', '<p>T&oacute;m tắt sản phẩm</p><p>- Bộ cảm biến FullFrame Back-illuminated CMOS 42.4 MP</p><p>- Chip BIONZ X xử l&yacute; nhanh v&agrave; mạnh hơn 1,8 lần</p><p>- Bộ đệm h&igrave;nh ảnh cho ph&eacute;p lưu li&ecirc;n tục 76 ảnh JPEG hoặc 28 ảnh RAW</p><p>- Chống rung 5 trục trong th&acirc;n&nbsp; m&aacute;y</p><p>- M&agrave;n h&igrave;nh LCD cảm ứng lật 3.0&rdquo; c&oacute; t&iacute;nh năng chạm lấy n&eacute;t trực tiếp</p><p>- Độ nhạy s&aacute;ng cao ISO 100 - 32.000 (mở rộng l&ecirc;n 102.000)</p><p>- Chụp li&ecirc;n tục 10 tấm/gi&acirc;y khi kh&oacute;a n&eacute;t bằng EVF v&agrave; 8 ảnh/gi&acirc;y ở Live View</p><p>- Hệ thống lấy n&eacute;t Fast Hybrid AF 399 điểm lấy n&eacute;t theo Pha, 425 điểm theo tương phản, nhanh hơn gấp 2 lần</p><p>- Tốc độ m&agrave;n trập 1/8000 - 30s</p><p>- Tốc độ ăn đ&egrave;n 1/250s</p><p>- K&iacute;nh ngắm XGA OLED phủ lớp coat Zeiss T* hiển thị thời gian thực, bao phủ 100% g&oacute;c nh&igrave;n</p><p>- Hệ thống đo s&aacute;ng th&ocirc;ng minh DRO</p><p>- Quay phim chuẩn 4K kh&ocirc;ng cần thiết bị ngoại vi</p><p>- Th&ecirc;m chế độ Hybrid Log-Gamma cho ph&eacute;p quay phim HDR</p><p>- Đa dạng m&agrave;u sắc với chức năng Picture Effect</p><p>- Pin Z giống A9 c&oacute; thời lượng sử dụng cao (hơn 400 tấm ảnh)</p><p>- 2 khe thẻ nhớ, trong đ&oacute; c&oacute; 1 khe chuẩn UHS - II</p><p>- Pin tương th&iacute;ch NP-FZ100</p>\'', 0, 100, 0, 0),
(28, 'Điện thoại OPPO Reno3', 1, 'sony-alpha-a7-r-mark-iii-body', 3, 4180000, 10, 1, 1, 'Điện thoại Xiaomi Redmi Note 9', '2020-01-10__a6300ee-copy.jpg', NULL, '2020-01-10 05:28:55', '2020-09-24 11:44:39', 'Điện thoại Xiaomi Redmi Note 9', '<p>T&oacute;m tắt sản phẩm</p><p>- Bộ cảm biến FullFrame Back-illuminated CMOS 42.4 MP</p><p>- Chip BIONZ X xử l&yacute; nhanh v&agrave; mạnh hơn 1,8 lần</p><p>- Bộ đệm h&igrave;nh ảnh cho ph&eacute;p lưu li&ecirc;n tục 76 ảnh JPEG hoặc 28 ảnh RAW</p><p>- Chống rung 5 trục trong th&acirc;n&nbsp; m&aacute;y</p><p>- M&agrave;n h&igrave;nh LCD cảm ứng lật 3.0&rdquo; c&oacute; t&iacute;nh năng chạm lấy n&eacute;t trực tiếp</p><p>- Độ nhạy s&aacute;ng cao ISO 100 - 32.000 (mở rộng l&ecirc;n 102.000)</p><p>- Chụp li&ecirc;n tục 10 tấm/gi&acirc;y khi kh&oacute;a n&eacute;t bằng EVF v&agrave; 8 ảnh/gi&acirc;y ở Live View</p><p>- Hệ thống lấy n&eacute;t Fast Hybrid AF 399 điểm lấy n&eacute;t theo Pha, 425 điểm theo tương phản, nhanh hơn gấp 2 lần</p><p>- Tốc độ m&agrave;n trập 1/8000 - 30s</p><p>- Tốc độ ăn đ&egrave;n 1/250s</p><p>- K&iacute;nh ngắm XGA OLED phủ lớp coat Zeiss T* hiển thị thời gian thực, bao phủ 100% g&oacute;c nh&igrave;n</p><p>- Hệ thống đo s&aacute;ng th&ocirc;ng minh DRO</p><p>- Quay phim chuẩn 4K kh&ocirc;ng cần thiết bị ngoại vi</p><p>- Th&ecirc;m chế độ Hybrid Log-Gamma cho ph&eacute;p quay phim HDR</p><p>- Đa dạng m&agrave;u sắc với chức năng Picture Effect</p><p>- Pin Z giống A9 c&oacute; thời lượng sử dụng cao (hơn 400 tấm ảnh)</p><p>- 2 khe thẻ nhớ, trong đ&oacute; c&oacute; 1 khe chuẩn UHS - II</p><p>- Pin tương th&iacute;ch NP-FZ100</p>\'', 0, 100, 0, 0),
(29, 'Điện thoại Samsung Galaxy A21s (6GB/64GB)', 1, 'sony-alpha-a7-r-mark-iii-body', 3, 4180000, 10, 1, 1, 'Điện thoại Xiaomi Redmi Note 9', '2020-01-10__14419611300000-1186034.jpg', NULL, '2020-01-10 05:28:55', '2020-09-24 11:44:39', 'Điện thoại Xiaomi Redmi Note 9', '<p>T&oacute;m tắt sản phẩm</p><p>- Bộ cảm biến FullFrame Back-illuminated CMOS 42.4 MP</p><p>- Chip BIONZ X xử l&yacute; nhanh v&agrave; mạnh hơn 1,8 lần</p><p>- Bộ đệm h&igrave;nh ảnh cho ph&eacute;p lưu li&ecirc;n tục 76 ảnh JPEG hoặc 28 ảnh RAW</p><p>- Chống rung 5 trục trong th&acirc;n&nbsp; m&aacute;y</p><p>- M&agrave;n h&igrave;nh LCD cảm ứng lật 3.0&rdquo; c&oacute; t&iacute;nh năng chạm lấy n&eacute;t trực tiếp</p><p>- Độ nhạy s&aacute;ng cao ISO 100 - 32.000 (mở rộng l&ecirc;n 102.000)</p><p>- Chụp li&ecirc;n tục 10 tấm/gi&acirc;y khi kh&oacute;a n&eacute;t bằng EVF v&agrave; 8 ảnh/gi&acirc;y ở Live View</p><p>- Hệ thống lấy n&eacute;t Fast Hybrid AF 399 điểm lấy n&eacute;t theo Pha, 425 điểm theo tương phản, nhanh hơn gấp 2 lần</p><p>- Tốc độ m&agrave;n trập 1/8000 - 30s</p><p>- Tốc độ ăn đ&egrave;n 1/250s</p><p>- K&iacute;nh ngắm XGA OLED phủ lớp coat Zeiss T* hiển thị thời gian thực, bao phủ 100% g&oacute;c nh&igrave;n</p><p>- Hệ thống đo s&aacute;ng th&ocirc;ng minh DRO</p><p>- Quay phim chuẩn 4K kh&ocirc;ng cần thiết bị ngoại vi</p><p>- Th&ecirc;m chế độ Hybrid Log-Gamma cho ph&eacute;p quay phim HDR</p><p>- Đa dạng m&agrave;u sắc với chức năng Picture Effect</p><p>- Pin Z giống A9 c&oacute; thời lượng sử dụng cao (hơn 400 tấm ảnh)</p><p>- 2 khe thẻ nhớ, trong đ&oacute; c&oacute; 1 khe chuẩn UHS - II</p><p>- Pin tương th&iacute;ch NP-FZ100</p>\'', 0, 100, 0, 0),
(30, 'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV', 2, 'nikon-d7000-kit-18-105mm-f35-56g-ed-vr', 2, 10190000, 0, 1, 1, 'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV', '2020-01-10__1-xdqm-e555.jpg', NULL, '2020-01-10 05:28:55', '2020-09-24 11:44:39', 'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV', '\'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV \', \'<p>- Cảm biến ảnh DX CMOS 16.2 Megapixels<br />- Bộ xử l&yacute; ảnh EXPEED II, ISO cao nhất tới 25,600<br />- Hệ thống lấy n&eacute;t tự động 3D-tracking AF 36 điểm<br />- Hệ thống đo s&aacute;ng hỗ trợ bởi cảm biến 3D Color Matrix<br />- Tốc độ chụp li&ecirc;n tiếp l&ecirc;n tới 6 h&igrave;nh/gi&acirc;y<br />- Quay phim Cinematic Full-HD 1080p &acirc;m thanh Stereo<br />- T&iacute;ch hợp hai hệ thống tự động l&agrave;m sạch cảm biến<br />- M&agrave;n h&igrave;nh 3&rdquo; Super-Density độ ph&acirc;n giải tới 921,000</p>', 0, 100, 0, 0),
(31, 'Máy giặt Toshiba Inverter 8.5 Kg TW-BH95S2V WK', 2, 'nikon-d7000-kit-18-105mm-f35-56g-ed-vr', 2, 10190000, 0, 1, 1, 'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV', '2020-01-10__z-nikon-d3400-frontleftt-flash-jpg.jpg', NULL, '2020-01-10 05:28:55', '2020-09-24 11:44:39', 'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV', '\'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV \', \'<p>- Cảm biến ảnh DX CMOS 16.2 Megapixels<br />- Bộ xử l&yacute; ảnh EXPEED II, ISO cao nhất tới 25,600<br />- Hệ thống lấy n&eacute;t tự động 3D-tracking AF 36 điểm<br />- Hệ thống đo s&aacute;ng hỗ trợ bởi cảm biến 3D Color Matrix<br />- Tốc độ chụp li&ecirc;n tiếp l&ecirc;n tới 6 h&igrave;nh/gi&acirc;y<br />- Quay phim Cinematic Full-HD 1080p &acirc;m thanh Stereo<br />- T&iacute;ch hợp hai hệ thống tự động l&agrave;m sạch cảm biến<br />- M&agrave;n h&igrave;nh 3&rdquo; Super-Density độ ph&acirc;n giải tới 921,000</p>', 0, 100, 0, 0),
(32, 'Máy giặt Electrolux Inverter 9 Kg EWF9025BQSA', 2, 'nikon-d7000-kit-18-105mm-f35-56g-ed-vr', 2, 10190000, 0, 1, 1, 'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV', '2020-01-10__fa-goldd.jpg', NULL, '2020-01-10 05:28:55', '2020-09-24 11:44:39', 'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV', '\'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV \', \'<p>- Cảm biến ảnh DX CMOS 16.2 Megapixels<br />- Bộ xử l&yacute; ảnh EXPEED II, ISO cao nhất tới 25,600<br />- Hệ thống lấy n&eacute;t tự động 3D-tracking AF 36 điểm<br />- Hệ thống đo s&aacute;ng hỗ trợ bởi cảm biến 3D Color Matrix<br />- Tốc độ chụp li&ecirc;n tiếp l&ecirc;n tới 6 h&igrave;nh/gi&acirc;y<br />- Quay phim Cinematic Full-HD 1080p &acirc;m thanh Stereo<br />- T&iacute;ch hợp hai hệ thống tự động l&agrave;m sạch cảm biến<br />- M&agrave;n h&igrave;nh 3&rdquo; Super-Density độ ph&acirc;n giải tới 921,000</p>', 0, 100, 0, 0),
(33, 'Máy giặt Samsung Inverter 8 kg WW80J52G0KW/SV', 2, 'nikon-d7000-kit-18-105mm-f35-56g-ed-vr', 2, 10190000, 0, 1, 1, 'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV', '2020-01-10__d7500000-copy.jpg', NULL, '2020-01-10 05:28:55', '2020-09-24 11:44:39', 'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV', '\'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV \', \'<p>- Cảm biến ảnh DX CMOS 16.2 Megapixels<br />- Bộ xử l&yacute; ảnh EXPEED II, ISO cao nhất tới 25,600<br />- Hệ thống lấy n&eacute;t tự động 3D-tracking AF 36 điểm<br />- Hệ thống đo s&aacute;ng hỗ trợ bởi cảm biến 3D Color Matrix<br />- Tốc độ chụp li&ecirc;n tiếp l&ecirc;n tới 6 h&igrave;nh/gi&acirc;y<br />- Quay phim Cinematic Full-HD 1080p &acirc;m thanh Stereo<br />- T&iacute;ch hợp hai hệ thống tự động l&agrave;m sạch cảm biến<br />- M&agrave;n h&igrave;nh 3&rdquo; Super-Density độ ph&acirc;n giải tới 921,000</p>', 0, 100, 0, 0),
(34, 'Máy giặt Panasonic Inverter 10.5 Kg NA-FD10AR1BV', 2, 'nikon-d7000-kit-18-105mm-f35-56g-ed-vr', 2, 10190000, 0, 1, 1, 'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV', '2020-01-10__p10000-copy-jpg.jpg', NULL, '2020-01-10 05:28:55', '2020-09-24 11:44:39', 'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV', '\'Máy giặt Samsung Inverter 9.5 kg WW95J42G0BX/SV \', \'<p>- Cảm biến ảnh DX CMOS 16.2 Megapixels<br />- Bộ xử l&yacute; ảnh EXPEED II, ISO cao nhất tới 25,600<br />- Hệ thống lấy n&eacute;t tự động 3D-tracking AF 36 điểm<br />- Hệ thống đo s&aacute;ng hỗ trợ bởi cảm biến 3D Color Matrix<br />- Tốc độ chụp li&ecirc;n tiếp l&ecirc;n tới 6 h&igrave;nh/gi&acirc;y<br />- Quay phim Cinematic Full-HD 1080p &acirc;m thanh Stereo<br />- T&iacute;ch hợp hai hệ thống tự động l&agrave;m sạch cảm biến<br />- M&agrave;n h&igrave;nh 3&rdquo; Super-Density độ ph&acirc;n giải tới 921,000</p>', 0, 100, 0, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` int(11) UNSIGNED NOT NULL,
  `name` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sodienthoai` char(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `hinhdaidien` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `diachi` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `active` tinyint(4) NOT NULL DEFAULT 1,
  `password` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nho_token` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ngaytao` timestamp NULL DEFAULT NULL,
  `ngaycapnhap` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `sodienthoai`, `hinhdaidien`, `diachi`, `active`, `password`, `nho_token`, `ngaytao`, `ngaycapnhap`) VALUES
(1, 'ngọc', 'ngoc@gmail.com', '0939847832', NULL, 'đà nẵng', 1, '$2y$10$ZN8rc5H2ybb41gS.iVb37O/Z8Q8UJkrv8xbzI.nsHK8vlQWI0em4K', 'jh8ucrRj0iv9bc63FQskiiFTNtwixD0Fs8WdJid4B6Xgss9iXUgDu5Je2tty', '2020-01-05 06:19:39', '2020-01-05 06:19:39'),
(2, 'ngọc', 'nngoc66@gmail.com', '0909093922', NULL, 'đà nẵng', 1, '$2y$10$sowTKr6XqzHTd4r4lpqp4Ob3F1k9Tvd.oOIdBUowOHEDSaAWDca5i', NULL, '2020-01-05 12:20:47', '2020-01-05 12:20:47'),
(3, 'ngọc', 'ruby@gmail.com', '0933879123', NULL, '634 núi thành', 1, '$2y$10$a0avEmXSWAl6Kvo5bEzmB.5EwQdN6OQ.UUb/nMIH69fwzExm4T89K', NULL, '2020-01-06 09:21:35', '2020-01-06 09:21:35'),
(4, 'ngọc', '98@gmail.com', '0931971444', NULL, 'đà nẵng', 1, '$2y$10$ZYFVClsWOTDN4CSRd3w61uji9GEQiJYlbVwGxYTX4wxvWkvk0tRXi', NULL, '2020-01-07 21:02:28', '2020-01-07 21:02:28'),
(5, 'Nguyễn Thị Nhung', 'nhung002@gmail.com', '0905123123', NULL, 'Đà Nẵng', 1, '$2y$10$PVVhECbiJHWut858BYuGhO7TvjR2wxVeymnZz2pL6Hcd0/Asl7Kgu', NULL, '2020-01-08 01:00:07', '2020-01-08 01:00:07'),
(6, 'Vân Trần', 'vantran@gmail.com', '0374927171', NULL, 'Quảng Trị', 1, '$2y$10$g.pzSUXoz2Q1eO2JqC.dueMTTBD4ifQHB1BVGNSwughRP9Rl.ird6', 'JHCaSDWzKwyeAXSFBPZyOy0Nfs71FMl1Kx02tGqA1ErQ92JF1tgPIYpahujj', '2020-01-10 18:16:35', '2020-01-10 18:16:35'),
(7, 'nngoc6215@gmail.com', 'nngoc6215@gmail.com', '0702750320', NULL, 'TP. Đà Nẵng', 1, '$2y$10$iCQIC.hHZvUPfPlWl8z8De8gWQv4bt.GJDebrQztJVU5K3b/IS/Sm', 'IQlA2hSetuZlCN1DB37OcIsBwzqUiDBuzUpcb6SFuynglUETith39dHNwqFN', '2020-09-16 00:22:41', '2020-09-16 00:22:41'),
(8, 'khainguyen123', 'khainguyen123@gmail.com', '0702750320', NULL, 'TP. Đà Nẵng', 1, '$2y$10$vCyxTcD336osaPaDkEnHle6hi5Br6M/eQqwfOa6shdTix1r79g/b2', 'uIygmiqolFKKcSx2DIHa6uaNtR7ZaTpzV86q5De6usjHtJ6EEs2HCBE2axVz', '2020-09-25 07:55:39', '2020-09-25 07:55:39'),
(9, 'Minh Le', 'minhle@gmail.com', '0702750320', NULL, 'TP. Đà Nẵng', 1, '$2y$10$t/L5eBDkb6HSFTFwfdCI2eNji74T7Cx6fBGLqo3OyOcQ//V/iHRc2', NULL, '2020-09-25 08:00:49', '2020-09-25 08:00:49'),
(10, 'MinhLe', 'minhle123@gmail.com', '0702750320', NULL, 'TP. Đà Nẵng', 1, '$2y$10$DFAZfUuNx8wtV7.gNWJrDevhVVVUB4h2e3KxGD37g5djU7t4qFjU6', NULL, '2020-09-25 08:01:47', '2020-09-25 08:01:47');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `baiviet`
--
ALTER TABLE `baiviet`
  ADD PRIMARY KEY (`id`),
  ADD KEY `articles_a_slug_index` (`a_slug`),
  ADD KEY `articles_a_active_index` (`a_hoatdong`),
  ADD KEY `articles_a_author_id_index` (`a_nguoiviet_id`);

--
-- Chỉ mục cho bảng `chitietdonhang`
--
ALTER TABLE `chitietdonhang`
  ADD PRIMARY KEY (`id`),
  ADD KEY `orders_or_transaction_id_index` (`or_donhang_id`),
  ADD KEY `orders_or_product_id_index` (`or_sanpham_id`);

--
-- Chỉ mục cho bảng `datlaimatkhau`
--
ALTER TABLE `datlaimatkhau`
  ADD KEY `password_resets_email_index` (`email`);

--
-- Chỉ mục cho bảng `donhang`
--
ALTER TABLE `donhang`
  ADD PRIMARY KEY (`id`),
  ADD KEY `transactions_tr_user_id_index` (`tr_khachhang_id`),
  ADD KEY `transactions_str_status_index` (`str_trangthaidonhang`);

--
-- Chỉ mục cho bảng `lienhe`
--
ALTER TABLE `lienhe`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `loaisanpham`
--
ALTER TABLE `loaisanpham`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `categories_c_name_unique` (`c_ten`),
  ADD KEY `categories_c_slug_index` (`c_slug`),
  ADD KEY `categories_c_active_index` (`c_hienthi`),
  ADD KEY `categories_c_home_index` (`c_noibat`);

--
-- Chỉ mục cho bảng `migrations`
--
ALTER TABLE `migrations`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `quantrivien`
--
ALTER TABLE `quantrivien`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `admins_email_unique` (`email`),
  ADD KEY `admins_active_index` (`hoatdong`);

--
-- Chỉ mục cho bảng `ratings`
--
ALTER TABLE `ratings`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ratings_ra_product_id_index` (`ra_sanpham_id`),
  ADD KEY `ratings_ra_user_id_index` (`ra_khachhang_id`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`id`),
  ADD KEY `products_pro_author_id_index` (`pro_nguoitao_id`),
  ADD KEY `products_pro_slug_index` (`pro_slug`),
  ADD KEY `products_pro_category_id_index` (`pro_loaisanpham_id`),
  ADD KEY `products_pro_active_index` (`pro_hoatdong`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `users_email_unique` (`email`),
  ADD KEY `users_active_index` (`active`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `baiviet`
--
ALTER TABLE `baiviet`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `chitietdonhang`
--
ALTER TABLE `chitietdonhang`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT cho bảng `donhang`
--
ALTER TABLE `donhang`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT cho bảng `lienhe`
--
ALTER TABLE `lienhe`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `loaisanpham`
--
ALTER TABLE `loaisanpham`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT cho bảng `quantrivien`
--
ALTER TABLE `quantrivien`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `ratings`
--
ALTER TABLE `ratings`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `baiviet`
--
ALTER TABLE `baiviet`
  ADD CONSTRAINT `baiviet_ibfk_1` FOREIGN KEY (`a_nguoiviet_id`) REFERENCES `quantrivien` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `chitietdonhang`
--
ALTER TABLE `chitietdonhang`
  ADD CONSTRAINT `chitietdonhang_ibfk_1` FOREIGN KEY (`or_sanpham_id`) REFERENCES `sanpham` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `chitietdonhang_ibfk_2` FOREIGN KEY (`or_donhang_id`) REFERENCES `donhang` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `donhang`
--
ALTER TABLE `donhang`
  ADD CONSTRAINT `donhang_ibfk_1` FOREIGN KEY (`tr_khachhang_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `ratings`
--
ALTER TABLE `ratings`
  ADD CONSTRAINT `ratings_ibfk_1` FOREIGN KEY (`ra_sanpham_id`) REFERENCES `sanpham` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ratings_ibfk_2` FOREIGN KEY (`ra_khachhang_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `sanpham_ibfk_1` FOREIGN KEY (`pro_loaisanpham_id`) REFERENCES `loaisanpham` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sanpham_ibfk_2` FOREIGN KEY (`pro_nguoitao_id`) REFERENCES `quantrivien` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
