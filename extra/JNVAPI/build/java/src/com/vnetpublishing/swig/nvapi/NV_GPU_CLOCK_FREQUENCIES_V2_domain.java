/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_GPU_CLOCK_FREQUENCIES_V2_domain {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_GPU_CLOCK_FREQUENCIES_V2_domain(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_GPU_CLOCK_FREQUENCIES_V2_domain obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_GPU_CLOCK_FREQUENCIES_V2_domain(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBIsPresent(long value) {
    jnvapiJNI.NV_GPU_CLOCK_FREQUENCIES_V2_domain_bIsPresent_set(swigCPtr, this, value);
  }

  public long getBIsPresent() {
    return jnvapiJNI.NV_GPU_CLOCK_FREQUENCIES_V2_domain_bIsPresent_get(swigCPtr, this);
  }

  public void setReserved(long value) {
    jnvapiJNI.NV_GPU_CLOCK_FREQUENCIES_V2_domain_reserved_set(swigCPtr, this, value);
  }

  public long getReserved() {
    return jnvapiJNI.NV_GPU_CLOCK_FREQUENCIES_V2_domain_reserved_get(swigCPtr, this);
  }

  public void setFrequency(long value) {
    jnvapiJNI.NV_GPU_CLOCK_FREQUENCIES_V2_domain_frequency_set(swigCPtr, this, value);
  }

  public long getFrequency() {
    return jnvapiJNI.NV_GPU_CLOCK_FREQUENCIES_V2_domain_frequency_get(swigCPtr, this);
  }

  public NV_GPU_CLOCK_FREQUENCIES_V2_domain() {
    this(jnvapiJNI.new_NV_GPU_CLOCK_FREQUENCIES_V2_domain(), true);
  }

}