package pl.ozodbek.junittestingpractice

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import pl.ozodbek.junittestingpractice.test_utils.MathUtils

class MathUtilsTest{


    @Test
    fun `test if 7 is a prime number`() {
        val result = MathUtils.isPrime(7)

        assertThat(result).isTrue()
    }

    @Test
    fun `test if 10 is not a prime number`() {
        val result = MathUtils.isPrime(10)

        assertThat(result).isFalse()
    }

    @Test
    fun `test if 1 is not a prime number`() {
        val result = MathUtils.isPrime(1)

        assertThat(result).isFalse()
    }


}