/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLCrossfireInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLCrossfireInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLCrossfireInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLCrossfireInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIErrorCode(int value) {
    jadl_sdkJNI.ADLCrossfireInfo_iErrorCode_set(swigCPtr, this, value);
  }

  public int getIErrorCode() {
    return jadl_sdkJNI.ADLCrossfireInfo_iErrorCode_get(swigCPtr, this);
  }

  public void setIState(int value) {
    jadl_sdkJNI.ADLCrossfireInfo_iState_set(swigCPtr, this, value);
  }

  public int getIState() {
    return jadl_sdkJNI.ADLCrossfireInfo_iState_get(swigCPtr, this);
  }

  public void setISupported(int value) {
    jadl_sdkJNI.ADLCrossfireInfo_iSupported_set(swigCPtr, this, value);
  }

  public int getISupported() {
    return jadl_sdkJNI.ADLCrossfireInfo_iSupported_get(swigCPtr, this);
  }

  public ADLCrossfireInfo() {
    this(jadl_sdkJNI.new_ADLCrossfireInfo(), true);
  }

}
