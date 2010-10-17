package com.sixarm.java.lang;
/*******************************************************************************
 *                                                                             *
 *  doubles: a double array                                                        *
 *                                                                             *
 ******************************************************************************/

public class doubles extends primitives implements $get<double[]>, $set<double[]> {
 double[] save = null;
 public doubles(){super();}
 public doubles(double[] set){super();set(set);}
 public double[] get(){return save;}
 public void set(double[] a){save=a;}
 public boolean equals(doubles that){return eq(this.get(),that.get());}
}
