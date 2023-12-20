package pl.ozodbek.junittestingpractice.test_utils

object LoginUtils {


    private val validUserAndPassword = mapOf(
        "Ozodbek" to "Password123",
        "Azizbek" to "SecurePwd567",
        "Jahongir" to "Secret12345"
    )

    /**
     * The input is valid for login if...
     * ...the username and password are not empty
     * ...the username is registered
     * ...the password matches the registered password for the given username
     */

    fun validateLoginInput(username: String, password: String): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (validUserAndPassword[username] == null) {
            return false
        }
        return validUserAndPassword[username] == password
    }

}