/* File jnvapi.i */


%module jnvapi

/*
SWIG_JAVABODY_PROXY(public, public, SWIGTYPE)
SWIG_JAVABODY_TYPEWRAPPER(public, public, public, SWIGTYPE)
*/

%{
#include "jnvapi.h"
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

%include "nvapi_lite_salstart.h"
%include "nvapi_lite_common.h"
%include "nvapi_lite_sli.h"
%include "nvapi_lite_surround.h"
%include "nvapi_lite_stereo.h"	
%include "nvapi_lite_d3dext.h"	
%include "nvapi.h"
%include "nvapi_lite_salend.h"




%include "jnvapi.h"
%include "carrays.i"



