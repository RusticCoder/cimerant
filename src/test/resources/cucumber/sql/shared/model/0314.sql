CREATE table at_partitioned(id int, name varchar(64), unique (id, name))
  partition by hash(id)
