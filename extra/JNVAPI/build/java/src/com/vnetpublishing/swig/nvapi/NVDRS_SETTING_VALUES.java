/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NVDRS_SETTING_VALUES {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NVDRS_SETTING_VALUES(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVDRS_SETTING_VALUES obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NVDRS_SETTING_VALUES(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NVDRS_SETTING_VALUES_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NVDRS_SETTING_VALUES_version_get(swigCPtr, this);
  }

  public void setNumSettingValues(long value) {
    jnvapiJNI.NVDRS_SETTING_VALUES_numSettingValues_set(swigCPtr, this, value);
  }

  public long getNumSettingValues() {
    return jnvapiJNI.NVDRS_SETTING_VALUES_numSettingValues_get(swigCPtr, this);
  }

  public void setSettingType(NVDRS_SETTING_TYPE value) {
    jnvapiJNI.NVDRS_SETTING_VALUES_settingType_set(swigCPtr, this, value.swigValue());
  }

  public NVDRS_SETTING_TYPE getSettingType() {
    return NVDRS_SETTING_TYPE.swigToEnum(jnvapiJNI.NVDRS_SETTING_VALUES_settingType_get(swigCPtr, this));
  }

  public NVDRS_SETTING_VALUES_settingValues getSettingValues() {
    long cPtr = jnvapiJNI.NVDRS_SETTING_VALUES_settingValues_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NVDRS_SETTING_VALUES_settingValues(cPtr, false);
  }

  public NVDRS_SETTING_VALUES() {
    this(jnvapiJNI.new_NVDRS_SETTING_VALUES(), true);
  }

}
