package com.sixarm.java.lang;

/*******************************************************************************
 *                                                                             *
 *  IDirty: e.g. if an object needs to be redrawn, or saved to disk, etc.      *
 *                                                                             *
 ******************************************************************************/


public interface IDirty {
 public abstract boolean isDirty ();
 public abstract boolean getDirty ();
 public abstract void setDirty (boolean isDirty);
}