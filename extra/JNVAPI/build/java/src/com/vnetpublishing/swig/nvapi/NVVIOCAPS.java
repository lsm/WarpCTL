/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NVVIOCAPS {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NVVIOCAPS(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVVIOCAPS obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NVVIOCAPS(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NVVIOCAPS_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NVVIOCAPS_version_get(swigCPtr, this);
  }

  public void setAdapterName(String value) {
    jnvapiJNI.NVVIOCAPS_adapterName_set(swigCPtr, this, value);
  }

  public String getAdapterName() {
    return jnvapiJNI.NVVIOCAPS_adapterName_get(swigCPtr, this);
  }

  public void setAdapterClass(long value) {
    jnvapiJNI.NVVIOCAPS_adapterClass_set(swigCPtr, this, value);
  }

  public long getAdapterClass() {
    return jnvapiJNI.NVVIOCAPS_adapterClass_get(swigCPtr, this);
  }

  public void setAdapterCaps(long value) {
    jnvapiJNI.NVVIOCAPS_adapterCaps_set(swigCPtr, this, value);
  }

  public long getAdapterCaps() {
    return jnvapiJNI.NVVIOCAPS_adapterCaps_get(swigCPtr, this);
  }

  public void setDipSwitch(long value) {
    jnvapiJNI.NVVIOCAPS_dipSwitch_set(swigCPtr, this, value);
  }

  public long getDipSwitch() {
    return jnvapiJNI.NVVIOCAPS_dipSwitch_get(swigCPtr, this);
  }

  public void setDipSwitchReserved(long value) {
    jnvapiJNI.NVVIOCAPS_dipSwitchReserved_set(swigCPtr, this, value);
  }

  public long getDipSwitchReserved() {
    return jnvapiJNI.NVVIOCAPS_dipSwitchReserved_get(swigCPtr, this);
  }

  public void setBoardID(long value) {
    jnvapiJNI.NVVIOCAPS_boardID_set(swigCPtr, this, value);
  }

  public long getBoardID() {
    return jnvapiJNI.NVVIOCAPS_boardID_get(swigCPtr, this);
  }

  public void setOwnerId(long value) {
    jnvapiJNI.NVVIOCAPS_ownerId_set(swigCPtr, this, value);
  }

  public long getOwnerId() {
    return jnvapiJNI.NVVIOCAPS_ownerId_get(swigCPtr, this);
  }

  public void setOwnerType(NVVIOOWNERTYPE value) {
    jnvapiJNI.NVVIOCAPS_ownerType_set(swigCPtr, this, value.swigValue());
  }

  public NVVIOOWNERTYPE getOwnerType() {
    return NVVIOOWNERTYPE.swigToEnum(jnvapiJNI.NVVIOCAPS_ownerType_get(swigCPtr, this));
  }

  public NVVIOCAPS_driver getDriver() {
    long cPtr = jnvapiJNI.NVVIOCAPS_driver_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NVVIOCAPS_driver(cPtr, false);
  }

  public NVVIOCAPS_firmWare getFirmWare() {
    long cPtr = jnvapiJNI.NVVIOCAPS_firmWare_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NVVIOCAPS_firmWare(cPtr, false);
  }

  public NVVIOCAPS() {
    this(jnvapiJNI.new_NVVIOCAPS(), true);
  }

}
