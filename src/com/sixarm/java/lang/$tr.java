package com.sixarm.java.lang;

/**
 * Translate an item to the same type
 * @param <A> any type.
 */
public interface $tr<A> {

  /**
   * Translate an item
   * @param a any item
   * @return an item of the same class, translated
   * @eg
   *  tr("foo") => "bar"
   */
  A tr(A a);
}


