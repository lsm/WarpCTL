/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLODPerformanceLevel {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLODPerformanceLevel(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLODPerformanceLevel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLODPerformanceLevel(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIEngineClock(int value) {
    jadl_sdkJNI.ADLODPerformanceLevel_iEngineClock_set(swigCPtr, this, value);
  }

  public int getIEngineClock() {
    return jadl_sdkJNI.ADLODPerformanceLevel_iEngineClock_get(swigCPtr, this);
  }

  public void setIMemoryClock(int value) {
    jadl_sdkJNI.ADLODPerformanceLevel_iMemoryClock_set(swigCPtr, this, value);
  }

  public int getIMemoryClock() {
    return jadl_sdkJNI.ADLODPerformanceLevel_iMemoryClock_get(swigCPtr, this);
  }

  public void setIVddc(int value) {
    jadl_sdkJNI.ADLODPerformanceLevel_iVddc_set(swigCPtr, this, value);
  }

  public int getIVddc() {
    return jadl_sdkJNI.ADLODPerformanceLevel_iVddc_get(swigCPtr, this);
  }

  public ADLODPerformanceLevel() {
    this(jadl_sdkJNI.new_ADLODPerformanceLevel(), true);
  }

}