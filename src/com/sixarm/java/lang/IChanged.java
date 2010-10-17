package com.sixarm.java.lang;

/*******************************************************************************
 *                                                                             *
 *  Track if an item has changed.                                              *
 *                                                                             *
 *  @list                                                                      *
 *  - a collection has elements added or removed                               *
 *  - a field has a new value                                                  *
 *  - a graphic needs redrawing                                                *
 *                                                                             *
 *                                                                             *
 *  @boilerplate                                                               *
 *  ///IChanged                                                              *
 *  public boolean isChanged=false;                                            *
 *  public boolean isChanged()           {return isChanged;}                   *
 *  public boolean setChanged(boolean b) {return isChanged=b;}                 *
 *  public boolean addChanged(boolean b) {return isChanged|=b;}                *
 *                                                                             *
 ******************************************************************************/

public interface IChanged {
 public boolean isChanged();
 public boolean setChanged(boolean b);
 public boolean addChanged(boolean b);
}
