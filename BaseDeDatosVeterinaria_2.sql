--DROP DATABASE VeterinaryManagement
CREATE DATABASE VeterinaryManagement;
GO

USE VeterinaryManagement;
GO

CREATE TABLE USERS (
    USERID int primary key identity,
    USERNAME varchar(50) not null,
	CLIENTID varchar(9),
	EMPLOYEEID varchar(9),
    PASSWORD_ varchar(100) not null,
    ADMIN_ bit not null
);

CREATE TABLE TAGS (
    TAGID int primary key identity,
    TAGNAME varchar(20) not null unique
);

CREATE TABLE PRODUCTS (
    PRODUCTID int primary key identity,
    PRODUCTNAME varchar(100) not null,
    DESCRIPTION_ varchar(150),
    PRICE decimal(10, 2) not null,
    INITIALSTOCK int not null,
    CURRENTSTOCK int not null,
    REORDERQUANTITY int
);

go
CREATE TABLE PRODUCT_TAGS (
    PRODUCTID int not null,
    TAGID int not null,
    primary key (PRODUCTID, TAGID)
);

CREATE TABLE CLIENTS (
    CLIENTID varchar(9) primary key, --*
    FIRSTNAME varchar(50) not null,
    LASTNAME varchar(50) not null,
    ADDRESS varchar(100),
    PHONE varchar(20) not null,
    EMAIL varchar(50) not null,
    NOTES varchar(150),
	TO_BE_DELETED bit --*
);

CREATE TABLE EMPLOYEES (
    EMPLOYEEID varchar(9) primary key, --*
    FIRSTNAME varchar(50) not null,
    LASTNAME varchar(50) not null,
    CONTACTNUMBER varchar(20) not null,
    EMAIL varchar(100) not null,
    BIRTHDATE date not null,
    STARTDATE date not null,
    SALESHISTORY decimal(10, 2) default 0
);

CREATE TABLE SUPPLIERS (
    SUPPLIERID int primary key identity,
    FIRSTNAME varchar(50) not null,
    LASTNAME varchar(50) not null, --Dividido en First name y last name
    CONTACTNAME varchar(50) not null,
    CONTACTNUMBER varchar(20) not null,
    EMAIL varchar(50) not null,
    ADDRESS_ varchar(100) not null
);
go

CREATE TABLE PURCHASES (
    PURCHASEID int primary key identity, -- Se pasaron Quantity y UnitPrice que antes era Amount
    PURCHASEDATE date not null,
    SUPPLIERID int not null
);

CREATE TABLE PURCHASE_DETAILS ( --Tabla nueva
	PURCHASEDETAILID int primary key identity,
	PURCHASEID int not null,
	PRODUCTID int not null,
    QUANTITY int not null,
	UNITPRICE decimal(10,2) not null
);
GO
--SELECT * FROM PURCHASES
--SELECT * FROM PURCHASE_DETAILS
--SELECT * FROM PRODUCTS
CREATE TABLE PURCHASE_RECORD(
	PURCHASE_RECORD_ID int primary key identity,
	CLIENTID varchar(9),
	PURCHASEDATE date,
	SALEID int
);

CREATE TABLE APPOINTMENTS ( --Citas
    APPOINTMENTID int primary key identity,
    CLIENTID varchar(9) not null,
    APPOINTMENTDATE datetime not null,
    SERVICETYPE varchar(50) not null,
    EMPLOYEEID varchar(9) not null,
    NOTES varchar (150)
);

CREATE TABLE PETS (
    PETID INT PRIMARY KEY IDENTITY,
    PET_NAME VARCHAR(50) NOT NULL,
    SPECIES VARCHAR(50),
    BREED VARCHAR(50),
    BIRTHDATE DATE,
    GENDER VARCHAR(10),
    CLIENTID varchar(9) NOT NULL,
);

CREATE TABLE VACCINATION_RECORD (
    VACCINATIONID INT PRIMARY KEY IDENTITY,
    PETID INT NOT NULL,
    VACCINATIONDATE DATE NOT NULL,
    VACCINENAME VARCHAR(50) NOT NULL,
    VETERINARIAN VARCHAR(100),
    NOTES varchar (150)
);

CREATE TABLE MEDICAL_RECORD (
    RECORDID INT PRIMARY KEY IDENTITY,
    PETID INT NOT NULL,
    RECORDDATE DATETIME NOT NULL,
    VETERINARIAN VARCHAR(100),
    DIAGNOSIS VARCHAR(150) NOT NULL,
    TREATMENT VARCHAR(100),
);

CREATE TABLE SALES (
    SALEID int primary key identity,
    SALEDATE date not null,
    CLIENTID varchar(9) not null,
    EMPLOYEEID varchar(9) not null,
    DISCOUNT varchar(30)
	
);
CREATE TABLE SALE_DETAIL (
	SALEDETAILID int primary key identity,
	SALEID int not null, --Tabla nueva
	PRODUCTID int not null,
	QUANTITY int not null,
	UNITPRICE decimal(10,2) not null
);
go

--REFERENCES
ALTER TABLE SALE_DETAIL ADD CONSTRAINT FK_SALE_DETAIL_SALES FOREIGN KEY (SALEID) REFERENCES SALES(SALEID);
ALTER TABLE SALE_DETAIL ADD CONSTRAINT FK_SALE_DETAIL_PRODUCTS FOREIGN KEY (PRODUCTID) REFERENCES PRODUCTS(PRODUCTID);

ALTER TABLE PURCHASE_DETAILS ADD CONSTRAINT FK_PURCHASE_DETAILS_PURCHASES FOREIGN KEY (PURCHASEID) REFERENCES PURCHASES(PURCHASEID);
ALTER TABLE PURCHASE_DETAILS ADD CONSTRAINT FK_PURCHASE_DETAILS_PRODUCTS FOREIGN KEY (PRODUCTID) REFERENCES PRODUCTS(PRODUCTID);

