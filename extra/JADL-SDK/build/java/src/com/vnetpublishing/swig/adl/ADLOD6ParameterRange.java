/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLOD6ParameterRange {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLOD6ParameterRange(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLOD6ParameterRange obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLOD6ParameterRange(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIMin(int value) {
    jadl_sdkJNI.ADLOD6ParameterRange_iMin_set(swigCPtr, this, value);
  }

  public int getIMin() {
    return jadl_sdkJNI.ADLOD6ParameterRange_iMin_get(swigCPtr, this);
  }

  public void setIMax(int value) {
    jadl_sdkJNI.ADLOD6ParameterRange_iMax_set(swigCPtr, this, value);
  }

  public int getIMax() {
    return jadl_sdkJNI.ADLOD6ParameterRange_iMax_get(swigCPtr, this);
  }

  public void setIStep(int value) {
    jadl_sdkJNI.ADLOD6ParameterRange_iStep_set(swigCPtr, this, value);
  }

  public int getIStep() {
    return jadl_sdkJNI.ADLOD6ParameterRange_iStep_get(swigCPtr, this);
  }

  public ADLOD6ParameterRange() {
    this(jadl_sdkJNI.new_ADLOD6ParameterRange(), true);
  }

}
