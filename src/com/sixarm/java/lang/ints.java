package com.sixarm.java.lang;
/*******************************************************************************
 *                                                                             *
 *  ints: a int array                                                        *
 *                                                                             *
 ******************************************************************************/

public class ints extends primitives implements $get<int[]>, $set<int[]> {
 int[] save = null;
 public ints(){super();}
 public ints(int[] set){super();set(set);}
 public int[] get(){return save;}
 public void set(int[] a){save=a;}
 public boolean equals(ints that){return eq(this.get(),that.get());}
}
