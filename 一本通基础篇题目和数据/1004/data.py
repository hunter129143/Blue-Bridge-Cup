#!/usr/bin/env python

from cyaron import * # 引入CYaRon的库

for i in range(0,10):
    _in = choice("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!(*&^%$#@)")
    io = IO(file_prefix="problem", data_id=i) # test3.in, test3.out
    io.input_writeln(_in)
    io.output_gen("../std")
