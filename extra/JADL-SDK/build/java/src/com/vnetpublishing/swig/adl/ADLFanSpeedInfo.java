/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLFanSpeedInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLFanSpeedInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLFanSpeedInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLFanSpeedInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setISize(int value) {
    jadl_sdkJNI.ADLFanSpeedInfo_iSize_set(swigCPtr, this, value);
  }

  public int getISize() {
    return jadl_sdkJNI.ADLFanSpeedInfo_iSize_get(swigCPtr, this);
  }

  public void setIFlags(int value) {
    jadl_sdkJNI.ADLFanSpeedInfo_iFlags_set(swigCPtr, this, value);
  }

  public int getIFlags() {
    return jadl_sdkJNI.ADLFanSpeedInfo_iFlags_get(swigCPtr, this);
  }

  public void setIMinPercent(int value) {
    jadl_sdkJNI.ADLFanSpeedInfo_iMinPercent_set(swigCPtr, this, value);
  }

  public int getIMinPercent() {
    return jadl_sdkJNI.ADLFanSpeedInfo_iMinPercent_get(swigCPtr, this);
  }

  public void setIMaxPercent(int value) {
    jadl_sdkJNI.ADLFanSpeedInfo_iMaxPercent_set(swigCPtr, this, value);
  }

  public int getIMaxPercent() {
    return jadl_sdkJNI.ADLFanSpeedInfo_iMaxPercent_get(swigCPtr, this);
  }

  public void setIMinRPM(int value) {
    jadl_sdkJNI.ADLFanSpeedInfo_iMinRPM_set(swigCPtr, this, value);
  }

  public int getIMinRPM() {
    return jadl_sdkJNI.ADLFanSpeedInfo_iMinRPM_get(swigCPtr, this);
  }

  public void setIMaxRPM(int value) {
    jadl_sdkJNI.ADLFanSpeedInfo_iMaxRPM_set(swigCPtr, this, value);
  }

  public int getIMaxRPM() {
    return jadl_sdkJNI.ADLFanSpeedInfo_iMaxRPM_get(swigCPtr, this);
  }

  public ADLFanSpeedInfo() {
    this(jadl_sdkJNI.new_ADLFanSpeedInfo(), true);
  }

}
