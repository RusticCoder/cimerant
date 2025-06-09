CREATE TABLE range_parted (
	a int,
	b int
) PARTITION BY RANGE (a, b)
