CREATE table rack_shelf_bin ( id int unsigned not null auto_increment unique primary key, bin_volume decimal(20, 4) default (bin_len * bin_width * bin_height))
