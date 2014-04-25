#                                               -*- Autoconf -*-
# Process this file with autoconf to produce a configure script.

AC_PREREQ([2.68])
AC_INIT([FULL-PACKAGE-NAME], [VERSION], [BUG-REPORT-ADDRESS])
AC_CANONICAL_SYSTEM
AM_INIT_AUTOMAKE([subdir-objects])



AC_CONFIG_SRCDIR([swig/jadl-sdk.i])
AC_CONFIG_SRCDIR([src/jadl_sdk.c])
AC_CONFIG_HEADERS([config.h])

AC_CONFIG_MACRO_DIR([m4])

AC_CONFIG_FILES([
 Makefile
 swig/Makefile
 src/Makefile
])



LT_INIT

case $target in
  amd64-*)
    have_x86_64=true
    ;;
  x86_64-*)
    have_x86_64=true
    ;;
  *)
    have_x86_64=false
    ;;
esac

case $target in
  *-*-linux-gnu*)
    have_linux=true
    AC_ENABLE_SHARED(yes)
    AC_DISABLE_STATIC
    ;;
  *-*-mingw*)
    have_win32=true
    PTHREAD_FLAGS=""
    DLOPEN_FLAGS=""
    WS2_LIBS="-lws2_32"
    MM_LIBS="-lwinmm"
    RT_LIBS=""
    AC_DEFINE([_WIN32_WINNT], [0x0501], "WinNT version for XP+ support")
    AC_LIBTOOL_WIN32_DLL
    ;;
  powerpc-*-darwin*)
    have_darwin=true
    CFLAGS="$CFLAGS -faltivec"
    OPENCL_LIBS=""
    PTHREAD_FLAGS=""
    RT_LIBS=""
    AC_ENABLE_SHARED(yes)
	AC_DISABLE_STATIC
    ;;
  *-*-darwin*)
    have_darwin=true
    OPENCL_LIBS="-framework OpenCL"
    PTHREAD_FLAGS=""
    RT_LIBS=""
    AC_ENABLE_SHARED(yes)
	AC_DISABLE_STATIC
	;;
esac


# Checks for programs.

AC_PROG_CXX
AC_PROG_AWK
AC_PROG_CC
AC_PROG_CPP
AC_PROG_INSTALL
AC_PROG_LN_S
AC_PROG_MAKE_SET
# AC_PROG_RANLIB

AM_PROG_CC_STDC

AC_PROG_LIBTOOL(libtool)
AC_C_CONST
AM_PROG_LIBTOOL
# Checks for libraries.
AX_PKG_SWIG(1.3.17, [], [])

# Checks for header files.

adlsdk="ADL_SDK"

# introduce the optional configure parameter for a non-standard install prefix of adlsdk
AC_ARG_WITH([adlsdk],
    [AS_HELP_STRING([--with-adlsdk=prefix],
        [try this for a non-standard install prefix of the adlsdk library])],
    [adlsdkPATHSET=1],
    [adlsdkPATHSET=0])

AC_SUBST([AM_CXXFLAGS])

# if optional parameter used, extend path flags for compliler and linker
if test $adlsdkPATHSET = 1 ; then
    # extend the compiler flags according to the path set
    AM_CXXFLAGS="$AM_CXXFLAGS -I$with_adlsdk/include"
    CPPFLAGS="$CPPFLAGS -I$with_adlsdk/include"
    AC_SUBST([ADLSDK],"$with_adlsdk")
fi

jre="jre"

# introduce the optional configure parameter for a non-standard install prefix of adlsdk
AC_ARG_WITH([jre],
    [AS_HELP_STRING([--with-jre=prefix],
        [try this for a non-standard install prefix of the Java Runtime Environment library])],
    [jrePATHSET=1],
    [jrePATHSET=0])

AC_SUBST([AM_CXXFLAGS])

# if optional parameter used, extend path flags for compliler and linker
if test $jrePATHSET = 1 ; then
    # extend the compiler flags according to the path set
    AM_CXXFLAGS="$AM_CXXFLAGS -I$with_jre/include"
    CPPFLAGS="$CPPFLAGS -I'$with_jre/include'"
    AC_SUBST([JAVA_HOME],"$with_jre")
fi

case $target in
  *-*-linux-gnu*)
    AC_SUBST([SWIG_PLATFORM_ARGS],"-DLINUX -I/usr/include -I/usr/local/include -I$with_jre/include/linux")
    CPPFLAGS="$CPPFLAGS -I$with_jre/include/linux"
    ;;
  *-*-mingw*)
    AC_SUBST([SWIG_PLATFORM_ARGS],"-I'$with_jre/include/win32'")
    CPPFLAGS="$CPPFLAGS -I'$with_jre/include/win32'"
    LDFLAGS="$LDFLAGS -no-undefined"
    ;;
  powerpc-*-darwin*)
    ;;
  *-*-darwin*)
	;;
esac


AC_CHECK_HEADERS([stdlib.h string.h unistd.h wchar.h])

# Checks for typedefs, structures, and compiler characteristics.

# Checks for library functions.
AC_FUNC_MALLOC

AC_OUTPUT