ALTER TABLE USERS ADD CONSTRAINT FK_USERS_CLIENTS FOREIGN KEY (CLIENTID) REFERENCES CLIENTS(CLIENTID);
ALTER TABLE USERS ADD CONSTRAINT FK_USERS_EMPLOYEES FOREIGN KEY (EMPLOYEEID) REFERENCES EMPLOYEES(EMPLOYEEID);

ALTER TABLE PRODUCT_TAGS ADD CONSTRAINT FK_PRODUCT_TAGS_PRODUCTS FOREIGN KEY (PRODUCTID) REFERENCES PRODUCTS(PRODUCTID);
ALTER TABLE PRODUCT_TAGS ADD CONSTRAINT FK_PRODUCT_TAGS_TAGS FOREIGN KEY (TAGID) REFERENCES TAGS(TAGID);

ALTER TABLE PURCHASES ADD CONSTRAINT FK_PURCHASES_SUPPLIERS FOREIGN KEY (SUPPLIERID) REFERENCES SUPPLIERS(SUPPLIERID);

ALTER TABLE APPOINTMENTS ADD CONSTRAINT FK_APPOINTMENTS_CLIENTS FOREIGN KEY (CLIENTID) REFERENCES CLIENTS(CLIENTID);
ALTER TABLE APPOINTMENTS ADD CONSTRAINT FK_APPOINTMENTS_EMPLOYEES FOREIGN KEY (EMPLOYEEID) REFERENCES EMPLOYEES(EMPLOYEEID);

ALTER TABLE PURCHASE_RECORD ADD CONSTRAINT FK_PURCHASE_RECORD_CLIENTS FOREIGN KEY (CLIENTID) REFERENCES CLIENTS(CLIENTID);

ALTER TABLE MEDICAL_RECORD ADD CONSTRAINT FK_MEDICAL_RECORD_PETS FOREIGN KEY (PetID) REFERENCES PETS(PetID);

ALTER TABLE VACCINATION_RECORD ADD CONSTRAINT FK_VACCINATION_RECORD_PETS FOREIGN KEY (PetID) REFERENCES PETS(PetID);

ALTER TABLE PETS ADD CONSTRAINT FK_PETS_CLIENTS FOREIGN KEY (ClientID) REFERENCES CLIENTS(ClientID);

ALTER TABLE SALES ADD CONSTRAINT FK_SALES_CLIENTS FOREIGN KEY (CLIENTID) REFERENCES CLIENTS(CLIENTID);
ALTER TABLE SALES ADD CONSTRAINT FK_SALES_EMPLOYEES FOREIGN KEY (EMPLOYEEID) REFERENCES EMPLOYEES(EMPLOYEEID);
GO

/*

INSERT INTO Employees (FirstName, LastName, ContactNumber, Email, Birthdate, StartDate, SalesHistory) VALUES
    ('Empleado', 'Uno', '1234567890', 'empleado1@email.com', '1990-01-01', '2023-01-01', 0),
    ('Empleado', 'Dos', '9876543210', 'empleado2@email.com', '1995-05-15', '2023-02-15', 0),
    ('Empleado', 'Tres', '5678901234', 'empleado3@email.com', '1988-08-10', '2022-10-10', 0);
go
INSERT INTO Clients (CLIENTID, FirstName, LastName, Address, Phone, Email, Notes) VALUES
    ('208350067', 'Cliente', 'Dos', 'Avenida 456, Ciudad B', '9876543210', 'cliente2@email.com', 'Notas sobre Cliente Dos'),
    ('208350067', 'Cliente', 'Dos', 'Avenida 456, Ciudad B', '9876543210', 'cliente2@email.com', 'Notas sobre Cliente Dos'),
    ('Cliente', 'Tres', 'Carrera 789, Ciudad C', '5678901234', 'cliente3@email.com', 'Notas sobre Cliente Tres');

go
INSERT INTO Products (ProductName, Description_, Price, InitialStock, CurrentStock, ReorderThreshold, ReorderQuantity) VALUES
    ('Producto 1', 'Descripci?n del Producto 1', 10.99, 50, 50, 20, 30),
    ('Producto 2', 'Descripci?n del Producto 2', 15.75, 30, 30, 15, 25),
    ('Producto 3', 'Descripci?n del Producto 3', 8.50, 70, 70, 30, 40);

go
INSERT INTO Sales (SaleDate, ProductID, Quantity, ClientID, EmployeeID, Discount, AMOUNT) VALUES
    ('2023-07-10', 1, 2, 1, 1, 0.10, 49.45),
    ('2023-07-12', 2, 2, 2, 1, 0.05, 29.92),
    ('2023-07-15', 1, 3, 3, 2, 0.10, 29.67),
    ('2023-07-20', 3, 1, 1, 3, 0.15, 68.00),
    ('2023-06-05', 3, 1, 1, 1, 0.10, 76.50),
    ('2023-06-15', 2, 3, 2, 2, 0.05, 59.85);

SELECT
    e.FirstName + ' ' + e.LastName AS EmployeeName,
    MONTH(s.SaleDate) AS Month,
    YEAR(s.SaleDate) AS Year,
    SUM(s.AMOUNT) AS TotalSalesAmount
FROM
    Sales s
JOIN
    Employees e ON s.EmployeeID = e.EmployeeID
WHERE
    e.EmployeeID = 1 AND
    s.SaleDate BETWEEN '2023-07-01' AND '2023-07-31'
GROUP BY
    e.FirstName, e.LastName, YEAR(s.SaleDate), MONTH(s.SaleDate)
ORDER BY
    Year DESC, Month DESC;
*/