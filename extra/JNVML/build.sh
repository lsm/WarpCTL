#!/bin/bash

autoreconf

mkdir -p build
cd build
make clean
rm -rf java/src

../configure --prefix=/usr --with-nvml=/d/opt/gdk_332.85_release/gdk_wddm_amd64_release/nvml \
 --with-jre='/c/Program Files (x86)/Java/jdk1.6.0_45' --with-lib2a=/d/opt/LIB2A-2.0/LIB2A/ \
 && make

