/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NVAPI_GPU_PERF_DECREASE {
  public final static NVAPI_GPU_PERF_DECREASE NV_GPU_PERF_DECREASE_NONE = new NVAPI_GPU_PERF_DECREASE("NV_GPU_PERF_DECREASE_NONE", jnvapiJNI.NV_GPU_PERF_DECREASE_NONE_get());
  public final static NVAPI_GPU_PERF_DECREASE NV_GPU_PERF_DECREASE_REASON_THERMAL_PROTECTION = new NVAPI_GPU_PERF_DECREASE("NV_GPU_PERF_DECREASE_REASON_THERMAL_PROTECTION", jnvapiJNI.NV_GPU_PERF_DECREASE_REASON_THERMAL_PROTECTION_get());
  public final static NVAPI_GPU_PERF_DECREASE NV_GPU_PERF_DECREASE_REASON_POWER_CONTROL = new NVAPI_GPU_PERF_DECREASE("NV_GPU_PERF_DECREASE_REASON_POWER_CONTROL", jnvapiJNI.NV_GPU_PERF_DECREASE_REASON_POWER_CONTROL_get());
  public final static NVAPI_GPU_PERF_DECREASE NV_GPU_PERF_DECREASE_REASON_AC_BATT = new NVAPI_GPU_PERF_DECREASE("NV_GPU_PERF_DECREASE_REASON_AC_BATT", jnvapiJNI.NV_GPU_PERF_DECREASE_REASON_AC_BATT_get());
  public final static NVAPI_GPU_PERF_DECREASE NV_GPU_PERF_DECREASE_REASON_API_TRIGGERED = new NVAPI_GPU_PERF_DECREASE("NV_GPU_PERF_DECREASE_REASON_API_TRIGGERED", jnvapiJNI.NV_GPU_PERF_DECREASE_REASON_API_TRIGGERED_get());
  public final static NVAPI_GPU_PERF_DECREASE NV_GPU_PERF_DECREASE_REASON_INSUFFICIENT_POWER = new NVAPI_GPU_PERF_DECREASE("NV_GPU_PERF_DECREASE_REASON_INSUFFICIENT_POWER", jnvapiJNI.NV_GPU_PERF_DECREASE_REASON_INSUFFICIENT_POWER_get());
  public final static NVAPI_GPU_PERF_DECREASE NV_GPU_PERF_DECREASE_REASON_UNKNOWN = new NVAPI_GPU_PERF_DECREASE("NV_GPU_PERF_DECREASE_REASON_UNKNOWN", jnvapiJNI.NV_GPU_PERF_DECREASE_REASON_UNKNOWN_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NVAPI_GPU_PERF_DECREASE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NVAPI_GPU_PERF_DECREASE.class + " with value " + swigValue);
  }

  private NVAPI_GPU_PERF_DECREASE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NVAPI_GPU_PERF_DECREASE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NVAPI_GPU_PERF_DECREASE(String swigName, NVAPI_GPU_PERF_DECREASE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NVAPI_GPU_PERF_DECREASE[] swigValues = { NV_GPU_PERF_DECREASE_NONE, NV_GPU_PERF_DECREASE_REASON_THERMAL_PROTECTION, NV_GPU_PERF_DECREASE_REASON_POWER_CONTROL, NV_GPU_PERF_DECREASE_REASON_AC_BATT, NV_GPU_PERF_DECREASE_REASON_API_TRIGGERED, NV_GPU_PERF_DECREASE_REASON_INSUFFICIENT_POWER, NV_GPU_PERF_DECREASE_REASON_UNKNOWN };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

