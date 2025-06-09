CREATE TABLE example_table (
    _id INT PRIMARY KEY IDENTITY,
    name NVARCHAR(max),
    surname NVARCHAR(max),
    info VARBINARY(max),
    info_json as CAST(DECOMPRESS(info) as NVARCHAR(max))
)
