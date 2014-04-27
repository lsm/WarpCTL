/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLGlSyncPortInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLGlSyncPortInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLGlSyncPortInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLGlSyncPortInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIPortType(int value) {
    jadl_sdkJNI.ADLGlSyncPortInfo_iPortType_set(swigCPtr, this, value);
  }

  public int getIPortType() {
    return jadl_sdkJNI.ADLGlSyncPortInfo_iPortType_get(swigCPtr, this);
  }

  public void setINumOfLEDs(int value) {
    jadl_sdkJNI.ADLGlSyncPortInfo_iNumOfLEDs_set(swigCPtr, this, value);
  }

  public int getINumOfLEDs() {
    return jadl_sdkJNI.ADLGlSyncPortInfo_iNumOfLEDs_get(swigCPtr, this);
  }

  public void setIPortState(int value) {
    jadl_sdkJNI.ADLGlSyncPortInfo_iPortState_set(swigCPtr, this, value);
  }

  public int getIPortState() {
    return jadl_sdkJNI.ADLGlSyncPortInfo_iPortState_get(swigCPtr, this);
  }

  public void setIFrequency(int value) {
    jadl_sdkJNI.ADLGlSyncPortInfo_iFrequency_set(swigCPtr, this, value);
  }

  public int getIFrequency() {
    return jadl_sdkJNI.ADLGlSyncPortInfo_iFrequency_get(swigCPtr, this);
  }

  public void setISignalType(int value) {
    jadl_sdkJNI.ADLGlSyncPortInfo_iSignalType_set(swigCPtr, this, value);
  }

  public int getISignalType() {
    return jadl_sdkJNI.ADLGlSyncPortInfo_iSignalType_get(swigCPtr, this);
  }

  public void setISignalSource(int value) {
    jadl_sdkJNI.ADLGlSyncPortInfo_iSignalSource_set(swigCPtr, this, value);
  }

  public int getISignalSource() {
    return jadl_sdkJNI.ADLGlSyncPortInfo_iSignalSource_get(swigCPtr, this);
  }

  public ADLGlSyncPortInfo() {
    this(jadl_sdkJNI.new_ADLGlSyncPortInfo(), true);
  }

}