package com.sixarm.java.lang;
public interface IProgressInt extends IProgress {
 public abstract void setProgressValue    (int val);
 public abstract void addProgressValue    (int val);
 public abstract void setProgressMinimum  (int min);
 public abstract void setProgressMaximum  (int max);
}

