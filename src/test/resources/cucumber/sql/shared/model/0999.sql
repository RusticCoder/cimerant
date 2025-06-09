CREATE schema fkpart1
  CREATE table pkey (a int primary key)
  CREATE table fk_part (a int) partition by list (a)
  CREATE table fk_part_1 partition of fk_part for values in (1) partition by list (a)
  CREATE table fk_part_1_1 partition of fk_part_1 for values in (1)
