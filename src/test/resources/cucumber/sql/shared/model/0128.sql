CREATE table with_check (c1 integer not null,c2 varchar(22),constraint c1 check (c2 in ('a', 'b', 'c')))
