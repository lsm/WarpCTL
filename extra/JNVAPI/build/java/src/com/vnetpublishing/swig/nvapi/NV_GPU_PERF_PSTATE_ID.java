/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NV_GPU_PERF_PSTATE_ID {
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P0 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P0", jnvapiJNI.NVAPI_GPU_PERF_PSTATE_P0_get());
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P1 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P1");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P2 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P2");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P3 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P3");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P4 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P4");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P5 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P5");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P6 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P6");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P7 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P7");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P8 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P8");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P9 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P9");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P10 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P10");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P11 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P11");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P12 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P12");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P13 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P13");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P14 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P14");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_P15 = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_P15");
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_UNDEFINED = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_UNDEFINED", jnvapiJNI.NVAPI_GPU_PERF_PSTATE_UNDEFINED_get());
  public final static NV_GPU_PERF_PSTATE_ID NVAPI_GPU_PERF_PSTATE_ALL = new NV_GPU_PERF_PSTATE_ID("NVAPI_GPU_PERF_PSTATE_ALL");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NV_GPU_PERF_PSTATE_ID swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NV_GPU_PERF_PSTATE_ID.class + " with value " + swigValue);
  }

  private NV_GPU_PERF_PSTATE_ID(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NV_GPU_PERF_PSTATE_ID(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NV_GPU_PERF_PSTATE_ID(String swigName, NV_GPU_PERF_PSTATE_ID swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NV_GPU_PERF_PSTATE_ID[] swigValues = { NVAPI_GPU_PERF_PSTATE_P0, NVAPI_GPU_PERF_PSTATE_P1, NVAPI_GPU_PERF_PSTATE_P2, NVAPI_GPU_PERF_PSTATE_P3, NVAPI_GPU_PERF_PSTATE_P4, NVAPI_GPU_PERF_PSTATE_P5, NVAPI_GPU_PERF_PSTATE_P6, NVAPI_GPU_PERF_PSTATE_P7, NVAPI_GPU_PERF_PSTATE_P8, NVAPI_GPU_PERF_PSTATE_P9, NVAPI_GPU_PERF_PSTATE_P10, NVAPI_GPU_PERF_PSTATE_P11, NVAPI_GPU_PERF_PSTATE_P12, NVAPI_GPU_PERF_PSTATE_P13, NVAPI_GPU_PERF_PSTATE_P14, NVAPI_GPU_PERF_PSTATE_P15, NVAPI_GPU_PERF_PSTATE_UNDEFINED, NVAPI_GPU_PERF_PSTATE_ALL };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

