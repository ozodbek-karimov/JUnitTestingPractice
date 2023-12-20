package pl.ozodbek.junittestingpractice.test_utils

object MathUtils {


    /**
     * Checks if the given number is a prime number.
     * Prime numbers are greater than 1 and divisible only by 1 and themselves.
     */
    fun isPrime(number: Int): Boolean {
        if (number <= 1) {
            return false
        }

        for (i in 2 until number) {
            if (number % i == 0) {
                // The number is divisible by a factor other than 1 and itself, not prime
                return false
            }
        }

        return true
    }

}