CREATE TABLE positions_rollover (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    time datetime NOT NULL,
    partition_index int(10) unsigned NOT NULL DEFAULT 0,
    PRIMARY KEY (id,partition_index),
    KEY time (time)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
PARTITION BY LIST (partition_index) (
    PARTITION positions_rollover_partition VALUES IN (0) ENGINE = InnoDB,
    PARTITION default_positions_rollover_partition DEFAULT ENGINE = InnoDB
)
