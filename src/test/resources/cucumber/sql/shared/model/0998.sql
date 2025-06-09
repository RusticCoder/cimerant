CREATE schema fkpart0
  CREATE table pkey (a int primary key)
  CREATE table fk_part (a int) partition by list (a)
  CREATE table fk_part_1 partition of fk_part
      (foreign key (a) references fkpart0.pkey) for values in (1)
  CREATE table fk_part_23 partition of fk_part
      (foreign key (a) references fkpart0.pkey) for values in (2, 3)
      partition by list (a)
  CREATE table fk_part_23_2 partition of fk_part_23 for values in (2)
