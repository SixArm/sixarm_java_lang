package com.sixarm.java.lang;
/*******************************************************************************
 *                                                                             *
 *  floats: a float array                                                        *
 *                                                                             *
 ******************************************************************************/

public class floats extends primitives implements $get<float[]>, $set<float[]> {
 float[] save = null;
 public floats(){super();}
 public floats(float[] set){super();set(set);}
 public float[] get(){return save;}
 public void set(float[] a){save=a;}
 public boolean equals(floats that){return eq(this.get(),that.get());}
}
