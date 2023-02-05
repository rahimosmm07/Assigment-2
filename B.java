package com.pro;

import java.util.*;

public class B {
	public static void main(String args[]) {
		Scanner newscanner = new Scanner(System.in);
		System.out.print("Enter totalgenerated : ");
		int consume = newscanner.nextInt();

		System.out.println(calculate(consume));
		newscanner.close();
	}

	public static int calculate(int totalgenerated) {

		if (totalgenerated > 300) {
			return (100 * 10) + (100 * 15) + (100 * 20) + (totalgenerated - 300) * 25;
		}

		else if (totalgenerated <= 300) {
			return (100 * 10) + (100 * 15) + (totalgenerated - 200) * 20;
		}

		else if (totalgenerated <= 200) {
			return (100 * 10) + (totalgenerated - 100) * 15;
		}

		else if (totalgenerated <= 100) {
			return totalgenerated * 10;
		}
		return 0;
	}

}
