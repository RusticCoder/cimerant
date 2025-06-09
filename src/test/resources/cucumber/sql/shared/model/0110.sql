CREATE TABLE `auth_realm_clients` (
`pk_realm` int unsigned NOT NULL DEFAULT '0',
`fk_realm` int unsigned DEFAULT NULL,
`client_id` varchar(150) NOT NULL,
`client_secret` blob NOT NULL,
PRIMARY KEY (`pk_realm`),
KEY `auth_realms_auth_realm_clients` (`fk_realm`)
) START TRANSACTION ENGINE=InnoDB DEFAULT CHARSET=latin1
