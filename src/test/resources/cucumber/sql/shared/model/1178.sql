CREATE table idxpart (a int, exclude (a with = )) partition by range (a)
