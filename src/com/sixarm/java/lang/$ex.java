package com.sixarm.java.lang;

/**
 * If an item fails a test then throw an exception
 * @param <A> any item
 */
public interface $ex<A> {

  /**
   * If an item fails a test then throw an exception.
   * @param a any item
   * @return the exception to throw
   */
  public Exception ex(A a);
}