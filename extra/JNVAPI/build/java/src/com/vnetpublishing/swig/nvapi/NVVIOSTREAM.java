/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NVVIOSTREAM {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NVVIOSTREAM(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NVVIOSTREAM obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NVVIOSTREAM(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBitsPerComponent(long value) {
    jnvapiJNI.NVVIOSTREAM_bitsPerComponent_set(swigCPtr, this, value);
  }

  public long getBitsPerComponent() {
    return jnvapiJNI.NVVIOSTREAM_bitsPerComponent_get(swigCPtr, this);
  }

  public void setSampling(NVVIOCOMPONENTSAMPLING value) {
    jnvapiJNI.NVVIOSTREAM_sampling_set(swigCPtr, this, value.swigValue());
  }

  public NVVIOCOMPONENTSAMPLING getSampling() {
    return NVVIOCOMPONENTSAMPLING.swigToEnum(jnvapiJNI.NVVIOSTREAM_sampling_get(swigCPtr, this));
  }

  public void setExpansionEnable(long value) {
    jnvapiJNI.NVVIOSTREAM_expansionEnable_set(swigCPtr, this, value);
  }

  public long getExpansionEnable() {
    return jnvapiJNI.NVVIOSTREAM_expansionEnable_get(swigCPtr, this);
  }

  public void setNumLinks(long value) {
    jnvapiJNI.NVVIOSTREAM_numLinks_set(swigCPtr, this, value);
  }

  public long getNumLinks() {
    return jnvapiJNI.NVVIOSTREAM_numLinks_get(swigCPtr, this);
  }

  public NVVIOSTREAM_links getLinks() {
    long cPtr = jnvapiJNI.NVVIOSTREAM_links_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NVVIOSTREAM_links(cPtr, false);
  }

  public NVVIOSTREAM() {
    this(jnvapiJNI.new_NVVIOSTREAM(), true);
  }

}