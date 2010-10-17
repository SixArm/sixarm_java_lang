package com.sixarm.java.lang;
/*******************************************************************************
 *                                                                             *
 *  booleans: a boolean array                                                        *
 *                                                                             *
 ******************************************************************************/

public class booleans extends primitives implements $get<boolean[]>, $set<boolean[]> {
 boolean[] save = null;
 public booleans(){super();}
 public booleans(boolean[] set){super();set(set);}
 public boolean[] get(){return save;}
 public void set(boolean[] a){save=a;}
 public boolean equals(booleans that){return eq(this.get(),that.get());}
}
