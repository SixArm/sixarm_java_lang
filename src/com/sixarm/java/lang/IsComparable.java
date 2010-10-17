package com.sixarm.java.lang;

/**
 * Filter to compare two objects of the same type.
 *
 * A typical use is to "remember" one object and compare it to many others,
 * for example remembering a target string and trying to find it in a list.
 *
 */
public abstract class IsComparable<A extends Comparable<A>> implements $is1<A> {

 A compared;
 
 public IsComparable(A áCompared){
  this.compared=áCompared;
 }

 public A getCompared(){
	  return compared;	 
}

 public void setCompared(A áCompared){
	  this.compared=áCompared;	 
 }
 
 public abstract boolean is1 (A a);

}

