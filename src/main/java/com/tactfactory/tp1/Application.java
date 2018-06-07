/* Copyright Pauchard Thomas 07/06/2018 */

package com.tactfactory.tp1;

import org.joda.time.DateTime;

/**
 * My main Application.
 * @author Thomas
 * @version 1.0
 */
public class Application {
	
	/**
	 * Entry point of application.
	 * @param args Arguments from CLI
	 */
	public static void main(String[] args){
		System.out.println("Hello W !!");
		DateTime dateTime = DateTime.now();
	}
	
	/**
	 * Add two value.
	 * @param i first value
	 * @param j second value
	 * @return result of addition
	 */
	public static int add(int i, int j)
	{
		return i + j;
	}
}