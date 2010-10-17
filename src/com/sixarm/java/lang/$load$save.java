package com.sixarm.java.lang;

/**
 * Load, Save an object
 * @param <A> any item
 */
public interface $load$save<A> {

  /**
   * Load an item-- whatever that means in your context.
   */
  public void load();

  /**
   * Save an item-- whatever that means in your context.
   */
  public void save();
}
