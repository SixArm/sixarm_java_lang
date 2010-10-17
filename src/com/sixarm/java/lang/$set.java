package com.sixarm.java.lang;

/**
 * Set an object.
 * @cf com.sixarm.java.lang.$get
 * @cf com.sixarm.java.lang.$get$set
 * @param <A> any type
 */
public interface $set<A> {

  /**
   * Set an item-- whatever that means in your context.
   * @param a any object.
   */
  public void set(A a);
}
