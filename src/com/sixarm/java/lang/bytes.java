package com.sixarm.java.lang;
/*******************************************************************************
 *                                                                             *
 *  bytes: a byte array                                                        *
 *                                                                             *
 ******************************************************************************/

public class bytes extends primitives implements $get<byte[]>, $set<byte[]> {
 byte[] save = null;
 public bytes(){super();}
 public bytes(byte[] set){super();set(set);}
 public byte[] get(){return save;}
 public void set(byte[] a){save=a;}
 public boolean equals(bytes that){return eq(this.get(),that.get());}
}
