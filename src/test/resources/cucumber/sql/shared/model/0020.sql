CREATE TABLE npub_info
(
 pub_id CHAR(4) NOT NULL
    REFERENCES publishers(pub_id)
    CONSTRAINT UPKCL_npubinfo PRIMARY KEY CLUSTERED,
pr_info ntext NULL
)
