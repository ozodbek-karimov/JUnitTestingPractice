package pl.ozodbek.junittestingpractice.test_utils

object RegistrationUtil {

    private val existingUsers = listOf("Ozodbek", "Diyorbek", "Azizbek","Karim","Laziz","Asad")

    /**
     * the input is not valid if...
     * ...the username/password is not empty
     * ...the username is already taken
     * ...the confirm password is not the same as the real password
     * ...the password contains less then 2 digits
     * */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String,
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }

        return true
    }
}