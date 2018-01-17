package com.zuehlke.cleancodeworkshop.removeduplication;

public class MathUtils {

	private MathUtils() {
	}

	public static boolean isDivisibleBy3(int number) {
		return number % 3 == 0;
	}

	public static boolean isDivisibleBy5(int number) {
		return number % 5 == 0;
	}
}
