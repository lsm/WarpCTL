/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLApplicationProfile {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLApplicationProfile(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLApplicationProfile obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLApplicationProfile(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setICount(int value) {
    jadl_sdkJNI.ADLApplicationProfile_iCount_set(swigCPtr, this, value);
  }

  public int getICount() {
    return jadl_sdkJNI.ADLApplicationProfile_iCount_get(swigCPtr, this);
  }

  public void setRecord(PropertyRecord value) {
    jadl_sdkJNI.ADLApplicationProfile_record_set(swigCPtr, this, PropertyRecord.getCPtr(value), value);
  }

  public PropertyRecord getRecord() {
    long cPtr = jadl_sdkJNI.ADLApplicationProfile_record_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PropertyRecord(cPtr, false);
  }

  public ADLApplicationProfile() {
    this(jadl_sdkJNI.new_ADLApplicationProfile(), true);
  }

}
