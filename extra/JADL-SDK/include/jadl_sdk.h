#ifndef __JADL_SDK_H
#define __JADL_SDK_H

#if defined (__linux)
 #ifndef LINUX
  #define LINUX
 #endif
#endif

#if defined (LINUX)
#include <wchar.h>
#include "adl_sdk.h"
#include <dlfcn.h>      //dyopen, dlsym, dlclose
#include <stdlib.h>
#include <string.h>     //memeset
#include <unistd.h>     //sleep

#else
#include <windows.h>
//#include <tchar.h>
#include "adl_sdk.h"
#endif

#include "adl_functions.h"

ADL_MAIN_MALLOC_CALLBACK __stdcall getFunction_JADL_Main_Memory_Alloc();

//static void __stdcall JADL_Main_Memory_Free (void **lpBuffer)

int ADL_Main_Control_Create(ADL_MAIN_MALLOC_CALLBACK callback, int iEnumConnectedAdapters);
int ADL_Main_Control_Destroy();
int ADL_Adapter_NumberOfAdapters_Get(int *lpNumAdapters);
int ADL_Adapter_AdapterInfo_Get(LPAdapterInfo lpInfo, int iInputSize);
int ADL_Adapter_ID_Get(int iAdapterIndex, int *lpAdapterID);
int ADL_Overdrive5_Temperature_Get(int iAdapterIndex, int iThermalControllerIndex, ADLTemperature *lpTemperature);
int ADL_Overdrive5_CurrentActivity_Get(int iAdapterIndex, ADLPMActivity *lpActivity);
int ADL_Overdrive5_ODParameters_Get(int iAdapterIndex, ADLODParameters *lpOdParameters);
int ADL_Overdrive5_FanSpeedInfo_Get(int iAdapterIndex, int iThermalControllerIndex, ADLFanSpeedInfo *lpFanSpeedInfo);
int ADL_Overdrive5_FanSpeed_Get(int iAdapterIndex, int iThermalControllerIndex, ADLFanSpeedValue *lpFanSpeedValue);
int ADL_Overdrive5_FanSpeed_Set(int iAdapterIndex, int iThermalControllerIndex, ADLFanSpeedValue *lpFanSpeedValue);
int ADL_Overdrive5_ODPerformanceLevels_Get(int iAdapterIndex, int iDefault, ADLODPerformanceLevels *lpOdPerformanceLevels);
int ADL_Overdrive5_ODPerformanceLevels_Set(int iAdapterIndex, ADLODPerformanceLevels *lpOdPerformanceLevels);
int ADL_Main_Control_Refresh();
int ADL_Overdrive5_PowerControl_Get(int iAdapterIndex, int* iPercentage, int* whatever);
int ADL_Overdrive5_PowerControl_Set(int iAdapterIndex, int iPercentage);
int ADL_Overdrive5_FanSpeedToDefault_Set(int iAdapterIndex, int iThermalControllerIndex);

int get_wchar_t_size();

size_t count_p_wchar_t_bytes(wchar_t *wstr);

size_t get_p_wchar_t_bytes(wchar_t *wstr, char * pchar, size_t len);

int jadl_init(void);


size_t getAdapterInfoSize();

ADL_MAIN_MALLOC_CALLBACK __stdcall getFunction_JADL_Main_Memory_Alloc();

#endif
