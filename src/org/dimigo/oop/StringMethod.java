/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ StringMethod
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author hangeonho
 * @version 1.0.0
 * 
 */
public class StringMethod {
	
	public static void main(String[] args) {
						    //012345678 90 1 23
		String s = "abcdefgABCDEFG";
		
		System.out.println(s.length()); 								// 14
		System.out.println(s.substring(3)); 						// defgABCDEFG
		System.out.println(s.substring(3, 6)); 					// def
		System.out.println(s.indexOf("C")); 						// 9	
		System.out.println(s.charAt(7)); 								// A	
		System.out.println(s.concat("ABC"));					// abcdefgABCDEFGABC
		System.out.println("             ABC          ".trim()); 	// ABC
		System.out.println(s.toUpperCase()); 					// ABCDEFGABCDEFG
		System.out.println(s.toLowerCase()); 					// abcdefgabcdefg
		System.out.println(s.replace('a', 'A')); 					// AbcdefgABCDEFG
		System.out.println(s.startsWith("abc"));				// true
		System.out.println(s.endsWith("EFG"));	 			// true
	}

}
