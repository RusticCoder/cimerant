CREATE TABLE Sales.Region
(Region_id int NOT NULL,
Region_Name char(5) NOT NULL)
WITH (DISTRIBUTION = REPLICATE)
