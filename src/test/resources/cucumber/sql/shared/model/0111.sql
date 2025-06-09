CREATE table `site_checker_b_sonet_group_favorites` (
USER_ID int(11) not null,
GROUP_ID int(11) not null,
DATE_ADD datetime DEFAULT NULL,
primary key (USER_ID, GROUP_ID)
)
