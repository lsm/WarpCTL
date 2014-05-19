#!/bin/bash

autoreconf

mkdir -p build
cd build
make clean
rm -rf java/src

../configure --prefix=/usr --with-nvapi=/d/opt/nvapi-r334/nvapi-334 \
 --with-jre='/c/Program Files/Java/jdk1.6.0_45' --with-lib2a=/d/opt/LIB2A-2.0/LIB2A/ \
 && make

