/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLDisplayIdentifier {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLDisplayIdentifier(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLDisplayIdentifier obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLDisplayIdentifier(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUlDisplayIndex(int value) {
    jadl_sdkJNI.ADLDisplayIdentifier_ulDisplayIndex_set(swigCPtr, this, value);
  }

  public int getUlDisplayIndex() {
    return jadl_sdkJNI.ADLDisplayIdentifier_ulDisplayIndex_get(swigCPtr, this);
  }

  public void setUlManufacturerId(int value) {
    jadl_sdkJNI.ADLDisplayIdentifier_ulManufacturerId_set(swigCPtr, this, value);
  }

  public int getUlManufacturerId() {
    return jadl_sdkJNI.ADLDisplayIdentifier_ulManufacturerId_get(swigCPtr, this);
  }

  public void setUlProductId(int value) {
    jadl_sdkJNI.ADLDisplayIdentifier_ulProductId_set(swigCPtr, this, value);
  }

  public int getUlProductId() {
    return jadl_sdkJNI.ADLDisplayIdentifier_ulProductId_get(swigCPtr, this);
  }

  public void setUlSerialNo(int value) {
    jadl_sdkJNI.ADLDisplayIdentifier_ulSerialNo_set(swigCPtr, this, value);
  }

  public int getUlSerialNo() {
    return jadl_sdkJNI.ADLDisplayIdentifier_ulSerialNo_get(swigCPtr, this);
  }

  public ADLDisplayIdentifier() {
    this(jadl_sdkJNI.new_ADLDisplayIdentifier(), true);
  }

}
