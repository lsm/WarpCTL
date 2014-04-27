/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.adl;

public final class ADLPanningMode {
  public final static ADLPanningMode ADL_PANNINGMODE_NO_PANNING = new ADLPanningMode("ADL_PANNINGMODE_NO_PANNING", jadl_sdkJNI.ADL_PANNINGMODE_NO_PANNING_get());
  public final static ADLPanningMode ADL_PANNINGMODE_AT_LEAST_ONE_NO_PANNING = new ADLPanningMode("ADL_PANNINGMODE_AT_LEAST_ONE_NO_PANNING", jadl_sdkJNI.ADL_PANNINGMODE_AT_LEAST_ONE_NO_PANNING_get());
  public final static ADLPanningMode ADL_PANNINGMODE_ALLOW_PANNING = new ADLPanningMode("ADL_PANNINGMODE_ALLOW_PANNING", jadl_sdkJNI.ADL_PANNINGMODE_ALLOW_PANNING_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ADLPanningMode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ADLPanningMode.class + " with value " + swigValue);
  }

  private ADLPanningMode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ADLPanningMode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ADLPanningMode(String swigName, ADLPanningMode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ADLPanningMode[] swigValues = { ADL_PANNINGMODE_NO_PANNING, ADL_PANNINGMODE_AT_LEAST_ONE_NO_PANNING, ADL_PANNINGMODE_ALLOW_PANNING };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
