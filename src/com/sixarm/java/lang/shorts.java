package com.sixarm.java.lang;
/*******************************************************************************
 *                                                                             *
 *  shorts: a short array                                                        *
 *                                                                             *
 ******************************************************************************/

public class shorts extends primitives implements $get<short[]>, $set<short[]> {
 short[] save = null;
 public shorts(){super();}
 public shorts(short[] set){super();set(set);}
 public short[] get(){return save;}
 public void set(short[] a){save=a;}
 public boolean equals(shorts that){return eq(this.get(),that.get());}
}
