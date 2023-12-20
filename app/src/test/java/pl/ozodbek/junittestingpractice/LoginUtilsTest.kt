package pl.ozodbek.junittestingpractice

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import pl.ozodbek.junittestingpractice.test_utils.LoginUtils

class LoginUtilsTest {

    @Test
    fun `valid username and correct password returns true`() {
        val result = LoginUtils.validateLoginInput(
            "Ozodbek",
            "Password123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `empty username returns false`() {
        val result = LoginUtils.validateLoginInput(
            "",
            "Password123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = LoginUtils.validateLoginInput(
            "Ozodbek",
            ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `unregistered username returns false`() {
        val result = LoginUtils.validateLoginInput(
            "UnknownUser",
            "Password123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `incorrect password returns false`() {
        val result = LoginUtils.validateLoginInput(
            "Ozodbek",
            "WrongPassword"
        )

        assertThat(result).isFalse()
    }
}
