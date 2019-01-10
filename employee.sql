-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 10, 2019 lúc 04:32 AM
-- Phiên bản máy phục vụ: 10.1.37-MariaDB
-- Phiên bản PHP: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `employee`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dantoc`
--

CREATE TABLE `dantoc` (
  `maDT` int(11) NOT NULL,
  `tenDT` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `dantoc`
--

INSERT INTO `dantoc` (`maDT`, `tenDT`) VALUES
(1, 'Kinh'),
(2, 'Hoa'),
(3, 'Thái'),
(4, 'Chăm'),
(5, 'Mường');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giadinh`
--

CREATE TABLE `giadinh` (
  `maGD` int(11) NOT NULL,
  `loaiGD` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `giadinh`
--

INSERT INTO `giadinh` (`maGD`, `loaiGD`) VALUES
(1, ' '),
(2, 'Công nhân'),
(3, 'Nông dân'),
(4, 'Công chức'),
(5, 'Tiểu thương');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `gioitinh`
--

CREATE TABLE `gioitinh` (
  `maGT` int(11) NOT NULL,
  `loaiGT` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `gioitinh`
--

INSERT INTO `gioitinh` (`maGT`, `loaiGT`) VALUES
(1, 'Nam'),
(2, 'Nữ');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `honnhan`
--

CREATE TABLE `honnhan` (
  `maHN` int(11) NOT NULL,
  `loaiHN` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `honnhan`
--

INSERT INTO `honnhan` (`maHN`, `loaiHN`) VALUES
(1, ' '),
(2, 'Độc thân'),
(3, 'Đã kết hôn');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khoa`
--

CREATE TABLE `khoa` (
  `maKhoa` int(11) NOT NULL,
  `tenKhoa` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `khoa`
--

INSERT INTO `khoa` (`maKhoa`, `tenKhoa`) VALUES
(1, ' '),
(2, 'Kế toán'),
(3, 'Công nghệ thông tin'),
(4, 'Quản trị kinh doanh');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `namtotnghiep`
--

CREATE TABLE `namtotnghiep` (
  `maNam` int(11) NOT NULL,
  `nam` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `namtotnghiep`
--

INSERT INTO `namtotnghiep` (`maNam`, `nam`) VALUES
(1, 0),
(2, 2005),
(3, 2006),
(4, 2007),
(5, 2008),
(6, 2009),
(7, 2010),
(8, 2011),
(9, 2012),
(10, 2013),
(11, 2014),
(12, 2015),
(13, 2016),
(14, 2017);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nganh`
--

CREATE TABLE `nganh` (
  `maNganh` int(11) NOT NULL,
  `tenNganh` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nganh`
--

INSERT INTO `nganh` (`maNganh`, `tenNganh`) VALUES
(1, ' '),
(2, 'Công nghệ phần phềm'),
(3, 'IoT'),
(4, 'Kiểm thử phần mềm'),
(5, 'Kinh doanh quốc tế'),
(6, 'Tài chính thương mại');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nghe`
--

CREATE TABLE `nghe` (
  `maNghe` int(11) NOT NULL,
  `tenNghe` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `nghe`
--

INSERT INTO `nghe` (`maNghe`, `tenNghe`) VALUES
(1, ''),
(2, 'Lập trình viên'),
(3, 'Doanh nhân'),
(4, 'Hướng dẫn viên');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `noidaotao`
--

CREATE TABLE `noidaotao` (
  `maNoidaotao` int(11) NOT NULL,
  `tenNoidaotao` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `noidaotao`
--

INSERT INTO `noidaotao` (`maNoidaotao`, `tenNoidaotao`) VALUES
(1, ''),
(2, 'Đại học Công nghệ TP.HCM'),
(3, 'Đại học Hồng Bàng'),
(4, 'Đại học Tôn Đức Thắng'),
(5, 'Đại học FPT'),
(6, 'Đại học Bách Khoa TP.HCM');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quoctich`
--

CREATE TABLE `quoctich` (
  `maQT` int(11) NOT NULL,
  `tenQT` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `quoctich`
--

INSERT INTO `quoctich` (`maQT`, `tenQT`) VALUES
(1, 'Việt Nam'),
(2, 'USA'),
(3, 'Canada'),
(4, 'Singapore'),
(5, 'Nhật Bản'),
(6, 'Hàn Quốc'),
(7, 'Trung Quốc');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thanhpho`
--

CREATE TABLE `thanhpho` (
  `maTP` int(11) NOT NULL,
  `tenTP` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `thanhpho`
--

INSERT INTO `thanhpho` (`maTP`, `tenTP`) VALUES
(1, 'TP.Hồ Chí Minh'),
(2, 'Hà Nội'),
(3, 'Đà Nẵng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thongtin`
--

CREATE TABLE `thongtin` (
  `maNV` int(11) NOT NULL,
  `maCC` int(11) NOT NULL,
  `hovadem` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hovaten` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ten` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ngaysinh` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gioitinh` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `noisinh` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nguyenquan` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cmnd` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngaycap` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `noicapcmnd` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sohc` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngaycaphc` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngayhethanhc` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `noicaphc` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `honnhan` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `giadinh` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dantoc` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tongiao` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `quoctich` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `vanhoa` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `daotao` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `noidaotao` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `khoa` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nganh` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `namtotnghiep` int(11) NOT NULL,
  `xeploai` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nghe` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `thanhpho` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `thongtin`
--

INSERT INTO `thongtin` (`maNV`, `maCC`, `hovadem`, `hovaten`, `ten`, `ngaysinh`, `gioitinh`, `noisinh`, `nguyenquan`, `cmnd`, `ngaycap`, `noicapcmnd`, `sohc`, `ngaycaphc`, `ngayhethanhc`, `noicaphc`, `honnhan`, `giadinh`, `dantoc`, `tongiao`, `quoctich`, `vanhoa`, `daotao`, `noidaotao`, `khoa`, `nganh`, `namtotnghiep`, `xeploai`, `nghe`, `thanhpho`) VALUES
(1, 1, 'Trịnh An', 'Trịnh An Khang', 'Khang', '17-04-1997', 'Nam', 'Hồ Chí Minh', 'Nam Định', '123456789', '01-09-2019', 'HCM', '0', '01-09-2019', '31-09-2019', 'HCM', 'Độc thân', 'Công nhân', 'Kinh', 'không', 'Việt Nam', '12', 'Đại học', 'Đại học Công nghệ TP.HCM', 'Công nghệ thông tin', 'Công nghệ phân phềm', 2017, 'Giỏi', 'Lập trình viên', 'TP.Hồ Chí Minh'),
(2, 2, 'Nguyen Van', 'Nguyen Van Binh', 'Binh', '1995-00-?19', 'Nam', 'HCM', 'HCM', '123456789', '2012-00-?19', 'HCM', '12', '2019-00-?1', '2019-18-?31', 'HCM', '??c thân', 'Công nhân', 'Kinh', 'không', 'Vi?t Nam', '12', 'Trung h?c ph? thông', '??i h?c Công ngh? TP.HCM', 'Công ngh? thông tin', 'Công ngh? ph?n ph?m', 2006, 'Trung bình', 'Doanh nhân', 'TP.H? Chí Minh'),
(3, 3, '', 'TAKhang', 'Khang', '2019-31-01', 'Nam', 'HCM', 'HCM', '123456', '2019-00-01', 'HCM', '12', '2019-00-01', '2019-31-31', 'HCM', '??c thân', 'Công nhân', 'Kinh', 'không', 'Vi?t Nam', '12', 'Trung h?c ph? thông', '??i h?c Công ngh? TP.HCM', 'K? toán', 'Công ngh? ph?n ph?m', 2005, 'Gi?i', 'L?p trình viên', 'TP.H? Chí Minh'),
(4, 4, 'Nguyen doan', 'nguyen doan phan', 'phan', '1996-00-24', 'Nam', 'HCM', 'HCM', '123', '2019-16-01', 'HCM', '1', '2019-00-01', '2019-16-31', 'HCM', '??c thân', 'Công nhân', 'Kinh', 'không', 'Vi?t Nam', '12', 'Trung h?c ph? thông', '??i h?c Công ngh? TP.HCM', 'Công ngh? thông tin', 'Công ngh? ph?n ph?m', 2017, 'Khá', 'L?p trình viên', 'TP.H? Chí Minh'),
(5, 5, 'Nguyen van', 'nguyen van hau', 'hau', '2019-21-01', 'Nữ', 'HCM', 'HCM', '123', '2019-21-01', 'HCM', '1', '2019-21-01', '2019-21-01', 'HCM', '??c thân', 'Công nhân', 'Kinh', 'không', 'Vi?t Nam', '12', 'Cao ??ng', '??i h?c H?ng Bàng', 'K? toán', 'Công ngh? ph?n ph?m', 2005, 'Gi?i', 'L?p trình viên', 'TP.H? Chí Minh');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tongiao`
--

CREATE TABLE `tongiao` (
  `maTG` int(11) NOT NULL,
  `tenTG` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tongiao`
--

INSERT INTO `tongiao` (`maTG`, `tenTG`) VALUES
(1, 'không'),
(2, 'Thiên Chúa giáo'),
(3, 'Đạo Phật');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `trinhdodaotao`
--

CREATE TABLE `trinhdodaotao` (
  `maTrinhdo` int(11) NOT NULL,
  `ten` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `trinhdodaotao`
--

INSERT INTO `trinhdodaotao` (`maTrinhdo`, `ten`) VALUES
(1, ''),
(2, 'Trung học phổ thông'),
(3, 'Cao đẳng'),
(4, 'Đại học');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `xeploai`
--

CREATE TABLE `xeploai` (
  `maLoai` int(11) NOT NULL,
  `loai` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `xeploai`
--

INSERT INTO `xeploai` (`maLoai`, `loai`) VALUES
(1, ''),
(2, 'Giỏi'),
(3, 'Khá'),
(4, 'Trung bình');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `dantoc`
--
ALTER TABLE `dantoc`
  ADD PRIMARY KEY (`maDT`);

--
-- Chỉ mục cho bảng `giadinh`
--
ALTER TABLE `giadinh`
  ADD PRIMARY KEY (`maGD`);

--
-- Chỉ mục cho bảng `gioitinh`
--
ALTER TABLE `gioitinh`
  ADD PRIMARY KEY (`maGT`);

--
-- Chỉ mục cho bảng `honnhan`
--
ALTER TABLE `honnhan`
  ADD PRIMARY KEY (`maHN`);

--
-- Chỉ mục cho bảng `khoa`
--
ALTER TABLE `khoa`
  ADD PRIMARY KEY (`maKhoa`);

--
-- Chỉ mục cho bảng `namtotnghiep`
--
ALTER TABLE `namtotnghiep`
  ADD PRIMARY KEY (`maNam`);

--
-- Chỉ mục cho bảng `nganh`
--
ALTER TABLE `nganh`
  ADD PRIMARY KEY (`maNganh`);

--
-- Chỉ mục cho bảng `nghe`
--
ALTER TABLE `nghe`
  ADD PRIMARY KEY (`maNghe`);

--
-- Chỉ mục cho bảng `noidaotao`
--
ALTER TABLE `noidaotao`
  ADD PRIMARY KEY (`maNoidaotao`);

--
-- Chỉ mục cho bảng `quoctich`
--
ALTER TABLE `quoctich`
  ADD PRIMARY KEY (`maQT`);

--
-- Chỉ mục cho bảng `thanhpho`
--
ALTER TABLE `thanhpho`
  ADD PRIMARY KEY (`maTP`);

--
-- Chỉ mục cho bảng `thongtin`
--
ALTER TABLE `thongtin`
  ADD PRIMARY KEY (`maNV`);

--
-- Chỉ mục cho bảng `tongiao`
--
ALTER TABLE `tongiao`
  ADD PRIMARY KEY (`maTG`);

--
-- Chỉ mục cho bảng `trinhdodaotao`
--
ALTER TABLE `trinhdodaotao`
  ADD PRIMARY KEY (`maTrinhdo`);

--
-- Chỉ mục cho bảng `xeploai`
--
ALTER TABLE `xeploai`
  ADD PRIMARY KEY (`maLoai`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `dantoc`
--
ALTER TABLE `dantoc`
  MODIFY `maDT` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `giadinh`
--
ALTER TABLE `giadinh`
  MODIFY `maGD` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `gioitinh`
--
ALTER TABLE `gioitinh`
  MODIFY `maGT` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `honnhan`
--
ALTER TABLE `honnhan`
  MODIFY `maHN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `khoa`
--
ALTER TABLE `khoa`
  MODIFY `maKhoa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `namtotnghiep`
--
ALTER TABLE `namtotnghiep`
  MODIFY `maNam` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT cho bảng `nganh`
--
ALTER TABLE `nganh`
  MODIFY `maNganh` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `nghe`
--
ALTER TABLE `nghe`
  MODIFY `maNghe` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `noidaotao`
--
ALTER TABLE `noidaotao`
  MODIFY `maNoidaotao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `quoctich`
--
ALTER TABLE `quoctich`
  MODIFY `maQT` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT cho bảng `thanhpho`
--
ALTER TABLE `thanhpho`
  MODIFY `maTP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `tongiao`
--
ALTER TABLE `tongiao`
  MODIFY `maTG` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `trinhdodaotao`
--
ALTER TABLE `trinhdodaotao`
  MODIFY `maTrinhdo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `xeploai`
--
ALTER TABLE `xeploai`
  MODIFY `maLoai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
