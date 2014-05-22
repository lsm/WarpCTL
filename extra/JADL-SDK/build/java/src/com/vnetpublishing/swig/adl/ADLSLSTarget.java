/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLSLSTarget {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLSLSTarget(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLSLSTarget obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLSLSTarget(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIAdapterIndex(int value) {
    jadl_sdkJNI.ADLSLSTarget_iAdapterIndex_set(swigCPtr, this, value);
  }

  public int getIAdapterIndex() {
    return jadl_sdkJNI.ADLSLSTarget_iAdapterIndex_get(swigCPtr, this);
  }

  public void setISLSMapIndex(int value) {
    jadl_sdkJNI.ADLSLSTarget_iSLSMapIndex_set(swigCPtr, this, value);
  }

  public int getISLSMapIndex() {
    return jadl_sdkJNI.ADLSLSTarget_iSLSMapIndex_get(swigCPtr, this);
  }

  public void setDisplayTarget(ADLDisplayTarget value) {
    jadl_sdkJNI.ADLSLSTarget_displayTarget_set(swigCPtr, this, ADLDisplayTarget.getCPtr(value), value);
  }

  public ADLDisplayTarget getDisplayTarget() {
    long cPtr = jadl_sdkJNI.ADLSLSTarget_displayTarget_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ADLDisplayTarget(cPtr, false);
  }

  public void setISLSGridPositionX(int value) {
    jadl_sdkJNI.ADLSLSTarget_iSLSGridPositionX_set(swigCPtr, this, value);
  }

  public int getISLSGridPositionX() {
    return jadl_sdkJNI.ADLSLSTarget_iSLSGridPositionX_get(swigCPtr, this);
  }

  public void setISLSGridPositionY(int value) {
    jadl_sdkJNI.ADLSLSTarget_iSLSGridPositionY_set(swigCPtr, this, value);
  }

  public int getISLSGridPositionY() {
    return jadl_sdkJNI.ADLSLSTarget_iSLSGridPositionY_get(swigCPtr, this);
  }

  public void setViewSize(ADLMode value) {
    jadl_sdkJNI.ADLSLSTarget_viewSize_set(swigCPtr, this, ADLMode.getCPtr(value), value);
  }

  public ADLMode getViewSize() {
    long cPtr = jadl_sdkJNI.ADLSLSTarget_viewSize_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ADLMode(cPtr, false);
  }

  public void setISLSTargetMask(int value) {
    jadl_sdkJNI.ADLSLSTarget_iSLSTargetMask_set(swigCPtr, this, value);
  }

  public int getISLSTargetMask() {
    return jadl_sdkJNI.ADLSLSTarget_iSLSTargetMask_get(swigCPtr, this);
  }

  public void setISLSTargetValue(int value) {
    jadl_sdkJNI.ADLSLSTarget_iSLSTargetValue_set(swigCPtr, this, value);
  }

  public int getISLSTargetValue() {
    return jadl_sdkJNI.ADLSLSTarget_iSLSTargetValue_get(swigCPtr, this);
  }

  public ADLSLSTarget() {
    this(jadl_sdkJNI.new_ADLSLSTarget(), true);
  }

}
