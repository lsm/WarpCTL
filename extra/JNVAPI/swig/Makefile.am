
CLEANFILES = jnvapi_wrap.c

AM_CPPFLAGS = -I$(top_srcdir)/include

SWIG_SOURCES = jnvapi.i

noinst_LTLIBRARIES = libjnvapi_wrap.la
libjnvapi_wrap_la_SOURCES = jnvapi_wrap.c $(SWIG_SOURCES)

jnvapi_wrap.c: $(SWIG_SOURCES)
	mkdir -p $(top_builddir)/java/src/com/vnetpublishing/swig/nvapi && $(SWIG) -v -java -package com.vnetpublishing.swig.nvapi $(SWIG_PLATFORM_ARGS) -I"$(NVAPI)" -I"$(JAVA_HOME)/include" -I$(top_srcdir)/include  -outdir $(top_builddir)/java/src/com/vnetpublishing/swig/nvapi -o $@ $<
 
