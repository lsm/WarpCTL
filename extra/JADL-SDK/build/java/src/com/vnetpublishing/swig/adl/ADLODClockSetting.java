/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLODClockSetting {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLODClockSetting(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLODClockSetting obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLODClockSetting(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIDefaultClock(int value) {
    jadl_sdkJNI.ADLODClockSetting_iDefaultClock_set(swigCPtr, this, value);
  }

  public int getIDefaultClock() {
    return jadl_sdkJNI.ADLODClockSetting_iDefaultClock_get(swigCPtr, this);
  }

  public void setICurrentClock(int value) {
    jadl_sdkJNI.ADLODClockSetting_iCurrentClock_set(swigCPtr, this, value);
  }

  public int getICurrentClock() {
    return jadl_sdkJNI.ADLODClockSetting_iCurrentClock_get(swigCPtr, this);
  }

  public void setIMaxClock(int value) {
    jadl_sdkJNI.ADLODClockSetting_iMaxClock_set(swigCPtr, this, value);
  }

  public int getIMaxClock() {
    return jadl_sdkJNI.ADLODClockSetting_iMaxClock_get(swigCPtr, this);
  }

  public void setIMinClock(int value) {
    jadl_sdkJNI.ADLODClockSetting_iMinClock_set(swigCPtr, this, value);
  }

  public int getIMinClock() {
    return jadl_sdkJNI.ADLODClockSetting_iMinClock_get(swigCPtr, this);
  }

  public void setIRequestedClock(int value) {
    jadl_sdkJNI.ADLODClockSetting_iRequestedClock_set(swigCPtr, this, value);
  }

  public int getIRequestedClock() {
    return jadl_sdkJNI.ADLODClockSetting_iRequestedClock_get(swigCPtr, this);
  }

  public void setIStepClock(int value) {
    jadl_sdkJNI.ADLODClockSetting_iStepClock_set(swigCPtr, this, value);
  }

  public int getIStepClock() {
    return jadl_sdkJNI.ADLODClockSetting_iStepClock_get(swigCPtr, this);
  }

  public ADLODClockSetting() {
    this(jadl_sdkJNI.new_ADLODClockSetting(), true);
  }

}
