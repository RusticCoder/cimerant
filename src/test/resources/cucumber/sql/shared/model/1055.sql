CREATE TABLE gtest_tableoid (
  a int PRIMARY KEY,
  b bool GENERATED ALWAYS AS (tableoid <> 0) STORED
)
