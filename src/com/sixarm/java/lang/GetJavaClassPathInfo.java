package com.sixarm.java.lang;

/**
 * GetJavaClassPathInfo: return system info as user-friendly text,
 * suitable for displaying in an info dialog box for diagnostics.
 * @see GetJavaClasspathInfo
 * @see com.sixarm.lang.�#getJavaClasspathInfo
 */
public class GetJavaClassPathInfo implements $get<String> {

  /*****************************************************************************
   *                                                                           *
   *  List the Java classpath, formatted for easy reading one item per line.   *
   *  This is helpful for output to diagnostics, users, log files, etc.        *
   *  @return a string of the classpath, formatted for easy human reading      *
   *                                                                           *
   ****************************************************************************/
  public static String info() {
    return System.getProperty("java.class.path").replace(';', '\n');
  }

  public String get() {
    return info();
  }
}
