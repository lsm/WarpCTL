/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class NV_GSYNC_CAPABILITIES {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected NV_GSYNC_CAPABILITIES(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NV_GSYNC_CAPABILITIES obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_NV_GSYNC_CAPABILITIES(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(long value) {
    jnvapiJNI.NV_GSYNC_CAPABILITIES_version_set(swigCPtr, this, value);
  }

  public long getVersion() {
    return jnvapiJNI.NV_GSYNC_CAPABILITIES_version_get(swigCPtr, this);
  }

  public void setBoardId(long value) {
    jnvapiJNI.NV_GSYNC_CAPABILITIES_boardId_set(swigCPtr, this, value);
  }

  public long getBoardId() {
    return jnvapiJNI.NV_GSYNC_CAPABILITIES_boardId_get(swigCPtr, this);
  }

  public void setRevision(long value) {
    jnvapiJNI.NV_GSYNC_CAPABILITIES_revision_set(swigCPtr, this, value);
  }

  public long getRevision() {
    return jnvapiJNI.NV_GSYNC_CAPABILITIES_revision_get(swigCPtr, this);
  }

  public void setCapFlags(long value) {
    jnvapiJNI.NV_GSYNC_CAPABILITIES_capFlags_set(swigCPtr, this, value);
  }

  public long getCapFlags() {
    return jnvapiJNI.NV_GSYNC_CAPABILITIES_capFlags_get(swigCPtr, this);
  }

  public NV_GSYNC_CAPABILITIES() {
    this(jnvapiJNI.new_NV_GSYNC_CAPABILITIES(), true);
  }

}