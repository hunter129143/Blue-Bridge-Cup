#!/usr/bin/env python

from cyaron import * # 引入CYaRon的库

for i in range(1,11):
    n = randint(1,101)
    m = randint(1,101)

    _max = ati([101])
    _in = [ randint(1,_max[0]) for i in range(0,n)]
    io = IO(file_prefix="problem", data_id=i) # test3.in, test3.out
    io.input_writeln(n,m)
    io.input_writeln(_in)
    io.output_gen("../std")
