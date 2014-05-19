/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1_version_get(swigCPtr, this);
  }

  public void setHPhysicalGpu(NvPhysicalGpuHandle__ value) {
    jnvapiJNI.NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1_hPhysicalGpu_set(swigCPtr, this, NvPhysicalGpuHandle__.getCPtr(value), value);
  }

  public NvPhysicalGpuHandle__ getHPhysicalGpu() {
    long cPtr = jnvapiJNI.NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1_hPhysicalGpu_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NvPhysicalGpuHandle__(cPtr, false);
  }

  public void setAttribute(NV_GPU_ILLUMINATION_ATTRIB value) {
    jnvapiJNI.NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1_Attribute_set(swigCPtr, this, value.swigValue());
  }

  public NV_GPU_ILLUMINATION_ATTRIB getAttribute() {
    return NV_GPU_ILLUMINATION_ATTRIB.swigToEnum(jnvapiJNI.NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1_Attribute_get(swigCPtr, this));
  }

  public void setBSupported(long value) {
    jnvapiJNI.NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1_bSupported_set(swigCPtr, this, value);
  }

  public long getBSupported() {
    return jnvapiJNI.NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1_bSupported_get(swigCPtr, this);
  }

  public NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1() {
    this(jnvapiJNI.new_NV_GPU_QUERY_ILLUMINATION_SUPPORT_PARM_V1(), true);
  }

}
