/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvml;

public final class nvmlClockType_t {
  public final static nvmlClockType_t NVML_CLOCK_GRAPHICS = new nvmlClockType_t("NVML_CLOCK_GRAPHICS", jnvmlJNI.NVML_CLOCK_GRAPHICS_get());
  public final static nvmlClockType_t NVML_CLOCK_SM = new nvmlClockType_t("NVML_CLOCK_SM", jnvmlJNI.NVML_CLOCK_SM_get());
  public final static nvmlClockType_t NVML_CLOCK_MEM = new nvmlClockType_t("NVML_CLOCK_MEM", jnvmlJNI.NVML_CLOCK_MEM_get());
  public final static nvmlClockType_t NVML_CLOCK_COUNT = new nvmlClockType_t("NVML_CLOCK_COUNT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static nvmlClockType_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + nvmlClockType_t.class + " with value " + swigValue);
  }

  private nvmlClockType_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private nvmlClockType_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private nvmlClockType_t(String swigName, nvmlClockType_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static nvmlClockType_t[] swigValues = { NVML_CLOCK_GRAPHICS, NVML_CLOCK_SM, NVML_CLOCK_MEM, NVML_CLOCK_COUNT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

