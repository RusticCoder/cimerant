    CREATE TABLE shoelace_log (
        sl_name    char(10),      -- shoelace changed
        sl_avail   integer,       -- new available value
        log_who    name,          -- who did it
        log_when   timestamp      -- when
    )
