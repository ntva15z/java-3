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
	MATIEUCHUAN VARCHAR(10), FOREIGN KEY(MATIEUCHUAN)REFERENCES TIEUCHUAN (MATIEUCHUAN)
)
SELECT*FROM dbo.HOCSINH
SELECT*FROM dbo.TIEUCHUAN
go

insert into TIEUCHUAN values('TC01', 100)
insert into TIEUCHUAN values('TC02', 150)
insert into TIEUCHUAN values('TC03', 200)
go


insert into HOCSINH values('HS01', N'Nguyen Huy Hoang', N'Hà Nam', N'null', '0395552458', 'TC01')
insert into HOCSINH values('HS02', N'Nguyen Thanh Dong', N'Hà Nội', N'Nguyễn Văn Dai', '0124556559', 'TC02')
insert into HOCSINH values('HS03', N'Nguyen Phuong Nhat', N'Hà Nội', N'Lê Văn Chien', '0966666321', 'TC03')

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

