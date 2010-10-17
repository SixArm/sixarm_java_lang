package com.sixarm.java.lang;
public interface IProgressDouble extends IProgress {
 public abstract void setProgressValue    (double val);
 public abstract void addProgressValue    (double val);
 public abstract void setProgressMinimum  (double min);
 public abstract void setProgressMaximum  (double max);
}

