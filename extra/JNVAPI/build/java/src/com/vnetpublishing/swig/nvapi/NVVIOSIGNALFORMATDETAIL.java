/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NVVIOSIGNALFORMATDETAIL {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NVVIOSIGNALFORMATDETAIL(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVVIOSIGNALFORMATDETAIL obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NVVIOSIGNALFORMATDETAIL(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSignalFormat(NVVIOSIGNALFORMAT value) {
    jnvapiJNI.NVVIOSIGNALFORMATDETAIL_signalFormat_set(swigCPtr, this, value.swigValue());
  }

  public NVVIOSIGNALFORMAT getSignalFormat() {
    return NVVIOSIGNALFORMAT.swigToEnum(jnvapiJNI.NVVIOSIGNALFORMATDETAIL_signalFormat_get(swigCPtr, this));
  }

  public void setVideoMode(NVVIOVIDEOMODE value) {
    jnvapiJNI.NVVIOSIGNALFORMATDETAIL_videoMode_set(swigCPtr, this, NVVIOVIDEOMODE.getCPtr(value), value);
  }

  public NVVIOVIDEOMODE getVideoMode() {
    long cPtr = jnvapiJNI.NVVIOSIGNALFORMATDETAIL_videoMode_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NVVIOVIDEOMODE(cPtr, false);
  }

  public NVVIOSIGNALFORMATDETAIL() {
    this(jnvapiJNI.new_NVVIOSIGNALFORMATDETAIL(), true);
  }

}
