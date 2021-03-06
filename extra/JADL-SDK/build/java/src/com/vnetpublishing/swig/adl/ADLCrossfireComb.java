/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLCrossfireComb {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLCrossfireComb(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLCrossfireComb obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLCrossfireComb(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setINumLinkAdapter(int value) {
    jadl_sdkJNI.ADLCrossfireComb_iNumLinkAdapter_set(swigCPtr, this, value);
  }

  public int getINumLinkAdapter() {
    return jadl_sdkJNI.ADLCrossfireComb_iNumLinkAdapter_get(swigCPtr, this);
  }

  public void setIAdaptLink(int[] value) {
    jadl_sdkJNI.ADLCrossfireComb_iAdaptLink_set(swigCPtr, this, value);
  }

  public int[] getIAdaptLink() {
    return jadl_sdkJNI.ADLCrossfireComb_iAdaptLink_get(swigCPtr, this);
  }

  public ADLCrossfireComb() {
    this(jadl_sdkJNI.new_ADLCrossfireComb(), true);
  }

}
