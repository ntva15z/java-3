create database QLSach
go

use QLSach
go

create table SACH
(
	MASACH VARCHAR(10) PRIMARY KEY,
	TIEUDE NVARCHAR(50),
	GIA MONEY
)
go

INSERT INTO SACH VALUES('1', N'Lập trình C', 100)
INSERT INTO SACH VALUES('2', N'Lập trình Java', 200)
INSERT INTO SACH VALUES('3', N'Lập trình C#', 150)
GO

