/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLControllerOverlayInput {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLControllerOverlayInput(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLControllerOverlayInput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLControllerOverlayInput(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setISize(int value) {
    jadl_sdkJNI.ADLControllerOverlayInput_iSize_set(swigCPtr, this, value);
  }

  public int getISize() {
    return jadl_sdkJNI.ADLControllerOverlayInput_iSize_get(swigCPtr, this);
  }

  public void setIOverlayAdjust(int value) {
    jadl_sdkJNI.ADLControllerOverlayInput_iOverlayAdjust_set(swigCPtr, this, value);
  }

  public int getIOverlayAdjust() {
    return jadl_sdkJNI.ADLControllerOverlayInput_iOverlayAdjust_get(swigCPtr, this);
  }

  public void setIValue(int value) {
    jadl_sdkJNI.ADLControllerOverlayInput_iValue_set(swigCPtr, this, value);
  }

  public int getIValue() {
    return jadl_sdkJNI.ADLControllerOverlayInput_iValue_get(swigCPtr, this);
  }

  public void setIReserved(int value) {
    jadl_sdkJNI.ADLControllerOverlayInput_iReserved_set(swigCPtr, this, value);
  }

  public int getIReserved() {
    return jadl_sdkJNI.ADLControllerOverlayInput_iReserved_get(swigCPtr, this);
  }

  public ADLControllerOverlayInput() {
    this(jadl_sdkJNI.new_ADLControllerOverlayInput(), true);
  }

}