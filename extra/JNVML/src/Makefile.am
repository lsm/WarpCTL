
AM_CPPFLAGS = -I$(top_srcdir)/include

AM_LDFLAGS = -L$(abs_top_builddir)/win -Wl,--whole-archive -lnvml -Wl,--no-whole-archive

lib_LTLIBRARIES = libjnvml-@TARGET_TRIPLET@.la 
libjnvml_@TARGET_TRIPLET@_la_SOURCES = jnvml.c
libjnvml_@TARGET_TRIPLET@_la_LIBADD = ../swig/libjnvml_wrap.la


