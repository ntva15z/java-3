CREATE DATABASE HDBH
GO
USE HDBH
GO

IF OBJECT_ID('Hoadon') IS NOT NULL
DROP TABLE Hoadon
GO
CREATE TABLE Hoadon
(
	MaHD int NOT NULL,
	NgayBan DATETIME NULL DEFAULT (GETDATE()),
	MaNV NVARCHAR(50) NOT NULL,
	TenNV NVARCHAR(50) NOT NULL,
	MaKH NVARCHAR(50) NOT NULL,
	TenKH NVARCHAR(50) NOT NULL,
	DiaChi NVARCHAR(100) NOT NULL,
	DienThoai NVARCHAR(10) NULL,
	PRIMARY KEY(MaHD)

)
GO

IF OBJECT_ID('Hoadonchitiet') IS NOT NULL
DROP TABLE Hoadonchitiet
GO
CREATE TABLE Hoadonchitiet
(
	MaHD INT NOT NULL,
	MaHDCT INT IDENTITY(1,1),
	MaHang NVARCHAR(10) NOT NULL,
	TenHang NVARCHAR(50) NOT NULL,
	DonGia FLOAT NOT NULL,
	SoLuong INT NOT NULL,
	PRIMARY KEY(MaHDCT),
	FOREIGN KEY(MaHD) REFERENCES dbo.Hoadon(MaHD)
)
GO

DELETE dbo.Hoadon
INSERT INTO Hoadon VALUES(1,'05/06/2019','NV01','Nguyen Huy Hoang','KH01','Le Thi Kim','Thanh Hoa','0985224900')
INSERT INTO Hoadon VALUES(2,'05/06/2019','NV02','Nguyen Thanh Dong','KH02','Le Thi Hoa','Thanh Hoa','0985225225')
INSERT INTO Hoadon VALUES(3,'05/06/2019','NV03','Nguyen The Quan','KH02','Le Thi Thuy','Thanh Hoa','0985228888')
INSERT INTO Hoadon VALUES(4,'05/06/2019','NV03','Nguyen Tien Dat','KH01','Le Thi Kim','Thanh Hoa','0985228888')

DELETE dbo.Hoadonchitiet
INSERT INTO Hoadonchitiet VALUES(1,'H01','Coca cola',10000,2)
INSERT INTO Hoadonchitiet VALUES(1,'H01','Pepsi',10000,2)
INSERT INTO Hoadonchitiet VALUES(2,'H02','Coca cola',10000,2)
INSERT INTO Hoadonchitiet VALUES(2,'H02','Pepsi',10000,2)
INSERT INTO Hoadonchitiet VALUES(3,'H03','Coca cola',10000,2)
SELECT * FROM dbo.Hoadon
SELECT * FROM dbo.Hoadonchitiet

SELECT  MaHang,TenHang,DonGia,SoLuong, (DonGia * SoLuong) AS ThanhTien

FROM dbo.Hoadonchitiet INNER JOIN dbo.Hoadon ON Hoadon.MaHD = Hoadonchitiet.MaHD
WHERE Hoadon.MaHD = Hoadonchitiet.MaHD

SELECT MaHang,TenHang,DonGia,SoLuong, (DonGia*SoLuong) AS ThanhTien
FROM dbo.Hoadon INNER JOIN dbo.Hoadonchitiet ON Hoadonchitiet.MaHD = Hoadon.MaHD
WHERE Hoadon.MaHD LIKE 1

