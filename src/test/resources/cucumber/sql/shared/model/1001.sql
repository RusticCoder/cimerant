CREATE schema fkpart3
  CREATE table pkey (a int primary key)
  CREATE table fk_part (a int, constraint fkey foreign key (a) references fkpart3.pkey deferrable initially immediate) partition by list (a)
  CREATE table fk_part_1 partition of fkpart3.fk_part for values in (1) partition by list (a)
  CREATE table fk_part_1_1 partition of fkpart3.fk_part_1 for values in (1)
  CREATE table fk_part_2 partition of fkpart3.fk_part for values in (2)
