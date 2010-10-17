package com.sixarm.java.lang;
public interface IProgressFloat extends IProgress {
 public abstract void setProgressValue    (float val);
 public abstract void addProgressValue    (float val);
 public abstract void setProgressMinimum  (float min);
 public abstract void setProgressMaximum  (float max);
}

