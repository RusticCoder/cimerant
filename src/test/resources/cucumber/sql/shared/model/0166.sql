CREATE TABLE `global_priv` (
    `Host` CHAR(60) COLLATE utf8_bin NOT NULL DEFAULT '',
    `User` CHAR(80) COLLATE utf8_bin NOT NULL DEFAULT '',
    `Privilege` LONGTEXT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL DEFAULT '{}' CHECK (json_valid(`Privilege`)),
    PRIMARY KEY (`Host`,`User`)
) ENGINE=Aria DEFAULT CHARSET=utf8 COLLATE=utf8_bin PAGE_CHECKSUM=1 COMMENT='Users and global privileges'
