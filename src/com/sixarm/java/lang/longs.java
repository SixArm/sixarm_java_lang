package com.sixarm.java.lang;
/*******************************************************************************
 *                                                                             *
 *  longs: a long array                                                        *
 *                                                                             *
 ******************************************************************************/

public class longs extends primitives implements $get<long[]>, $set<long[]> {
 long[] save = null;
 public longs(){super();}
 public longs(long[] set){super();set(set);}
 public long[] get(){return save;}
 public void set(long[] a){save=a;}
 public boolean equals(longs that){return eq(this.get(),that.get());}
}
