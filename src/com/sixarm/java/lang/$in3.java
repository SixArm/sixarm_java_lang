package com.sixarm.java.lang;

/**
 * Index an item with three indexes, e.g. x,y,z
 * @param <INDEXABLE> any doubly-indexed collection, e.g. a 3D Matrix
 * @param <ELEMENT> the element that you will want to get from the collection.
 */
public interface $in3<INDEXABLE, ELEMENT> {

  /**
   *  Index an item
   * @param a any indexable collection, e.g. a List, Array, Vector
   * @param index1 the first index of the item to get
   * @param index2 the second index of the item to get
   * @param index3 the third index of the item to get
   * @return the item at index1, index2
   */
  ELEMENT in(INDEXABLE a, int index1, int index2, int index3);
}