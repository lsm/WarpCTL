/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION {
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_LIMITED_RANGE = new NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION("NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_LIMITED_RANGE", jnvapiJNI.NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_LIMITED_RANGE_get());
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_FULL_RANGE = new NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION("NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_FULL_RANGE");
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_RESERVED02 = new NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION("NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_RESERVED02");
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_RESERVED03 = new NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION("NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_RESERVED03");
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_AUTO = new NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION("NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_AUTO", jnvapiJNI.NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_AUTO_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION.class + " with value " + swigValue);
  }

  private NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION(String swigName, NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION[] swigValues = { NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_LIMITED_RANGE, NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_FULL_RANGE, NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_RESERVED02, NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_RESERVED03, NV_INFOFRAME_FIELD_VALUE_AVI_YCCQUANTIZATION_AUTO };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

