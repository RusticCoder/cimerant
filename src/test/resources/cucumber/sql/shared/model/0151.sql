CREATE TABLE keywords (
    eur VARCHAR(100),
    iso VARCHAR(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
    usa VARCHAR(100),
    jis VARCHAR(100),
    internal INT,
    instant BIT
)
