package com.utilityservice;

/**
 * Code Description: To determine prime factors for a given no
 * 
 * Creation Date: 16-Jan-2018
 * 
 * Version: 1.0
 * 
 * @author Pradeepkumar M Vishwakarma
 */

public class PrimeFactor {

	private static final String MSG_SUCCESS = "Prime factor(s) are: ";
	private static final String MSG_PRIME_NUMBER = "Given number itself is a prime number, hence prime factors can not be determined.";
	private static final String MSG_ERROR = "Exception occurred. ";

	/**
	 * 
	 * @param numString
	 * @return
	 */
	public static String getPrimeFactors(String numString) {

		/**
		 * StringBuilder is used to print the prime factors
		 */
		StringBuilder stb = new StringBuilder();

		try {
			String respMsg = PrimeFactorValidation.validate(numString);
			if (!respMsg.equalsIgnoreCase("SUCCESS")) {
				return respMsg;
			}
			long number = Long.valueOf(numString);
			long inputNumber = number;

			// calculate prime factors of given number
			for (long i = 2; i <= number / i; i++) {

				while (number % i == 0) {
					number = number / i;
					stb.append(i).append(" ");
				}

			}

			if (number > 1) {
				stb.append(number).append(" ");
			}

			// Check if number itself is a prime number
			if (String.valueOf(inputNumber).equals(stb.toString().trim())) {
				return MSG_PRIME_NUMBER;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return MSG_ERROR;
		}

		return MSG_SUCCESS + stb.toString();
	}

}
