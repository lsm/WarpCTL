
CLEANFILES = jadl-sdk_wrap.c

AM_CPPFLAGS = -I$(top_srcdir)/include

SWIG_SOURCES = jadl-sdk.i

noinst_LTLIBRARIES = libjadlsdk_wrap.la
libjadlsdk_wrap_la_SOURCES = jadl-sdk_wrap.c $(SWIG_SOURCES)

jadl-sdk_wrap.c: $(SWIG_SOURCES)
	mkdir -p $(top_builddir)/java/src/com/vnetpublishing/swig/adl && $(SWIG) -java -package com.vnetpublishing.swig.adl $(SWIG_PLATFORM_ARGS) -I"$(ADLSDK)/include" -I"$(JAVA_HOME)/include" -I$(top_srcdir)/include  -outdir $(top_builddir)/java/src/com/vnetpublishing/swig/adl -o $@ $<
 
