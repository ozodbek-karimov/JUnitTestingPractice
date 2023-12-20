package pl.ozodbek.junittestingpractice

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import pl.ozodbek.junittestingpractice.test_utils.RegistrationUtil

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Umidjon",
            "1236",
            "1236"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Diyorbek",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly returned password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Karim",
            "12356",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Laziz",
            "",
            ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digits password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Asad",
            "asdasd4",
            "asdasda5"
        )

        assertThat(result).isFalse()
    }

}