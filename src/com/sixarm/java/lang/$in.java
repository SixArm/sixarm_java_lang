package com.sixarm.java.lang;

/**
 * Index an item
 * @param <INDEXABLE> any indexable collection, e.g. a List, Array, Vector
 * @param <ELEMENT> the element that you will want to get from the collection.
 */
public interface $in<INDEXABLE, ELEMENT> {

  /**
   *  Index an item
   * @param a any indexable collection, e.g. a List, Array, Vector
   * @param index the index of the item to get
   * @return the item at the index
   */
  ELEMENT in(INDEXABLE a, int index);
}