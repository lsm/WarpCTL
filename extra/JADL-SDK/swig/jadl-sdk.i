/* File jadl-sdk.i */


%module jadl_sdk

/*
SWIG_JAVABODY_PROXY(public, public, SWIGTYPE)
SWIG_JAVABODY_TYPEWRAPPER(public, public, public, SWIGTYPE)
*/

%{
#include "jadl_sdk.h"
%}

%include <windows.i>

// knows about things like int *OUTPUT:
%include "typemaps.i"
// knows about int32_t
%include "stdint.i"
%include "arrays_java.i"
%apply int[] {int *};

// convert char * to byte array
%apply signed char[] {char* pchar}; 
%include "wchar.i"

%include "adl_defines.h"
%include "adl_structures.h"
%include "adl_sdk.h"

%include "jadl_sdk.h"


%include "carrays.i"

%array_functions(AdapterInfo,LPAdapterInfo)


