/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NVVIOCONFIG_V3_vioConfig {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NVVIOCONFIG_V3_vioConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVVIOCONFIG_V3_vioConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NVVIOCONFIG_V3_vioConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInConfig(NVVIOINPUTCONFIG value) {
    jnvapiJNI.NVVIOCONFIG_V3_vioConfig_inConfig_set(swigCPtr, this, NVVIOINPUTCONFIG.getCPtr(value), value);
  }

  public NVVIOINPUTCONFIG getInConfig() {
    long cPtr = jnvapiJNI.NVVIOCONFIG_V3_vioConfig_inConfig_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NVVIOINPUTCONFIG(cPtr, false);
  }

  public void setOutConfig(NVVIOOUTPUTCONFIG_V3 value) {
    jnvapiJNI.NVVIOCONFIG_V3_vioConfig_outConfig_set(swigCPtr, this, NVVIOOUTPUTCONFIG_V3.getCPtr(value), value);
  }

  public NVVIOOUTPUTCONFIG_V3 getOutConfig() {
    long cPtr = jnvapiJNI.NVVIOCONFIG_V3_vioConfig_outConfig_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NVVIOOUTPUTCONFIG_V3(cPtr, false);
  }

  public NVVIOCONFIG_V3_vioConfig() {
    this(jnvapiJNI.new_NVVIOCONFIG_V3_vioConfig(), true);
  }

}
