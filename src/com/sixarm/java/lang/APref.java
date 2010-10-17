package com.sixarm.java.lang;
/*******************************************************************************
 *                                                                             *
 *  APref is developer hint that a class, method, or variable
 *  is involved with Preferences of the user and/or system.
 *
 *  =eg
 *
 *   @APref class MyClass {
 *
 *     @APref static final String key ="Hello"; // a lookup key
 *
 *     @APref String getHello() {
 *       return Preferences.userNodeForPackage(this).get(key);
 *     }
 *
 *   }
 *
 *
 *  @see java.util.prefs.Preferences
 *
 ******************************************************************************/

public @interface APref {/**/}