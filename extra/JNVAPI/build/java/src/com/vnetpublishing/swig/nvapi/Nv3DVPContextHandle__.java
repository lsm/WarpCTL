/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public class Nv3DVPContextHandle__ {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Nv3DVPContextHandle__(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Nv3DVPContextHandle__ obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jnvapiJNI.delete_Nv3DVPContextHandle__(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUnused(int value) {
    jnvapiJNI.Nv3DVPContextHandle___unused_set(swigCPtr, this, value);
  }

  public int getUnused() {
    return jnvapiJNI.Nv3DVPContextHandle___unused_get(swigCPtr, this);
  }

  public Nv3DVPContextHandle__() {
    this(jnvapiJNI.new_Nv3DVPContextHandle__(), true);
  }

}