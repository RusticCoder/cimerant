CREATE TABLE [dbo].[TestTable] (
  Name NVARCHAR(64) NOT NULL,
  Value NVARCHAR(64) NOT NULL,
  Guid NVARCHAR(64) NOT NULL,
  index ix_store CLUSTERED COLUMNSTORE,
  index ix_value_guid COLUMNSTORE (Value, Guid),
  index ix_value_name NONCLUSTERED (Value, Name)
)
