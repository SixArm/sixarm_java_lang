package com.sixarm.java.lang;

/**
 * primitives: array of primitives
 */
public abstract class primitives{
  /*T*/ public static boolean eq  (final boolean  a[], final boolean  b[]){ if(a==b){return true;}  if(a==null||b==null||a.length!=b.length){return false;} for(int i=0; i<a.length; i++){if (a[i]!=b[i]){return false;}} return true;}
  /*T*/ public static boolean eq  (final byte     a[], final byte     b[]){ if(a==b){return true;}  if(a==null||b==null||a.length!=b.length){return false;} for(int i=0; i<a.length; i++){if (a[i]!=b[i]){return false;}} return true;}
  /*T*/ public static boolean eq  (final char     a[], final char     b[]){ if(a==b){return true;}  if(a==null||b==null||a.length!=b.length){return false;} for(int i=0; i<a.length; i++){if (a[i]!=b[i]){return false;}} return true;}
  /*T*/ public static boolean eq  (final int      a[], final int      b[]){ if(a==b){return true;}  if(a==null||b==null||a.length!=b.length){return false;} for(int i=0; i<a.length; i++){if (a[i]!=b[i]){return false;}} return true;}
  /*T*/ public static boolean eq  (final short    a[], final short    b[]){ if(a==b){return true;}  if(a==null||b==null||a.length!=b.length){return false;} for(int i=0; i<a.length; i++){if (a[i]!=b[i]){return false;}} return true;}
  /*T*/ public static boolean eq  (final long     a[], final long     b[]){ if(a==b){return true;}  if(a==null||b==null||a.length!=b.length){return false;} for(int i=0; i<a.length; i++){if (a[i]!=b[i]){return false;}} return true;}
  /*T*/ public static boolean eq  (final float    a[], final float    b[]){ if(a==b){return true;}  if(a==null||b==null||a.length!=b.length){return false;} for(int i=0; i<a.length; i++){if (a[i]!=b[i]){return false;}} return true;}
  /*T*/ public static boolean eq  (final double   a[], final double   b[]){ if(a==b){return true;}  if(a==null||b==null||a.length!=b.length){return false;} for(int i=0; i<a.length; i++){if (a[i]!=b[i]){return false;}} return true;}
}
