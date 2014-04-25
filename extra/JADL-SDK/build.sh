#!/bin/bash

autoreconf

mkdir -p build
cd build
make clean
rm -rf java/src

../configure --prefix=/usr --with-adlsdk=${HOME}/opt/ADL-SDK \
 --with-jre=/usr/lib/jvm/jdk1.6.0_45 \
 && make


