/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLMemoryRequired {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLMemoryRequired(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLMemoryRequired obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLMemoryRequired(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIMemoryReq(long value) {
    jadl_sdkJNI.ADLMemoryRequired_iMemoryReq_set(swigCPtr, this, value);
  }

  public long getIMemoryReq() {
    return jadl_sdkJNI.ADLMemoryRequired_iMemoryReq_get(swigCPtr, this);
  }

  public void setIType(int value) {
    jadl_sdkJNI.ADLMemoryRequired_iType_set(swigCPtr, this, value);
  }

  public int getIType() {
    return jadl_sdkJNI.ADLMemoryRequired_iType_get(swigCPtr, this);
  }

  public void setIDisplayFeatureValue(int value) {
    jadl_sdkJNI.ADLMemoryRequired_iDisplayFeatureValue_set(swigCPtr, this, value);
  }

  public int getIDisplayFeatureValue() {
    return jadl_sdkJNI.ADLMemoryRequired_iDisplayFeatureValue_get(swigCPtr, this);
  }

  public ADLMemoryRequired() {
    this(jadl_sdkJNI.new_ADLMemoryRequired(), true);
  }

}
