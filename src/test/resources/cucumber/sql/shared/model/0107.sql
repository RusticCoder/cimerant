CREATE OR REPLACE TABLE `t_table` (
`info_no` int(11) unsigned NOT NULL AUTO_INCREMENT,
`product_no` int(11) unsigned NOT NULL,
`member_id` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
`app_url` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
`redirect_url` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
`scope` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
PRIMARY KEY (`info_no`),
UNIQUE KEY `UN_member_id` (`member_id`) USING BTREE,
UNIQUE KEY `UN_product_no` (`product_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC
