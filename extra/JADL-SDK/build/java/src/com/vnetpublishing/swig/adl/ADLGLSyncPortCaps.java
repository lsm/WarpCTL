/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLGLSyncPortCaps {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLGLSyncPortCaps(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLGLSyncPortCaps obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLGLSyncPortCaps(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIPortType(int value) {
    jadl_sdkJNI.ADLGLSyncPortCaps_iPortType_set(swigCPtr, this, value);
  }

  public int getIPortType() {
    return jadl_sdkJNI.ADLGLSyncPortCaps_iPortType_get(swigCPtr, this);
  }

  public void setINumOfLEDs(int value) {
    jadl_sdkJNI.ADLGLSyncPortCaps_iNumOfLEDs_set(swigCPtr, this, value);
  }

  public int getINumOfLEDs() {
    return jadl_sdkJNI.ADLGLSyncPortCaps_iNumOfLEDs_get(swigCPtr, this);
  }

  public ADLGLSyncPortCaps() {
    this(jadl_sdkJNI.new_ADLGLSyncPortCaps(), true);
  }

}
