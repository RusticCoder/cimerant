CREATE table xyz  (
  ccc  char(1),
  xxx  numeric(18,0) NULL,
  yyy  numeric(10,2) NULL,
  zzz  as cast(round(xxx / yyy, 0) as numeric(18,0)) materialized, 
  constraint pk primary key clustered (ccc)
)
