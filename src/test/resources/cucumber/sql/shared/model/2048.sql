CREATE TABLE dbo.PartitionTable (
    process_date datetime PRIMARY KEY,
    process_type char(10)
)
ON MyRangePS1 (process_date)
