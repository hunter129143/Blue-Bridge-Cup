#!/usr/bin/env python

from cyaron import * # 引入CYaRon的库

for i in range(1,11):
    io = IO(file_prefix="problem", data_id=i) # test3.in, test3.out

    t = randint(1,20)
    io.input_writeln(t)
    for k in range(0,t):
        a = randint(1,10)
        b = randint(1,10)
        io.input_writeln(a,b)
    io.output_gen("../std")
