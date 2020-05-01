create database Lab5
go

USE Lab5
go

create table SINHVIEN
(
	MASV VARCHAR(10) PRIMARY KEY NOT NULL,
	HOTEN NVARCHAR(50),
	EMAIL VARCHAR(50),
	SDT VARCHAR(10),
	GIOITINH BIT,
	DIACHI NVARCHAR(50)
)
go

INSERT INTO SINHVIEN VALUES('SV01', N'Lại Tuấn Khương', 'khươnglt@fpt.edu.vn', '0392792458', 1, N'hà nam')
INSERT INTO SINHVIEN VALUES('SV02', N'Nguyễn Thị Hồng', 'hongnt6@fpt.edu.vn', '0741852963', 0, N'hà nội')
INSERT INTO SINHVIEN VALUES('SV03', N'Đoàn Nguyên Phú', 'phudn123@gmail.com', '0789456123', 1, N'nghệ an')
INSERT INTO SINHVIEN VALUES('SV04', N'Đinh Hoàng Hiếu', 'hieudh741@gmail.com', '0951753456', 1, N'TPHCM')
INSERT INTO SINHVIEN VALUES('SV05', N'Lê Hoàng Phúc', 'phuclt@fpt.edu.vn', '0123654789', 1, N'quảng nam')
GO
SELECT*FROM dbo.SINHVIEN