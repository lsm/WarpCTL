/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLOD6MaxClockAdjust {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLOD6MaxClockAdjust(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLOD6MaxClockAdjust obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLOD6MaxClockAdjust(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIEngineClockMax(int value) {
    jadl_sdkJNI.ADLOD6MaxClockAdjust_iEngineClockMax_set(swigCPtr, this, value);
  }

  public int getIEngineClockMax() {
    return jadl_sdkJNI.ADLOD6MaxClockAdjust_iEngineClockMax_get(swigCPtr, this);
  }

  public void setIMemoryClockMax(int value) {
    jadl_sdkJNI.ADLOD6MaxClockAdjust_iMemoryClockMax_set(swigCPtr, this, value);
  }

  public int getIMemoryClockMax() {
    return jadl_sdkJNI.ADLOD6MaxClockAdjust_iMemoryClockMax_get(swigCPtr, this);
  }

  public void setIExtValue(int value) {
    jadl_sdkJNI.ADLOD6MaxClockAdjust_iExtValue_set(swigCPtr, this, value);
  }

  public int getIExtValue() {
    return jadl_sdkJNI.ADLOD6MaxClockAdjust_iExtValue_get(swigCPtr, this);
  }

  public void setIExtMask(int value) {
    jadl_sdkJNI.ADLOD6MaxClockAdjust_iExtMask_set(swigCPtr, this, value);
  }

  public int getIExtMask() {
    return jadl_sdkJNI.ADLOD6MaxClockAdjust_iExtMask_get(swigCPtr, this);
  }

  public ADLOD6MaxClockAdjust() {
    this(jadl_sdkJNI.new_ADLOD6MaxClockAdjust(), true);
  }

}
