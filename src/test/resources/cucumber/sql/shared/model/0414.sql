CREATE table bar1 (a integer, b integer not null default 1)
  partition by range (a)
