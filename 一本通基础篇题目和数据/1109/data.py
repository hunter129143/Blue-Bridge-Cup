#!/usr/bin/env python

from cyaron import * # 引入CYaRon的库

for i in range(1,11):
    io = IO(file_prefix="problem", data_id=i) # test3.in, test3.out

    a = randint(10,1000)
    b = randint(1,a+1)
    _max = ati([1E3])
    _in = [ randint(-1000,_max[0]) for i in range(0,3)]
    io.input_writeln(a,b)
    io.output_gen("../std")
