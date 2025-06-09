CREATE table #t (
    id varchar(50) not null index ix2 nonclustered,
    other_id uniqueidentifier not null index ix1 clustered,
    value float
)
