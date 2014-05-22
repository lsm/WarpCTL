/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLSLSMode {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLSLSMode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLSLSMode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLSLSMode(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIAdapterIndex(int value) {
    jadl_sdkJNI.ADLSLSMode_iAdapterIndex_set(swigCPtr, this, value);
  }

  public int getIAdapterIndex() {
    return jadl_sdkJNI.ADLSLSMode_iAdapterIndex_get(swigCPtr, this);
  }

  public void setISLSMapIndex(int value) {
    jadl_sdkJNI.ADLSLSMode_iSLSMapIndex_set(swigCPtr, this, value);
  }

  public int getISLSMapIndex() {
    return jadl_sdkJNI.ADLSLSMode_iSLSMapIndex_get(swigCPtr, this);
  }

  public void setISLSModeIndex(int value) {
    jadl_sdkJNI.ADLSLSMode_iSLSModeIndex_set(swigCPtr, this, value);
  }

  public int getISLSModeIndex() {
    return jadl_sdkJNI.ADLSLSMode_iSLSModeIndex_get(swigCPtr, this);
  }

  public void setDisplayMode(ADLMode value) {
    jadl_sdkJNI.ADLSLSMode_displayMode_set(swigCPtr, this, ADLMode.getCPtr(value), value);
  }

  public ADLMode getDisplayMode() {
    long cPtr = jadl_sdkJNI.ADLSLSMode_displayMode_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ADLMode(cPtr, false);
  }

  public void setISLSNativeModeMask(int value) {
    jadl_sdkJNI.ADLSLSMode_iSLSNativeModeMask_set(swigCPtr, this, value);
  }

  public int getISLSNativeModeMask() {
    return jadl_sdkJNI.ADLSLSMode_iSLSNativeModeMask_get(swigCPtr, this);
  }

  public void setISLSNativeModeValue(int value) {
    jadl_sdkJNI.ADLSLSMode_iSLSNativeModeValue_set(swigCPtr, this, value);
  }

  public int getISLSNativeModeValue() {
    return jadl_sdkJNI.ADLSLSMode_iSLSNativeModeValue_get(swigCPtr, this);
  }

  public ADLSLSMode() {
    this(jadl_sdkJNI.new_ADLSLSMode(), true);
  }

}
