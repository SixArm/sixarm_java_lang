/*
 * K.java
 */
package com.sixarm.java.lang;

@AImportStatic public abstract class K {
  
  public static final String ¢="¢"; //$NON-NLS-1$
  
  
  //===========================================================================/
  //                                                                           /
  //  Constants                                                                /
  //                                                                           /
  //===========================================================================/
  
  
  /// Constants for parameters, loops, etc.
  
  public static final boolean     CHANGED    = true;
  public static final boolean     SUCCESS    = true;
  public static final boolean     FAILURE    = false;
  public static final boolean     RECURSE    = true;
  public static final boolean     SHOW       = true;
  public static final boolean     HIDE       = false;
  public static final boolean     YES        = true;
  public static final boolean     NO         = false;
  public static final boolean     FAST       = true;
  public static final boolean     SLOW       = false;
  
  
  /// Constants for classes
  
  public static final Boolean TRUE  = new Boolean(true);
  public static final Boolean FALSE = new Boolean(false);
  
  /// Constants for math                                                       /
  
  public static final double PI_SQRT     = Math.sqrt(Math.PI);
  public static final double FEIGENBAUM1 = 4.6692016091;
  public static final double FEIGENBAUM2 = 2.5029078750;
  public static final double GOLDENRATIO = 1.618033;
  
  
  /// Constants for characters                                                 /
  
  /**@ib @value*/  public static final char[] DIGIT_CHARS  = "0123456789".toCharArray();
  /**@ib @value*/  public static final char[] LOWERCASE_CHARS  = "abcdefghijklmnopqrstuvwxyz".toCharArray();
  /**@ib @value*/  public static final char[] UPPERCASE_CHARS  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  /**@ib @value*/  public static final char[] LETTER_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
  /**@ib @value*/  public static final char[] WORD_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_0123456789".toCharArray();
  /**@ib @value*/  public static final char[] WHITESPACE_CHARS = " \n\r\t".toCharArray();
  
  
  /*****************************************************************************
   *                                                                           *
   *  Constants for conversions                                                *
   *                                                                           *
   ****************************************************************************/
  
  /**@ib @value*/  public static final double CM_PER_INCH        = 2.54;
  /**@ib @value*/  public static final int    DAYS_PER_YEAR      = 365;
  /**@ib @value*/  public static final int    DAYS_PER_LEAPYEAR  = 366;
  /**@ib @value*/  public static final int    DAYS_PER_WEEK      = 7;
  /**@ib @value*/  public static final int    CIRCLE_DEGREES     = 360;

  
  // Special result codes

  public static final Exception FAIL = new Exception();
  public static final int OK = 0;


/*******************************************************************************
 *                                                                             *
 *  Nulls & Nones & Exceptions                                                 *
 *                                                                             *
 *  To make your code easier to read and more typesafe,                        *
 *  replace each "null" with a strongly-typed constant:                        *
 *                                                                             *
 *  =src foo(null,null,null);                                                 *
 *  =new foo(no_File,no_String,no_Boolean);                                         *
 *                                                                             *
 *  Our notation uses "no_" as a prefix for "null" like this:                    *
 *                                                                             *
 *  =src                                                                      *
 *  public static final Integer no_Integer = null;                               *
 *  public static final String  no_String  = null;                               *
 *  public static final File    no_File    = null;                               *
 *  ...                                                                        *
 *                                                                             *
 *  To make your variables easier to understand:                               *
 *                                                                             *
 *  =old if (i==-1)                                                           *
 *  =new if (i==no_index)                                                       *
 *                                                                             *
 *  =old if (e==null)                                                         *
 *  =new if (e==no_Exception)                                                   *
 *                                                                             *
 * @mod
 * 1.1.1 2006-01-25 jph added no_depth, no_checksum
 * 1.1.0 2005-05-11 jph added exception thrower no_ methods & documentation
 * 1.0.2 2005-04-19 jph added more items
 * 1.0.0 2005-03-20 jph new
 ******************************************************************************/

  // Null typesafes                                                            /

  public static final Boolean                     no_Boolean        = null;
  public static final Byte                        no_Byte           = null;
  public static final Character                   no_Character      = null;
  public static final Integer                     no_Integer        = null;
  public static final Short                       no_Short          = null;
  public static final Long                        no_Long           = null;
  public static final Float                       no_Float          = null;
  public static final Double                      no_Double         = null;
  public static final Number                      no_Number         = null;
  public static final Object                      no_Object         = null;
  public static final Enum<?>                     no_Enum           = null;
  public static final Class<?>                    no_Class          = null;
  public static final Package                     no_Package        = null;
  public static final String                      no_String         = null;
  public static final StringBuffer                no_StringBuffer   = null;
  public static final StringBuilder               no_StringBuilder  = null;
  public static final Throwable                   no_Throwable      = null;
  public static final Error                       no_Error          = null;
  public static final Exception                   no_Exception      = null;
  public static final Thread                      no_Thread         = null;
  public static final ThreadGroup                 no_ThreadGroup    = null;
  public static final ThreadLocal<?>              no_ThreadLocal    = null;
  public static final Thread.State                no_ThreadState    = null;

  // Null arrays

  public static final boolean []  no_booleans  =null;
  public static final char    []  no_chars     =null;
  public static final byte    []  no_bytes     =null;
  public static final short   []  no_shorts    =null;
  public static final long    []  no_longs     =null;
  public static final int     []  no_ints      =null;
  public static final float   []  no_floats    =null;
  public static final double  []  no_doubles   =null;


  // Null mnemonics

  public static final Throwable     no_cause      = null;
  public static final Class[]       no_types      = null;
  public static final String        no_message    = null;
  public static final String        no_prefix     = null;
  public static final String        no_suffix     = null;
  public static final int           no_count      = -1;
  public static final int           no_location   = -1;
  public static final int           no_length     = -1;
  public static final int           no_index      = -1;
  public static final long          no_time       = -1;
  public static final long          no_size       = -1;
  public static final int           no_width      = -1;
  public static final int           no_height     = -1;
  public static final int           no_depth      = -1;
  public static final int           no_checksum   = -1;

}
