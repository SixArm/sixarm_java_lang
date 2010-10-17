package com.sixarm.java.lang;
/*******************************************************************************
 *                                                                             *
 *  chars: a char array                                                        *
 *                                                                             *
 ******************************************************************************/

public class chars extends primitives implements $get<char[]>, $set<char[]> {
 char[] save = null;
 public chars(){super();}
 public chars(char[] set){super();set(set);}
 public char[] get(){return save;}
 public void set(char[] a){save=a;}
 public boolean equals(chars that){return eq(this.get(),that.get());}
}
