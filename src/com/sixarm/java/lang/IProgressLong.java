package com.sixarm.java.lang;
public interface IProgressLong extends IProgress {
 public abstract void setProgressValue    (long val);
 public abstract void addProgressValue    (long val);
 public abstract void setProgressMinimum  (long min);
 public abstract void setProgressMaximum  (long max);
}

