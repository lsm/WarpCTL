
AM_CPPFLAGS = -I$(top_srcdir)/include

noinst_LIBRARIES = libnvml.a 

libnvml.a: nvml.def
	$(DLLTOOL) -d $< -D nvml.dll -k -l $@

nvml.def: $(NVML)/lib/nvml.lib
	$(LIB2A)/bin/reimp.exe -d  $< && cp '/c/Program Files/NVIDIA Corporation/NVSMI/nvml.dll' nvml.dll

	