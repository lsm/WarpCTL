/* File jnvml.i */


%module jnvml

/*
SWIG_JAVABODY_PROXY(public, public, SWIGTYPE)
SWIG_JAVABODY_TYPEWRAPPER(public, public, public, SWIGTYPE)
*/

%{
#include "jnvml.h"
%}

%include <windows.i>

// knows about things like int *OUTPUT:
%include "typemaps.i"
// knows about int32_t
//%include "stdint.i"
%include "arrays_java.i"
%apply int[] {int *};
%apply int[] {unsigned int *};

// convert char * to byte array
%apply signed char[] {char* pchar}; 
%include "wchar.i"

%include "nvml.h"

%include "jnvml.h"
%include "carrays.i"



