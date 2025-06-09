CREATE BLOCKCHAIN TABLE bctab_part (trans_id number primary key, sender varchar2(50), recipient varchar2(50), trans_date DATE, amount number) 
     NO DROP UNTIL 16 DAYS IDLE
     NO DELETE UNTIL 25 DAYS AFTER INSERT
        HASHING USING "SHA2_512" VERSION "v1"
        PARTITION BY RANGE(trans_date)
        (PARTITION p1 VALUES LESS THAN (TO_DATE('30-09-2019','dd-mm-yyyy')),
                                PARTITION p2 VALUES LESS THAN (TO_DATE('31-12-2019','dd-mm-yyyy')),
                                PARTITION p3 VALUES LESS THAN (TO_DATE('31-03-2020','dd-mm-yyyy')),
                                PARTITION p4 VALUES LESS THAN (TO_DATE('30-06-2020','dd-mm-yyyy'))
                                )
