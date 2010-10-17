package com.sixarm.java.lang;

/**
 * GetJavaInfo: return classpath info as user-friendly text,
 * suitable for displaying in an info dialog box for diagnostics.
 * @see GetJavaInfo
 * @see com.sixarm.lang.�#getJavaClasspathInfo
 */
public class GetJavaInfo implements $get<String>{

  /*****************************************************************************
   *                                                                           *
   *  List the Java system properties: version, vendor, OS, separators, etc.   *
   *  This is helpful for output to diagnostics, users, log files, etc.        *
   *  @return a string of diagnostics, formatted for easy human reading        *
   *                                                                           *
   ****************************************************************************/

  public static String info() {
    return ""
      +"Java "  +System.getProperty("java.version")
      +" class "  +System.getProperty("java.class.version")
      +"\n"       +System.getProperty("java.vendor")
      +"\n"       +System.getProperty("java.vendor.url")+"\n"
      +"\nOperating system is\n" +System.getProperty("os.name")
      +" on "     +System.getProperty("os.arch")
      +"";
  }

  public String get() {
    return info();
  }

}

