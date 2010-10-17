package com.sixarm.java.lang;


/**
 * Arg failed because of a general reason,
 * typically as an illegal argument to a method
 * @mod
 * "1.0.0 2005-03-20 jph created this"
 */

public class XArg extends IllegalArgumentException implements $help {

 /**@svuid*/private static final long serialVersionUID=1L;


 public String help(){
  return "there is a problem with the arg. Verify how the arg is initialized and used.";
 }

 Object _failed=null;

 public XArg(Object failed){
  super();
  _failed=failed;
 }

 public XArg(String message, Throwable cause){
  super(message);
  initCause(cause);
 }

 public XArg(String message, Object failed){
  super(message);
  _failed=failed;
 }

 public XArg(String message, Throwable cause, Object failed){
  super(message);
  initCause(cause);
  _failed=failed;
 }

 public Object get(){
  return _failed;
 }

 @Override
 public String toString(){
  return super.toString()
  +": class "
  +_failed.getClass().getName()
  +((_failed==null)
   ?"==null"
   :((_failed instanceof Number)
    ?"=="+_failed
    :""
    )
   )
  +" "+help();
 }

}



