/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_GSYNC_STATUS_PARAMS {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_GSYNC_STATUS_PARAMS(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_GSYNC_STATUS_PARAMS obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_GSYNC_STATUS_PARAMS(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NV_GSYNC_STATUS_PARAMS_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NV_GSYNC_STATUS_PARAMS_version_get(swigCPtr, this);
  }

  public void setRefreshRate(long value) {
    jnvapiJNI.NV_GSYNC_STATUS_PARAMS_refreshRate_set(swigCPtr, this, value);
  }

  public long getRefreshRate() {
    return jnvapiJNI.NV_GSYNC_STATUS_PARAMS_refreshRate_get(swigCPtr, this);
  }

  public void setRJ45_IO(SWIGTYPE_p__NVAPI_GSYNC_RJ45_IO value) {
    jnvapiJNI.NV_GSYNC_STATUS_PARAMS_RJ45_IO_set(swigCPtr, this, SWIGTYPE_p__NVAPI_GSYNC_RJ45_IO.getCPtr(value));
  }

  public SWIGTYPE_p__NVAPI_GSYNC_RJ45_IO getRJ45_IO() {
    long cPtr = jnvapiJNI.NV_GSYNC_STATUS_PARAMS_RJ45_IO_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p__NVAPI_GSYNC_RJ45_IO(cPtr, false);
  }

  public void setRJ45_Ethernet(long[] value) {
    jnvapiJNI.NV_GSYNC_STATUS_PARAMS_RJ45_Ethernet_set(swigCPtr, this, value);
  }

  public long[] getRJ45_Ethernet() {
    return jnvapiJNI.NV_GSYNC_STATUS_PARAMS_RJ45_Ethernet_get(swigCPtr, this);
  }

  public void setHouseSyncIncoming(long value) {
    jnvapiJNI.NV_GSYNC_STATUS_PARAMS_houseSyncIncoming_set(swigCPtr, this, value);
  }

  public long getHouseSyncIncoming() {
    return jnvapiJNI.NV_GSYNC_STATUS_PARAMS_houseSyncIncoming_get(swigCPtr, this);
  }

  public void setBHouseSync(long value) {
    jnvapiJNI.NV_GSYNC_STATUS_PARAMS_bHouseSync_set(swigCPtr, this, value);
  }

  public long getBHouseSync() {
    return jnvapiJNI.NV_GSYNC_STATUS_PARAMS_bHouseSync_get(swigCPtr, this);
  }

  public NV_GSYNC_STATUS_PARAMS() {
    this(jnvapiJNI.new_NV_GSYNC_STATUS_PARAMS(), true);
  }

}
