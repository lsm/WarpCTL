/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class jadl_sdk implements jadl_sdkConstants {
	
	static {
	  try {
	     String p = com.vnetpublishing.clj.nativedep.getArchName();
	     if ("linux-amd64".equals(p)) {
	          com.vnetpublishing.clj.nativedep.loadResource("/libjadlsdk-x86_64-unknown-linux-gnu.so","JADL-SDK","1.0","jadlsdk");
	     }
	  } catch (Throwable t) {
		  
	  }
	  
	}
	  
  public static SWIGTYPE_p_f_int__p_void getFunction_JADL_Main_Memory_Alloc() {
    long cPtr = jadl_sdkJNI.getFunction_JADL_Main_Memory_Alloc();
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int__p_void(cPtr, false);
  }

  public static int ADL_Main_Control_Create(SWIGTYPE_p_f_int__p_void callback, int iEnumConnectedAdapters) {
    return jadl_sdkJNI.ADL_Main_Control_Create(SWIGTYPE_p_f_int__p_void.getCPtr(callback), iEnumConnectedAdapters);
  }

  public static int ADL_Main_Control_Destroy() {
    return jadl_sdkJNI.ADL_Main_Control_Destroy();
  }

  public static int ADL_Adapter_NumberOfAdapters_Get(int[] lpNumAdapters) {
    return jadl_sdkJNI.ADL_Adapter_NumberOfAdapters_Get(lpNumAdapters);
  }

  public static int ADL_Adapter_AdapterInfo_Get(AdapterInfo lpInfo, int iInputSize) {
    return jadl_sdkJNI.ADL_Adapter_AdapterInfo_Get(AdapterInfo.getCPtr(lpInfo), lpInfo, iInputSize);
  }

  public static int ADL_Adapter_ID_Get(int iAdapterIndex, int[] lpAdapterID) {
    return jadl_sdkJNI.ADL_Adapter_ID_Get(iAdapterIndex, lpAdapterID);
  }

  public static int ADL_Overdrive5_Temperature_Get(int iAdapterIndex, int iThermalControllerIndex, ADLTemperature lpTemperature) {
    return jadl_sdkJNI.ADL_Overdrive5_Temperature_Get(iAdapterIndex, iThermalControllerIndex, ADLTemperature.getCPtr(lpTemperature), lpTemperature);
  }

  public static int ADL_Overdrive5_CurrentActivity_Get(int iAdapterIndex, ADLPMActivity lpActivity) {
    return jadl_sdkJNI.ADL_Overdrive5_CurrentActivity_Get(iAdapterIndex, ADLPMActivity.getCPtr(lpActivity), lpActivity);
  }

  public static int ADL_Overdrive5_ODParameters_Get(int iAdapterIndex, ADLODParameters lpOdParameters) {
    return jadl_sdkJNI.ADL_Overdrive5_ODParameters_Get(iAdapterIndex, ADLODParameters.getCPtr(lpOdParameters), lpOdParameters);
  }

  public static int ADL_Overdrive5_FanSpeedInfo_Get(int iAdapterIndex, int iThermalControllerIndex, ADLFanSpeedInfo lpFanSpeedInfo) {
    return jadl_sdkJNI.ADL_Overdrive5_FanSpeedInfo_Get(iAdapterIndex, iThermalControllerIndex, ADLFanSpeedInfo.getCPtr(lpFanSpeedInfo), lpFanSpeedInfo);
  }

  public static int ADL_Overdrive5_FanSpeed_Get(int iAdapterIndex, int iThermalControllerIndex, ADLFanSpeedValue lpFanSpeedValue) {
    return jadl_sdkJNI.ADL_Overdrive5_FanSpeed_Get(iAdapterIndex, iThermalControllerIndex, ADLFanSpeedValue.getCPtr(lpFanSpeedValue), lpFanSpeedValue);
  }

  public static int ADL_Overdrive5_FanSpeed_Set(int iAdapterIndex, int iThermalControllerIndex, ADLFanSpeedValue lpFanSpeedValue) {
    return jadl_sdkJNI.ADL_Overdrive5_FanSpeed_Set(iAdapterIndex, iThermalControllerIndex, ADLFanSpeedValue.getCPtr(lpFanSpeedValue), lpFanSpeedValue);
  }

  public static int ADL_Overdrive5_ODPerformanceLevels_Get(int iAdapterIndex, int iDefault, ADLODPerformanceLevels lpOdPerformanceLevels) {
    return jadl_sdkJNI.ADL_Overdrive5_ODPerformanceLevels_Get(iAdapterIndex, iDefault, ADLODPerformanceLevels.getCPtr(lpOdPerformanceLevels), lpOdPerformanceLevels);
  }

  public static int ADL_Overdrive5_ODPerformanceLevels_Set(int iAdapterIndex, ADLODPerformanceLevels lpOdPerformanceLevels) {
    return jadl_sdkJNI.ADL_Overdrive5_ODPerformanceLevels_Set(iAdapterIndex, ADLODPerformanceLevels.getCPtr(lpOdPerformanceLevels), lpOdPerformanceLevels);
  }

  public static int ADL_Main_Control_Refresh() {
    return jadl_sdkJNI.ADL_Main_Control_Refresh();
  }

  public static int ADL_Overdrive5_PowerControl_Get(int iAdapterIndex, int[] iPercentage, int[] whatever) {
    return jadl_sdkJNI.ADL_Overdrive5_PowerControl_Get(iAdapterIndex, iPercentage, whatever);
  }

  public static int ADL_Overdrive5_PowerControl_Set(int iAdapterIndex, int iPercentage) {
    return jadl_sdkJNI.ADL_Overdrive5_PowerControl_Set(iAdapterIndex, iPercentage);
  }

  public static int ADL_Overdrive5_FanSpeedToDefault_Set(int iAdapterIndex, int iThermalControllerIndex) {
    return jadl_sdkJNI.ADL_Overdrive5_FanSpeedToDefault_Set(iAdapterIndex, iThermalControllerIndex);
  }

  public static int get_wchar_t_size() {
    return jadl_sdkJNI.get_wchar_t_size();
  }

  public static long count_p_wchar_t_bytes(SWIGTYPE_p_wchar_t wstr) {
    return jadl_sdkJNI.count_p_wchar_t_bytes(SWIGTYPE_p_wchar_t.getCPtr(wstr));
  }

  public static long get_p_wchar_t_bytes(SWIGTYPE_p_wchar_t wstr, byte[] pchar, long len) {
    return jadl_sdkJNI.get_p_wchar_t_bytes(SWIGTYPE_p_wchar_t.getCPtr(wstr), pchar, len);
  }

  public static int jadl_init() {
    return jadl_sdkJNI.jadl_init();
  }

  public static long getAdapterInfoSize() {
    return jadl_sdkJNI.getAdapterInfoSize();
  }

  public static AdapterInfo new_LPAdapterInfo(int nelements) {
    long cPtr = jadl_sdkJNI.new_LPAdapterInfo(nelements);
    return (cPtr == 0) ? null : new AdapterInfo(cPtr, false);
  }

  public static void delete_LPAdapterInfo(AdapterInfo ary) {
    jadl_sdkJNI.delete_LPAdapterInfo(AdapterInfo.getCPtr(ary), ary);
  }

  public static AdapterInfo LPAdapterInfo_getitem(AdapterInfo ary, int index) {
    return new AdapterInfo(jadl_sdkJNI.LPAdapterInfo_getitem(AdapterInfo.getCPtr(ary), ary, index), true);
  }

  public static void LPAdapterInfo_setitem(AdapterInfo ary, int index, AdapterInfo value) {
    jadl_sdkJNI.LPAdapterInfo_setitem(AdapterInfo.getCPtr(ary), ary, index, AdapterInfo.getCPtr(value), value);
  }

}
