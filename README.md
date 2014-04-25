# WarpCTL

A Clojure library designed to provide parallelization across
available system resources.

## Usage

This project is in the early stages of development and contains
a great deal of archetecture dependent code. The licensing on
device API's may be restrictive so third party API's are integrated
into the system using swig.

1. First all of the system dependent modules in the extra folder 
must be compiled and installed. See the README file located in
each subfolder for module-specific installation instructions. 

2. The clojure library must then be compiled into a jar using leinnigen

lein clean
lein uberjar
lein localrepo install target/warpctl-1.0.0.jar com.vnetpublishing/WarpCTL 0.1.0

3. You can test the library by directly executing it

lein run

4. Once installed in your localrepo you should be able to include
it in your local projects with the by adding it to your project dependencies

[com.vnetpublishing/WarpCTL "0.1.0"]

No documentation is currently provided for this system, 
see src/com/vnetpublishing/warpctl/core for example usage.

## License

Copyright © 2014 Ralph Ritoch - ALL RIGHTS RESERVED

Distributed under the VNETPL limited public licence.

http://www.vnetpublishing.com/Legal/Licenses/2010/10/vnetlpl.txt

