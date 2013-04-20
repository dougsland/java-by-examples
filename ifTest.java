/*
 * Copyright (C) 2013
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details
 */

public class ifTest {
	public static void main(String args[]){
		int magicNumber = 50;
		int secondNumber = 60;
	
		if (magicNumber == 10) {
			System.out.println("Magic Number is 10");
		} else if (magicNumber == 20) {
			System.out.println("Magic Number is 20");
		} else if (magicNumber == 50) {
			System.out.println("Magic Number is 50");
		} else {
			System.out.println("Cannot find Magic Number");
		}

		if ((magicNumber == 50) && (secondNumber == 60)) {
			System.out.println("MagicNumber = 50 and SecondNumber = 60");
		}

		if (!(magicNumber == 20) || (secondNumber == 30)) {
			System.out.println("MagicNumber is not 20 or 30");
		}
	}
}
