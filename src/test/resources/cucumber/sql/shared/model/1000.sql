CREATE schema fkpart2
  CREATE table pkey (a int primary key)
  CREATE table fk_part (a int, constraint fkey foreign key (a) references fkpart2.pkey) partition by list (a)
  CREATE table fk_part_1 partition of fkpart2.fk_part for values in (1) partition by list (a)
  CREATE table fk_part_1_1 (a int, constraint my_fkey foreign key (a) references fkpart2.pkey)
