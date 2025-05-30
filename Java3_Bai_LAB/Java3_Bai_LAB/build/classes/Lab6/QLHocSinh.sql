create database QLHocSinh
go

USE QLHocSinh
go

create table TIEUCHUAN
(
	MATIEUCHUAN VARCHAR(10) PRIMARY KEY,
	PHI INT
)
go

create table HOCSINH
(
	MAHOCSINH VARCHAR(10) PRIMARY KEY,
	TENHOCSINH NVARCHAR(50),
	DIACHI NVARCHAR(50),
	TENCHAME NVARCHAR(50),
	DIENTHOAI VARCHAR(10),
	MATIEUCHUAN VARCHAR(10) REFERENCES TIEUCHUAN (MATIEUCHUAN)
)
SELECT*FROM dbo.HOCSINH
SELECT*FROM dbo.TIEUCHUAN
go

insert into TIEUCHUAN values('TC01', 100)
insert into TIEUCHUAN values('TC02', 150)
insert into TIEUCHUAN values('TC03', 200)
go


insert into HOCSINH values('HS01', N'Lại Tuấn Khương', N'Hà Nam', N'null', '0392792458', 'TC01')
insert into HOCSINH values('HS02', N'Nguyễn Văn A', N'Hà Nội', N'Nguyễn Văn A1', '0123456789', 'TC02')
insert into HOCSINH values('HS03', N'Lê Thị B', N'Hà Nội', N'Lê Văn B1', '0987654321', 'TC03')

DELETE FROM dbo.TIEUCHUAN
DELETE FROM dbo.HOCSINH
go

update TIEUCHUAN
set PHI = 150
where MATIEUCHUAN = 'tc02'

update HOCSINH 
set DIACHI = '', 
TENCHAME = '', 
DIENTHOAI = '', 
MATIEUCHUAN = 'tc03' 
where MAHOCSINH = 'hs03'

select HOCSINH.*, PHI
from HOCSINH, TIEUCHUAN
where HOCSINH.MATIEUCHUAN = TIEUCHUAN.MATIEUCHUAN

