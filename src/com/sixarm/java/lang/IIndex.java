package com.sixarm.java.lang;

/*******************************************************************************
 *                                                                             *
 *  IIndex: get & set & size for an indexable group of objects                 *
 *  typically a list, array, collection, or fields of a database               *
 *
 *  EG                                                                      *
 *                                                                             *
 *  public class Me implements ÍIndex<Object> {                                *
 *                                                                             *
 *   String name;                                                              *
 *   Date   birthdate;                                                         *
 *   Color  eyecolor;                                                          *
 *                                                                             *
 *   public int size () {                                                      *
 *    return 3; // name, born, eyes                                            *
 *   }                                                                         *
 *                                                                             *
 *   public Object get (int i) {                                               *
 *    if (i==0) return name;                                                   *
 *    if (i==1) return born;                                                   *
 *    if (i==2) return eyes;                                                   *
 *    return null;                                                             *
 *   }                                                                         *
 *                                                                             *
 *   public void set (int i, Object val) {                                     *
 *    if (i==0) name = (String) val;                                           *
 *    if (i==1) born = (Date)   val;                                           *
 *    if (i==2) eyes = (Color)  val;                                           *
 *   }                                                                         *
 *                                                                             *
 *  }                                                                          *
 
 * @mod
"1.0.0 2005-05-06 jph created"
 *                                                                             *
 ******************************************************************************/

public interface IIndex<A> {

  /** Class name, version, date, and author; use this for diagnostics. @value */
  public static final String ¢="¢com.sixarm.all.ÍIndex 1.0.0 2005-05-06 jph@sixarm.com";


 /******************************************************************************
  *                                                                            *
  *  Return the size of the index, e.g. list.size() or array.length            *
  *                                                                            *
  *****************************************************************************/

 public abstract int size();

 /******************************************************************************
  *                                                                            *
  *  Get the object at an index, e.g. list.get(i) or array[i]                  *
  *                                                                            *
  *****************************************************************************/

 public abstract A get (int index);

 /******************************************************************************
  *                                                                            *
  *  Set the object at an index, e.g. list.set(i,value) or array[i]=value
  *  @return optionally return the previous value, if any
  *                                                                            *
  *****************************************************************************/

 public abstract A set (int index, A value);

}