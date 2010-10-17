package com.sixarm.java.lang;

/**
 * Load, Save, Wipe an object
 * @param <A> any item
 */
public interface $load$save$wipe<A> {

  /**
   * Load an item-- whatever that means in your context.
   */
  public void load();

  /**
   * Save an item-- whatever that means in your context.
   */
  public void save();

  /**
   * Wipe an item-- whatever that means in your context.
   */
  public void wipe();
}
