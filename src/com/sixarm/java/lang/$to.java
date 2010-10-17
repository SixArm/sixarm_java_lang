package com.sixarm.java.lang;

/**
 * Map an item to another item.
 * @param <K> any type for the key, i.e. the input object
 * @param <V> any type for the value, i.e. the output object
 */
public interface $to<K, V> {

  /**
   * Map an item to another item.
   * @param o any object for input
   * @return the output object (the result of the mapping)
   */
  V to(K o);
}