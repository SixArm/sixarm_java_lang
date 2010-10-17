package com.sixarm.java.lang;

/*******************************************************************************
 *                                                                             *
 *  Indicates this is item is in flux, i.e. will change in future versions.
 *  The value is a note for developers explaining what's going on and why.
 *
 *  This is guidance for developers who are learning these methods,
 *  and developers who are writing subclasses with overridden methods.
 *
 * @mod
 * 1.0.0 2005-03-20 jph created this
 ******************************************************************************/
public @interface AFlux {

  String value();
}