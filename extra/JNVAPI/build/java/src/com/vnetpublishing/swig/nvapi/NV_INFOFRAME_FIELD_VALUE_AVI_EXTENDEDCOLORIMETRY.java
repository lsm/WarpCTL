/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vnetpublishing.swig.nvapi;

public final class NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY {
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_XVYCC601 = new NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY("NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_XVYCC601", jnvapiJNI.NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_XVYCC601_get());
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_XVYCC709 = new NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY("NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_XVYCC709");
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_SYCC601 = new NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY("NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_SYCC601");
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_ADOBEYCC601 = new NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY("NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_ADOBEYCC601");
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_ADOBERGB = new NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY("NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_ADOBERGB");
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_RESERVED05 = new NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY("NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_RESERVED05");
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_RESERVED06 = new NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY("NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_RESERVED06");
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_RESERVED07 = new NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY("NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_RESERVED07");
  public final static NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_AUTO = new NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY("NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_AUTO", jnvapiJNI.NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_AUTO_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY.class + " with value " + swigValue);
  }

  private NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY(String swigName, NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY[] swigValues = { NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_XVYCC601, NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_XVYCC709, NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_SYCC601, NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_ADOBEYCC601, NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_ADOBERGB, NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_RESERVED05, NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_RESERVED06, NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_RESERVED07, NV_INFOFRAME_FIELD_VALUE_AVI_EXTENDEDCOLORIMETRY_AUTO };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
