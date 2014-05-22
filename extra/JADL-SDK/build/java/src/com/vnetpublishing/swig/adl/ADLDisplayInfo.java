/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public class ADLDisplayInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ADLDisplayInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ADLDisplayInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jadl_sdkJNI.delete_ADLDisplayInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDisplayID(ADLDisplayID value) {
    jadl_sdkJNI.ADLDisplayInfo_displayID_set(swigCPtr, this, ADLDisplayID.getCPtr(value), value);
  }

  public ADLDisplayID getDisplayID() {
    long cPtr = jadl_sdkJNI.ADLDisplayInfo_displayID_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ADLDisplayID(cPtr, false);
  }

  public void setIDisplayControllerIndex(int value) {
    jadl_sdkJNI.ADLDisplayInfo_iDisplayControllerIndex_set(swigCPtr, this, value);
  }

  public int getIDisplayControllerIndex() {
    return jadl_sdkJNI.ADLDisplayInfo_iDisplayControllerIndex_get(swigCPtr, this);
  }

  public void setStrDisplayName(String value) {
    jadl_sdkJNI.ADLDisplayInfo_strDisplayName_set(swigCPtr, this, value);
  }

  public String getStrDisplayName() {
    return jadl_sdkJNI.ADLDisplayInfo_strDisplayName_get(swigCPtr, this);
  }

  public void setStrDisplayManufacturerName(String value) {
    jadl_sdkJNI.ADLDisplayInfo_strDisplayManufacturerName_set(swigCPtr, this, value);
  }

  public String getStrDisplayManufacturerName() {
    return jadl_sdkJNI.ADLDisplayInfo_strDisplayManufacturerName_get(swigCPtr, this);
  }

  public void setIDisplayType(int value) {
    jadl_sdkJNI.ADLDisplayInfo_iDisplayType_set(swigCPtr, this, value);
  }

  public int getIDisplayType() {
    return jadl_sdkJNI.ADLDisplayInfo_iDisplayType_get(swigCPtr, this);
  }

  public void setIDisplayOutputType(int value) {
    jadl_sdkJNI.ADLDisplayInfo_iDisplayOutputType_set(swigCPtr, this, value);
  }

  public int getIDisplayOutputType() {
    return jadl_sdkJNI.ADLDisplayInfo_iDisplayOutputType_get(swigCPtr, this);
  }

  public void setIDisplayConnector(int value) {
    jadl_sdkJNI.ADLDisplayInfo_iDisplayConnector_set(swigCPtr, this, value);
  }

  public int getIDisplayConnector() {
    return jadl_sdkJNI.ADLDisplayInfo_iDisplayConnector_get(swigCPtr, this);
  }

  public void setIDisplayInfoMask(int value) {
    jadl_sdkJNI.ADLDisplayInfo_iDisplayInfoMask_set(swigCPtr, this, value);
  }

  public int getIDisplayInfoMask() {
    return jadl_sdkJNI.ADLDisplayInfo_iDisplayInfoMask_get(swigCPtr, this);
  }

  public void setIDisplayInfoValue(int value) {
    jadl_sdkJNI.ADLDisplayInfo_iDisplayInfoValue_set(swigCPtr, this, value);
  }

  public int getIDisplayInfoValue() {
    return jadl_sdkJNI.ADLDisplayInfo_iDisplayInfoValue_get(swigCPtr, this);
  }

  public ADLDisplayInfo() {
    this(jadl_sdkJNI.new_ADLDisplayInfo(), true);
  }

}
