package com.sixarm.java.lang;

/**
 * Compare two items.
 * @param <A> any item
 */
public interface $compare<A> {

  /**
   * @param a1 any item 1
   * @param a2 any item 2
   * @return typically -1 if a1<a2, 0 if a1==a2, 1 if a1>a2
   * @eg
   *  int i = compare(item1,item2)
   */
  public int compare(A a1, A a2);
}

