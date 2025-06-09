CREATE TABLE `orders_json_2` (
  `id` int NOT NULL AUTO_INCREMENT,
  `reward` json DEFAULT NULL,
  `additional_info` json DEFAULT NULL,
  `CREATEd_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_order_codes` ((cast(json_extract(`additional_info`,_utf8mb4'$.order_codes') as char(17) array)))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
