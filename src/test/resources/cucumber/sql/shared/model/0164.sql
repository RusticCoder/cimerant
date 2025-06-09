CREATE table if not exists tbl_signed_unsigned(
  `id` bigint(20) ZEROFILL signed UNSIGNED signed ZEROFILL unsigned ZEROFILL NOT NULL AUTO_INCREMENT COMMENT 'ID',
  c1 int signed unsigned,
  c2 decimal(10, 2) SIGNED UNSIGNED ZEROFILL,
  c3 float SIGNED ZEROFILL,
  c4 double precision(18, 4) UNSIGNED SIGNED ZEROFILL,
  PRIMARY KEY (`id`)
)
