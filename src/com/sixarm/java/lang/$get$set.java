package com.sixarm.java.lang;

/**
 * Get and set an object
 * @cf com.sixarm.java.lang.$get                                                   
 * @cf com.sixarm.java.lang.$set                                                   
 * @cf com.sixarm.java.lang.$get$set                                                                                                                           
 * @param <A> any item
 */
public interface $get$set<A> {

  /**
   * Get an item.
   * @return the item.
   */
  public A get();

  /**
   * Set an item.
   * @param a any item.
   */
  public void set(A a);
}
