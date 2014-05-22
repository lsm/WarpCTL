/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLMVPUStatus {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLMVPUStatus(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLMVPUStatus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLMVPUStatus(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setISize(int value) {
    jadl_sdkJNI.ADLMVPUStatus_iSize_set(swigCPtr, this, value);
  }

  public int getISize() {
    return jadl_sdkJNI.ADLMVPUStatus_iSize_get(swigCPtr, this);
  }

  public void setIActiveAdapterCount(int value) {
    jadl_sdkJNI.ADLMVPUStatus_iActiveAdapterCount_set(swigCPtr, this, value);
  }

  public int getIActiveAdapterCount() {
    return jadl_sdkJNI.ADLMVPUStatus_iActiveAdapterCount_get(swigCPtr, this);
  }

  public void setIStatus(int value) {
    jadl_sdkJNI.ADLMVPUStatus_iStatus_set(swigCPtr, this, value);
  }

  public int getIStatus() {
    return jadl_sdkJNI.ADLMVPUStatus_iStatus_get(swigCPtr, this);
  }

  public void setAAdapterLocation(ADLAdapterLocation value) {
    jadl_sdkJNI.ADLMVPUStatus_aAdapterLocation_set(swigCPtr, this, ADLAdapterLocation.getCPtr(value), value);
  }

  public ADLAdapterLocation getAAdapterLocation() {
    long cPtr = jadl_sdkJNI.ADLMVPUStatus_aAdapterLocation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ADLAdapterLocation(cPtr, false);
  }

  public ADLMVPUStatus() {
    this(jadl_sdkJNI.new_ADLMVPUStatus(), true);
  }

}
