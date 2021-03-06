/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLMemoryDisplayFeatures {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLMemoryDisplayFeatures(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLMemoryDisplayFeatures obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLMemoryDisplayFeatures(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIDisplayIndex(int value) {
    jadl_sdkJNI.ADLMemoryDisplayFeatures_iDisplayIndex_set(swigCPtr, this, value);
  }

  public int getIDisplayIndex() {
    return jadl_sdkJNI.ADLMemoryDisplayFeatures_iDisplayIndex_get(swigCPtr, this);
  }

  public void setIDisplayFeatureValue(int value) {
    jadl_sdkJNI.ADLMemoryDisplayFeatures_iDisplayFeatureValue_set(swigCPtr, this, value);
  }

  public int getIDisplayFeatureValue() {
    return jadl_sdkJNI.ADLMemoryDisplayFeatures_iDisplayFeatureValue_get(swigCPtr, this);
  }

  public ADLMemoryDisplayFeatures() {
    this(jadl_sdkJNI.new_ADLMemoryDisplayFeatures(), true);
  }

}
