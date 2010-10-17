package com.sixarm.java.lang;

/**
 * Get an object
 * @cf com.sixarm.java.lang.$set
 * @cf com.sixarm.java.lang.$get$set
 * @param <A> any item
 */
public interface $get<A> {

  /**
   * Get an item.
   * @return the item.
   */
  public A get();
}
