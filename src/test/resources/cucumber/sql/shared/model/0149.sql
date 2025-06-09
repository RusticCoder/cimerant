CREATE TABLE tbl (
    col1 LONGTEXT,
    data JSON,
    INDEX idx1 ((SUBSTRING(col1, 1, 10))),
    INDEX idx2 ((CAST(JSON_EXTRACT(data, _utf8mb4'$') AS UNSIGNED ARRAY))),
    INDEX ((CAST(data->>'$.name' AS CHAR(30))))
)
