# WarpCTL

A Clojure library designed to provide parallelization across
available system resources.

## Usage

This project is in the early stages of development and contains
a great deal of archetecture dependent code. The licensing on
device API's may be restrictive so third party API's are integrated
into the system using swig.

1. System dependent libraries in the extra folder must be compiled and installed

2. The clojure library must then be compiled into a jar using leinnigen

lein uberjar

## License

Copyright © 2014 Ralph Ritoch - ALL RIGHTS RESERVED

Distributed under the VNETPL limited public licence.

http://www.vnetpublishing.com/Legal/Licenses/2010/10/vnetlpl.txt

