package com.sixarm.java.lang;

/**
 * A simple filter, e.g. to compare two items                   
 * @param <A> any item
 */
public interface $is2<A, B> {

  /**
   * Evaluate a condition.
   * @return true if whatever condition is true
   */
  boolean is(A a, B b);
}