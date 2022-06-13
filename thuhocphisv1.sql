-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 04, 2022 lúc 07:15 PM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `thuhocphisv1`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sinhvien`
--

CREATE TABLE `sinhvien` (
  `hoten` varchar(500) NOT NULL,
  `ngaysinh` date NOT NULL,
  `gioitinh` char(10) NOT NULL,
  `quequan` varchar(500) NOT NULL,
  `sdt` int(100) NOT NULL,
  `gmail` varchar(50) NOT NULL,
  `malop` char(100) NOT NULL,
  `congno` int(100) NOT NULL,
  `password` varchar(500) NOT NULL,
  `masv` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `sinhvien`
--

INSERT INTO `sinhvien` (`hoten`, `ngaysinh`, `gioitinh`, `quequan`, `sdt`, `gmail`, `malop`, `congno`, `password`, `masv`) VALUES
('Nam', '2022-06-04', 'Nam', 'Phú Yên', 1513242, 'namnguyen@gmail.com', '1', -24300000, 'Nam2020', 1),
('Hiếu', '2001-05-05', 'Nam', 'Hà nam', 123, 'àasfsfafaf', '10', -63100000, 'Hiếu2020', 16),
('4', '2001-05-05', 'Nam', '4', 4, '4', '10', -63100000, '42020', 17),
('156', '2020-06-17', 'Nam', 'PH', 1245556, 'hhhhhhh', '1', -58600000, '1562020', 20),
('Đông', '2001-07-17', 'Nam', 'Hà Tĩnh', 123456789, 'pxd@gmail.com', '-1', 1800000, 'Đông2022', 23);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`masv`),
  ADD KEY `malop` (`malop`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `sinhvien`
--
ALTER TABLE `sinhvien`
  MODIFY `masv` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
