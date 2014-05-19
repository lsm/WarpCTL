/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NVDRS_APPLICATION_V2 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NVDRS_APPLICATION_V2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVDRS_APPLICATION_V2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NVDRS_APPLICATION_V2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NVDRS_APPLICATION_V2_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NVDRS_APPLICATION_V2_version_get(swigCPtr, this);
  }

  public void setIsPredefined(long value) {
    jnvapiJNI.NVDRS_APPLICATION_V2_isPredefined_set(swigCPtr, this, value);
  }

  public long getIsPredefined() {
    return jnvapiJNI.NVDRS_APPLICATION_V2_isPredefined_get(swigCPtr, this);
  }

  public void setAppName(int[] value) {
    jnvapiJNI.NVDRS_APPLICATION_V2_appName_set(swigCPtr, this, value);
  }

  public int[] getAppName() {
    return jnvapiJNI.NVDRS_APPLICATION_V2_appName_get(swigCPtr, this);
  }

  public void setUserFriendlyName(int[] value) {
    jnvapiJNI.NVDRS_APPLICATION_V2_userFriendlyName_set(swigCPtr, this, value);
  }

  public int[] getUserFriendlyName() {
    return jnvapiJNI.NVDRS_APPLICATION_V2_userFriendlyName_get(swigCPtr, this);
  }

  public void setLauncher(int[] value) {
    jnvapiJNI.NVDRS_APPLICATION_V2_launcher_set(swigCPtr, this, value);
  }

  public int[] getLauncher() {
    return jnvapiJNI.NVDRS_APPLICATION_V2_launcher_get(swigCPtr, this);
  }

  public void setFileInFolder(int[] value) {
    jnvapiJNI.NVDRS_APPLICATION_V2_fileInFolder_set(swigCPtr, this, value);
  }

  public int[] getFileInFolder() {
    return jnvapiJNI.NVDRS_APPLICATION_V2_fileInFolder_get(swigCPtr, this);
  }

  public NVDRS_APPLICATION_V2() {
    this(jnvapiJNI.new_NVDRS_APPLICATION_V2(), true);
  }

}
