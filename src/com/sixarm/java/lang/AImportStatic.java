package com.sixarm.java.lang;
/**                                                                              *
 *   AImportStatic is a class/method intended to be imported statically;
 *   typically these are common utility classes, helper methods, etc.
 * 
 * 
 *   =eg Helper class to print a banner message
 * 
 *   package my.com;
 *   AImportStatic public class Helper {
 * 
 *     public static banner(String s){
 *       System.out.println("**** "+s+" ***");
 *     }
 *     ...
 *   }
 * 
 * 
 *   =eg A class that uses Helper
 * 
 *   package your.com;
 *   import static my.com.Helper.*;
 *   class Foo {
 * 
 *     void Foo(){
 *       banner("Creating a new foo object");
 *       ...
 *     }
 *     ...
 *   }
 * 
 * 
 *   =warning When you use import static, you run into a tradeoff:
 *   you get easy readability and reusability, but this can make it
 *   more difficult to see which methods belong to which classes.
 *   In the example above, the Foo class doesn't have anything that
 *   says right up front where the _banner_ method comes from.
 *   The solution is to use a good IDE that can track this.
 */

public @interface AImportStatic {/**/}