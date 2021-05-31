#!/bin/bash

touch aularedes.txt
hostname -I > aularedes.txt
hostname -i >> aularedes.txt
dig www.pudim.com.br >> aularedes.txt
ping www.pudim.com.br -w 6 >> aularedes.txt
w >> aularedes.txt
traceroute www.pudim.com.br >> aularedes.txt
ifconfig >> aularedes.txt
cat aularedes.txt | less


