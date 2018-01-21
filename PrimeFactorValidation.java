package com.utilityservice;

public class PrimeFactorValidation {

	private static final String MSG_INVALID_INPUT = "Prime factors can not be determined for the given input. Kindly provide any absolute no, which is greater than 1.";
	private static final String MSG_INPUTLENGTH_ERROR = "Input length is exceeded. Please provide value upto 9223372036854775807.";
	private static final String MSG_ERROR = "Exception occurred. ";

	public static String validate(String numString) {

		try {
			// Check if given input string is null
			if (numString == null || numString.length() == 0) {
				return MSG_INVALID_INPUT;
			}

			// Accept only positive Integer
			if (!numString.matches("\\d+")) {
				return MSG_INVALID_INPUT;
			}

			// Long accept value is less than or equal to (2^63 - 1)
			long number = Long.valueOf(numString);

			// If number less than 2, prompt the appropriate message.
			if (number < 2) {
				return MSG_INVALID_INPUT;
			}
		} catch (NumberFormatException nfte) {
			return MSG_INPUTLENGTH_ERROR;
		} catch (Exception e) {
			e.printStackTrace();
			return MSG_ERROR;

		}

		return "SUCCESS";
	}

}
