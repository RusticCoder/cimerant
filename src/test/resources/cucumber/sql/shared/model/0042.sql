CREATE TABLE dbo.T1 
(
    column_1 AS 'Computed column ' + column_2, 
    column_2 varchar(30) 
        CONSTRAINT default_name DEFAULT ('my column default'),
    column_3 rowversion,
    column_4 varchar(40) NULL
)
