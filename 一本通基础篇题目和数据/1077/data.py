#!/usr/bin/env python

from cyaron import * # 引入CYaRon的库

for i in range(1,11):
    n = randint(1,100)
    _max = ati([1E3])
    _in = [ randint(1000,9999) for i in range(0,n)]
    io = IO(file_prefix="problem", data_id=i) # test3.in, test3.out
    io.input_writeln(n)
    io.input_writeln(_in)
    io.output_gen("../std")
