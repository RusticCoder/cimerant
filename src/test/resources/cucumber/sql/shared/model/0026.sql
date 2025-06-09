CREATE TABLE cust
(
 CustomerID uniqueidentifier NOT NULL
   DEFAULT newid(),
 Company VARCHAR(30) NOT NULL,
 ContactName VARCHAR(60) NOT NULL,
 Address VARCHAR(30) NOT NULL,
 City VARCHAR(30) NOT NULL,
 StateProvince VARCHAR(10) NULL,
 PostalCode VARCHAR(10) NOT NULL,
 CountryRegion VARCHAR(20) NOT NULL,
 Telephone VARCHAR(15) NOT NULL,
 Fax VARCHAR(15) NULL
)
