
CLEANFILES = jnvml_wrap.c

AM_CPPFLAGS = -I$(top_srcdir)/include

SWIG_SOURCES = jnvml.i

noinst_LTLIBRARIES = libjnvml_wrap.la
libjnvml_wrap_la_SOURCES = jnvml_wrap.c $(SWIG_SOURCES)

jnvml_wrap.c: $(SWIG_SOURCES)
	mkdir -p $(top_builddir)/java/src/com/vnetpublishing/swig/nvml && $(SWIG) -v -java -package com.vnetpublishing.swig.nvml $(SWIG_PLATFORM_ARGS) -I"$(NVML)/include" -I"$(JAVA_HOME)/include" -I$(top_srcdir)/include  -outdir $(top_builddir)/java/src/com/vnetpublishing/swig/nvml -o $@ $<
 
