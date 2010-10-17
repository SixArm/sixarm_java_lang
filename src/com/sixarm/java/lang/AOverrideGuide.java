package com.sixarm.java.lang;
/*******************************************************************************
 *                                                                             *
 *  Indicates a method that is overridden fairly often;
 *  this is to guide developers who are learning methods
 *  and/or developing their own subclasses and methods.
 *
 *  @see AOverrideSeldom
 *
 ******************************************************************************/

public @interface AOverrideGuide {
  /** When to override this class/method/etc. */
  String[] value();
}