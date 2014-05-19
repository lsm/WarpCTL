/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NVVIOINPUTCONFIG {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NVVIOINPUTCONFIG(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVVIOINPUTCONFIG obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NVVIOINPUTCONFIG(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNumRawCaptureImages(long value) {
    jnvapiJNI.NVVIOINPUTCONFIG_numRawCaptureImages_set(swigCPtr, this, value);
  }

  public long getNumRawCaptureImages() {
    return jnvapiJNI.NVVIOINPUTCONFIG_numRawCaptureImages_get(swigCPtr, this);
  }

  public void setSignalFormat(NVVIOSIGNALFORMAT value) {
    jnvapiJNI.NVVIOINPUTCONFIG_signalFormat_set(swigCPtr, this, value.swigValue());
  }

  public NVVIOSIGNALFORMAT getSignalFormat() {
    return NVVIOSIGNALFORMAT.swigToEnum(jnvapiJNI.NVVIOINPUTCONFIG_signalFormat_get(swigCPtr, this));
  }

  public void setNumStreams(long value) {
    jnvapiJNI.NVVIOINPUTCONFIG_numStreams_set(swigCPtr, this, value);
  }

  public long getNumStreams() {
    return jnvapiJNI.NVVIOINPUTCONFIG_numStreams_get(swigCPtr, this);
  }

  public void setStreams(NVVIOSTREAM value) {
    jnvapiJNI.NVVIOINPUTCONFIG_streams_set(swigCPtr, this, NVVIOSTREAM.getCPtr(value), value);
  }

  public NVVIOSTREAM getStreams() {
    long cPtr = jnvapiJNI.NVVIOINPUTCONFIG_streams_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NVVIOSTREAM(cPtr, false);
  }

  public void setBTestMode(long value) {
    jnvapiJNI.NVVIOINPUTCONFIG_bTestMode_set(swigCPtr, this, value);
  }

  public long getBTestMode() {
    return jnvapiJNI.NVVIOINPUTCONFIG_bTestMode_get(swigCPtr, this);
  }

  public NVVIOINPUTCONFIG() {
    this(jnvapiJNI.new_NVVIOINPUTCONFIG(), true);
  }

}
